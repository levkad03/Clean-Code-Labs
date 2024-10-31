public class Main {
    public static void main(String[] args) {
        DatePicker datePicker = new DatePicker();
        TimeSlotPicker timeSlotPicker = new TimeSlotPicker();
        ReceiverInfo receiverInfo = new ReceiverInfo();
        PickupOption pickupOption = new PickupOption();

        OrderMediator mediator = new OrderMediator(datePicker, timeSlotPicker, receiverInfo, pickupOption);
        datePicker.selectDate("2024-11-01");
        receiverInfo.setOtherPerson(true);
        pickupOption.setPickup(true);
    }
}