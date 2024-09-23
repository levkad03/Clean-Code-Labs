public class SlackNotificationAdapter implements Notification {

    private SlackService slackService;

    public SlackNotificationAdapter(String login, String  apiKey, String chatId) {
        this.slackService = new SlackService(login, apiKey, chatId);
    }

    @Override
    public void send(String title, String message) {
        slackService.sendMessage(title, message);
    }
}
