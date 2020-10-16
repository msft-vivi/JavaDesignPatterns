package TemplateMethod;

/**
 *
 */
public class Main2 {
    public static void main(String[] args) {
        /**
         * 声明为 Lib2 ，实际指向 Application2,即父类引用指向子类对象
         * 运行时调用 Application2 的重写方法和Lib2中的未被重写的方法
         * 体现多态
         */
        Lib2 lib2 = new Application2();
        lib2.run();
    }
}
