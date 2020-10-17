package TemplateMethod.after;

/**
 * Lib1 由框架开发人员编写，属于稳定类
 * 实现了step1(),step3(),step5()
 */

public class Lib {

    public void step1(){ // 稳定
        System.out.println(this.getClass().toString() + " step1");
    }

    public void step3(){ // 稳定
        System.out.println(this.getClass().toString() + " step3");
    }

    public void step5(){ // 稳定
        System.out.println(this.getClass().toString() + " step5");
    }

    // step2、step4 类似 C++ 的虚函数，等待子类重写
    public boolean step2(){ // 变化
        return false;
    }

    public void step4(){ // 变化

    }

    /**
     *  template method （run体现）
     *  揭示了绝大部分设计模式的 “稳定中有变化”的特点
     *  Template method 使用前提是 run必须稳定
     */
    public void run(){
        step1();

        if(step2()){ // 支持变化 ，java 多态
            step3();
        }

        for(int i = 0; i < 4; ++i){
            step4(); // 支持变化， java 多态
        }
        step5();
    }
}

