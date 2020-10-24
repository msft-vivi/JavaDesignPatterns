package Mediator.after;

/**
 * 定义组件的接口
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
