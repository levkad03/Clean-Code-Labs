public class InternalDeliveryStrategy implements DeliveryStrategy {
    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return distance * 1.5 + weight * 0.3;
    }
}
