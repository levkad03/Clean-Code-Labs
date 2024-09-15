public class LinkedIn implements SocialNetwork{

    private String email;
    private String password;

    @Override
    public void login(String email, String password) {
        this.email = email;
        this.password = password;
        System.out.println("Logged in LinkedIn with email: " + this.email);
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Sent message in LinkedIn: " + message);
    }
}
