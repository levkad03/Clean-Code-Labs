public class JSONRenderer implements Renderer {
    @Override
    public void renderSimplePage(String title, String content) {
        System.out.println("Render Simple JSON page");
    }

    @Override
    public void renderProductPage(Product product) {
        System.out.println("Render product JSON page");
    }
}
