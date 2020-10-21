package Flyweight.example1.after;

/**
 * Font 对应模式中的 Flyweight 享元对象
 */
public class Font {
    //unique object key (unique state)
    private String name;

    //object state read-only
    //....

    public Font(String name) {
        this.name = name;
    }

    // 享元对象的方法
    public void write(){
        // ..
    }
}
