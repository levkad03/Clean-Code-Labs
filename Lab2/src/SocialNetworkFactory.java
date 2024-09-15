public abstract class SocialNetworkFactory {
    public abstract SocialNetwork createSocialNetwork();

    public void post(String login, String password, String message) {
        SocialNetwork network = createSocialNetwork();
        network.login(login, password);
        network.postMessage(message);
    }
}
