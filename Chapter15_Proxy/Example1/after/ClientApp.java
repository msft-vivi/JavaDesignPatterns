package Proxy.Example1.after;


/**
 * 这种方式 通过 SubjectProxy 间接使用RealSubject
 * 可以在 SubjectProxy 中进行访问控制，决定是否有权限对 RealSubject
 * 或者以何种方式访问RealSubject
 */
class ClientApp{
    ISubject iSubject;

    public ClientApp() {
        // 通过代理对象来委托使用RealSubject
        iSubject = new SubjectProxy();
    }

    public void doTask(){
        // ...
        iSubject.process();
        // ...
    }
}