public class FacebookFactory extends SocialNetworkFactory {
    @Override
    public SocialNetwork createSocialNetwork() {
        return new Facebook();
    }
}
