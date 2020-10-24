package Mediator.after;

public interface Mediator {
    // 这个方法实际上是通过组件中的Mediator 调用的
    void notify(Component sender, String event);
}
