public abstract class EntityUpdateProcessor {

    public final void updateEntity() {
        Object entity = getEntity();
        if (validateData(entity)) {
            saveData(entity);
            sendResponse(200, "Success", getAdditionalResponseData());
        } else {
            handleValidationFailure(entity);
            sendResponse(400, "Validation failed", null);
        }
    }

    public abstract Object getEntity();
    protected abstract boolean validateData(Object entity);
    protected abstract void saveData(Object entity);
    protected abstract void handleValidationFailure(Object entity);


    protected Object getAdditionalResponseData() { // Hook for getting additional data
        return null;
    }

    private void sendResponse(int statusCode, String status, Object additionalData) {
        System.out.printf("%d, %s, %s\n", statusCode, status, additionalData);
    }
}
