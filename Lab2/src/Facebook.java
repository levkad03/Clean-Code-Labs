public class Facebook implements SocialNetwork {

    private String username;
    private String password;

    @Override
    public void login(String username, String password) {
        this.username = username;
        this.password = password;

        System.out.println("Logged in Facebook with username: " + this.username);
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Sent message in Facebook: " + message);
    }
}
