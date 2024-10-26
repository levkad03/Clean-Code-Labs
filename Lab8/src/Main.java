public class Main {
    public static void main(String[] args) {
        EntityUpdateProcessor productProcessor = new ProductUpdateProcessor();
        productProcessor.updateEntity();

        EntityUpdateProcessor userProcessor = new UserUpdateProcessor();
        userProcessor.updateEntity();

        EntityUpdateProcessor orderProcessor = new OrderUpdateProcessor();
        orderProcessor.updateEntity();
    }
}