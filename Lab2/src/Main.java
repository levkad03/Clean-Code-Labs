public class Main {
    public static void main(String[] args) {
        SocialNetworkFactory facebookFactory = new FacebookFactory();
        facebookFactory.post("user_fb", "password_fb", "Hello Facebook!");

        SocialNetworkFactory linkedInFactory = new LinkedInFactory();
        linkedInFactory.post("user_li@example.com", "password_li", "Hello LinkedIn!");
    }
}