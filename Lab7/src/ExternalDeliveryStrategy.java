public class ExternalDeliveryStrategy implements DeliveryStrategy {
    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return distance * 2 + weight * 0.5;
    }
}
