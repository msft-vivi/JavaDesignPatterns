package Flyweight.example1.after;

/**
 * Character 为字符情景对象，它具体包括使用的字体类型和像素位置(x,y)
 * 情景对象包含状态的外在部分（字符 c）。程序中可以创建数十亿个此类对象，因为它们
 * 体积很小（字符一般占 1 B）：仅有两个整型坐标和一个引用成员变量（引用享元对象 Font）。
 */

public class Character {
    private char c;
    private Font font; //存储 Font 引用（占用内存大小固定，和平台有关，如32位系统占用32位）

    public Character(char c,Font font) {
        this.c = c;
        this.font = font;
    }

    public void write(){
        // use current font to write c;
    }
}
