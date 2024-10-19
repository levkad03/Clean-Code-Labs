public class DeliveryContext {
    private DeliveryStrategy deliveryStrategy;

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public double calculateCost(double distance, double weight) {
        if (deliveryStrategy == null) {
            throw new IllegalStateException("Delivery strategy not set");
        }
        return deliveryStrategy.calculateDeliveryCost(distance, weight);
    }
}