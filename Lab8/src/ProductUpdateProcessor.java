public class ProductUpdateProcessor extends EntityUpdateProcessor {
    @Override
    public Object getEntity() {
        // Return the product
        return new Product();
    }

    @Override
    protected boolean validateData(Object entity) {
        // Validate product data
        return true;
    }

    @Override
    protected void saveData(Object entity) {
        System.out.println("Saving product");
    }

    @Override
    protected void handleValidationFailure(Object entity) {
        System.out.println("Sending notification to messenger");
    }
}
