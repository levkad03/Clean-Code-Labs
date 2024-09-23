public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification("admin@example.com");
        emailNotification.send("System Alert", "Virus detected");

        Notification slackNotification = new SlackNotificationAdapter("user_login", "api_key", "chat123");
        slackNotification.send("New Update", "New Version is released!");

        Notification smsNotification = new SmsNotificationAdapter("1234567890", "MyCompany");
        smsNotification.send("Service Alert", "Your subscription is expiring soon.");
    }
}