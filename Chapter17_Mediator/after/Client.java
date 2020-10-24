package Mediator.after;

public class Client {
    public static void main(String[] args) {
        AuthenticationDialog mediator = new AuthenticationDialog();

        Button btn = new Button();
        mediator.registerComponent(btn);

        Textbox textbox = new Textbox();
        mediator.registerComponent(textbox);

        Checkbox checkbox = new Checkbox();
        mediator.registerComponent(checkbox);
    }
}
