package TemplateMethod.after;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 声明为 Lib ，实际指向 Application,即父类引用指向子类对象
         * 运行时调用 Application2 的重写方法和 Lib中的未被重写的方法
         * 体现多态
         */
        Lib lib = new Application();
        lib.run();
    }
}
