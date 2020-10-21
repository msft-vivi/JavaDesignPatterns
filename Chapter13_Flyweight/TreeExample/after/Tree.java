package Flyweight.example2.after;
import java.awt.*;

/**
 * Tree为情景对象,情景对象包含状态的外在部分（x,y）。程序中可以创建数十亿个此类对象，因为它们
 * 体积很小：仅有两个整型坐标和一个引用成员变量（引用享元对象 TreeType）。
 */

public class Tree {
    private int x;
    private int y;
    private TreeType type; // 对享元对象的引用，而不是完全存储享元的所有信息在Tree里面，从而实现复用（共享）

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
