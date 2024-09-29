public abstract class Page {
    protected Renderer renderer;

    public Page(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void view();
}
