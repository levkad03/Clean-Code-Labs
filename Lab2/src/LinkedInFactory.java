public class LinkedInFactory extends SocialNetworkFactory {
    @Override
    public SocialNetwork createSocialNetwork() {
        return new LinkedIn();
    }
}
