package Prototype.after;

import java.io.*;

/**
 * 因为MainForm需要实例化 ISplitter 必须使用接口实现
 */
interface ISplitter extends Serializable{
    void split();

    // 使用 Java 8 的 default 方法，减少子类代码冗余
    default ISplitter deepClone() throws IOException, ClassNotFoundException {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ISplitter) ois.readObject();
    }
}

class BinarySplitter implements ISplitter{
    @Override
    public void split() {
        // ...
    }
}


class TextSplitter implements ISplitter{
    @Override
    public void split() {
        // ...
    }
}

class VideoSplitter implements ISplitter{
    @Override
    public void split() {
        // ...
    }
}

class PictureSplitter implements ISplitter{
    @Override
    public void split() {
        // ...
    }
}