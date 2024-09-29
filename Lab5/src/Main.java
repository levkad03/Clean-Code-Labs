public class Main {
    public static void main(String[] args) {
        Renderer htmlRenderer = new HTMLRenderer();
        Renderer jsonRenderer = new JSONRenderer();
        Renderer xmlRenderer = new XMLRenderer();

        Page simplePage = new SimplePage(htmlRenderer, "Main Page", "Welcome");
        simplePage.view();

        simplePage = new SimplePage(jsonRenderer, "Main Page", "Welcome");
        simplePage.view();

        simplePage = new SimplePage(xmlRenderer, "Main Page", "Welcome");
        simplePage.view();

        Product product  = new Product("Product 1", "Product", "image.png", 123);
        Page productPage = new ProductPage(htmlRenderer, product);
        productPage.view();

        productPage = new ProductPage(jsonRenderer, product);
        productPage.view();

        productPage = new ProductPage(xmlRenderer, product);
        productPage.view();
    }
}