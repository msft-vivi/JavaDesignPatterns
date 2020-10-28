package Memento.example1;


import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


/**
 *  基于序列化方式实现快照
 *  用待保存的对象的字节流对当前状态进行编码 : Base64.getEncoder().encodeToString(baos.toByteArray())
 *  把编码结果作为当前的 state，然后采用反序列化的方式实现 restore()
 */
public class Originator{
    // 需要保存的状态
    List<UserInfo> userInfoList = new ArrayList<>();
    // .. 其他可能需要被保存的状态

    public Originator() {
        // ...
    }

    // create snapshot
    public Memento createSnapshot() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this.userInfoList);
            oos.close();
            String state = Base64.getEncoder().encodeToString(baos.toByteArray()); // 保存状态

            return new Memento(state,this);

        } catch (IOException e) {
            return null;
        }
    }

    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.userInfoList = (ArrayList) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        }
    }
}