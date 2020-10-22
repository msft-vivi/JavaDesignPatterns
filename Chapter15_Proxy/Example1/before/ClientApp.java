package Proxy.Example1.before;


/**
 * 这种方式 直接使用 RealSubject 对象，不安全
 */
class ClientApp{
    ISubject iSubject;

    public ClientApp() {
        iSubject = new RealSubject(); // 这里为了突出Proxy，没有使用工厂方法等运行时编译
    }

    public void doTask(){
        // ...
        iSubject.process();
        // ...
    }
}