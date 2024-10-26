public class OrderUpdateProcessor extends EntityUpdateProcessor {
    @Override
    public Object getEntity() {
        // Return Order entity
        return new Order();
    }

    @Override
    protected boolean validateData(Object entity) {
        // Handle order data validation
        return true;
    }

    @Override
    protected void saveData(Object entity) {
        System.out.println("Saving Order data");
    }

    @Override
    protected void handleValidationFailure(Object entity) {
        System.out.println("Handling order data validation failure");
    }

    @Override
    protected Object getAdditionalResponseData() {
        // return order in JSON
        return "{Order JSON}";
    }
}
