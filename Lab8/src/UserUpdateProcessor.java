public class UserUpdateProcessor extends EntityUpdateProcessor {
    @Override
    public Object getEntity() {
        // Get user entity
        return new User();
    }

    @Override
    protected boolean validateData(Object entity) {
        // Validate user data
        return true;
    }

    @Override
    protected void saveData(Object entity) {
        System.out.println("Saving user data forbidding email update");
    }

    @Override
    protected void handleValidationFailure(Object entity) {
        System.out.println("Handling user validation failure");
    }
}
