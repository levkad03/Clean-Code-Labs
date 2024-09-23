public class SlackService {
    private String login;
    private String apiKey;
    private String chatId;

    public SlackService(String login, String apiKey, String chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    public void sendMessage(String title, String message) {
        System.out.println("Sent Slack message to chatId '" + chatId + "' with title '" + title + "' and message '" + message + "'.");
    }
}
