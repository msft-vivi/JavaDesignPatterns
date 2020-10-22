package Proxy.Example2.after;

// 程序可在运行时对代理进行配置。
public class Application {
    public static void main(String[] args) {
        ThirdPartyTVClass realSubject = new ThirdPartyTVClass();
        CachedTVClass subjectProxy = new CachedTVClass(realSubject);
        TVManager manager = new TVManager(subjectProxy);
        manager.renderOnUserInput(1);
    }
}
