public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void notifyMediator(String event) {
        if (mediator != null) {
            mediator.notify(this, event);
        }
    }
}
