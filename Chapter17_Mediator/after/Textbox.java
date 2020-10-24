package Mediator.after;

public class Textbox implements Component{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Textbox";
    }

    // 通知中介者
    public void submit(){
        mediator.notify(this,"submit");
    }
}
