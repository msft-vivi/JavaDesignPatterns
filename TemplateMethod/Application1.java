package TemplateMethod;

/**
 * 由应用程序开发人员编写，属于变化类
 * 在 Application中实现 step2(),step4()
 */
public class Application1 {
    public boolean step2(){ // 变化
        System.out.println(this.getClass().toString() + " step2");
        return true;
    }
    public void step4(){ // 变化
        System.out.println(this.getClass().toString() + " step4");
    }

}
