package Mediator.after;

/**
 * 具体中介者类可解开各组件之间相互交叉的连接关系并将其转移到中介者中。
 */
public class AuthenticationDialog implements Mediator{
    private Checkbox loginOrRegisterChkBx;
    private Textbox loginUsername, loginPassword;
    private Button okBtn, cancelBtn;

    // 添加当前组件到中介者
    public void registerComponent(Component component){
        component.setMediator(this);
    }

    // 当组件中有事件发生时，它会通知中介者。中介者接收到通知后可自行处理，
    // 也可将请求传递给另一个组件。
    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterChkBx && event == "check"){
            // ...
        }

        if(sender == loginUsername && event == "submit"){
           // ...
        }

        if(sender == okBtn && event == "click"){
            // ...
        }
    }
}
