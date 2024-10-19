public class Main {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();

        context.setDeliveryStrategy(new PickupStrategy());
        System.out.println("Pickup price: " + context.calculateCost(10, 5));

        context.setDeliveryStrategy(new ExternalDeliveryStrategy());
        System.out.println("External delivery price: " + context.calculateCost(10, 5));

        context.setDeliveryStrategy(new InternalDeliveryStrategy());
        System.out.println("Internal delivery price: " + context.calculateCost(10, 5));
    }
}