public class XMLRenderer implements Renderer {
    @Override
    public void renderSimplePage(String title, String content) {
        System.out.println("Render simple XML page");
    }

    @Override
    public void renderProductPage(Product product) {
        System.out.println("Render product XML page");
    }
}
