public class SmsNotificationAdapter implements Notification {

    private SmsService smsService;

    public SmsNotificationAdapter(String phone, String sender) {
        this.smsService = new SmsService(phone, sender);
    }

    @Override
    public void send(String title, String message) {
        smsService.sendSms(title, message);
    }
}
