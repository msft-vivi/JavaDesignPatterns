package Mediator.after;

public class Button implements Component{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Button";
    }

    // 通知中介者
    public void click(){
        mediator.notify(this,"click");
    }
}
