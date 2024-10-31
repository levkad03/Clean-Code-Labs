import java.util.ArrayList;
import java.util.List;

public class OrderMediator implements Mediator {

    private DatePicker datePicker;
    private TimeSlotPicker timeSlotPicker;
    private ReceiverInfo receiverInfo;
    private PickupOption pickupOption;

    public OrderMediator(DatePicker datePicker, TimeSlotPicker timeSlotPicker, ReceiverInfo receiverInfo, PickupOption pickupOption) {
        this.datePicker = datePicker;
        this.timeSlotPicker = timeSlotPicker;
        this.receiverInfo = receiverInfo;
        this.pickupOption = pickupOption;

        this.datePicker.setMediator(this);
        this.timeSlotPicker.setMediator(this);
        this.receiverInfo.setMediator(this);
        this.pickupOption.setMediator(this);
    }

    @Override
    public void notify(Component sender, String event) {
        switch (event) {
            case "dateChanged":
                updateAvailableTimeSlots();
                break;
            case "receiverInfoChanged":
                checkReceiverInfo();
                break;
            case "pickupChanged":
                toggleDeliveryOptions();
                break;
        }
    }

    private void updateAvailableTimeSlots() {
        String selectedDate = datePicker.getSelectedDate();
        List<String> timeSlots = new ArrayList<>();

        if ("2024-11-01".equals(selectedDate)) {
            timeSlots.add("10:00 - 12:00");
            timeSlots.add("14:00 - 16:00");
        } else if ("2024-11-02".equals(selectedDate)) {
            timeSlots.add("12:00 - 14:00");
            timeSlots.add("16:00 - 18:00");
        }

        timeSlotPicker.setAvailableTimeSlots(timeSlots);
        System.out.println("Available time slots for " + selectedDate + ": " + timeSlots);
    }

    private void checkReceiverInfo() {
        if (receiverInfo.isOtherPerson()) {
            System.out.println("Receiver is another person. Name and Phone fields are required.");
        } else {
            System.out.println("Receiver is the customer. No extra info required.");
        }
    }

    private void toggleDeliveryOptions() {
        if (pickupOption.isPickup()) {
            System.out.println("Pickup selected. Delivery options are disabled.");
        } else {
            System.out.println("Delivery selected. Delivery options are enabled.");
        }
    }
}
