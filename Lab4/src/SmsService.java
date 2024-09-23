public class SmsService {
    private String phone;
    private String sender;

    public SmsService(String phone, String sender) {
        this.phone = phone;
        this.sender = sender;
    }

    public void sendSms(String title, String message) {
        System.out.println("Sent SMS from '" + sender + "' to '" + phone + "' with message '" + message + "'.");
    }
}
