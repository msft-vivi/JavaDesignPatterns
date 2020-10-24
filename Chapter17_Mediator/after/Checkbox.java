package Mediator.after;

public class Checkbox implements Component{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Chexbox";
    }

    // 通知中介者
    public void check(){
        mediator.notify(this,"check");
    }
}
