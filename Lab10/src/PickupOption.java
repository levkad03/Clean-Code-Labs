public class PickupOption extends Component {

    private boolean isPickup;

    public void setPickup(boolean isPickup) {
        this.isPickup = isPickup;
        notifyMediator("pickupChanged");
    }

    public boolean isPickup() {
        return isPickup;
    }
}
