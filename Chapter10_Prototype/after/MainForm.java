package Prototype.after;


import java.io.IOException;

public class MainForm {
    // 声明一个原型对象
    private ISplitter prototype;

    // Client / Application 从外部传入一个具体的prototype，可以实 BinarySplitter、TextSplitter 等实例对象
    public MainForm(ISplitter prototype) {
        this.prototype = prototype;
    }

    public void buttonClick(String splitterType) throws IOException, ClassNotFoundException {
        ISplitter iSplitter = prototype.deepClone();
        iSplitter.split();
        // ...
    }
}
