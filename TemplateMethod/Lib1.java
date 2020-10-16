package TemplateMethod;

/**
 * Lib1 由框架开发人员编写，属于稳定类
 * 实现了step1(),step3(),step5()
 */

public class Lib1 {

    public void step1(){ // 稳定
        System.out.println(this.getClass().toString() + " step1");
    }
    public void step3(){ // 稳定
        System.out.println(this.getClass().toString() + " step3");
    }
    public void step5(){ // 稳定
        System.out.println(this.getClass().toString() + " step5");
    }
}

