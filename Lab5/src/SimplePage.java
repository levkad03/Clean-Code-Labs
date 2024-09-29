public class SimplePage extends Page {

    private String title;
    private String content;

    public SimplePage(Renderer renderer, String title, String content) {
        super(renderer);
        this.title = title;
        this.content = content;
    }

    @Override
    public void view() {
        renderer.renderSimplePage(title, content);
    }
}
