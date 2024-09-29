public class HTMLRenderer implements Renderer {
    @Override
    public void renderSimplePage(String title, String content) {
        System.out.println("Render simple HTML page");
    }

    @Override
    public void renderProductPage(Product product) {
        System.out.println("Render product HTML page");
    }
}
