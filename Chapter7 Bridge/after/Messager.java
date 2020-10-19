package Bridge.after;

import java.awt.*;

public abstract class Messager {
    // 持有实现类 MessagerImp （基类）的引用，可以在运行时动态绑定具体平台实现类
    protected MessagerImp messagerImp;

    // 定义构造函数，在子类中调用（抽象函数不能被实例化，但是可以被子类通过super调用）
    protected Messager(MessagerImp messagerImp) {
        this.messagerImp = messagerImp;
    }

    protected abstract void login(String username, String password);
    protected abstract void sendMessage(String message);
    protected abstract void sendPicture(Image image);
}


