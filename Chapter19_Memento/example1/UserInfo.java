package Memento.example1;

import java.io.Serializable;

// 使用序列化机制做备份
public class UserInfo implements Serializable {
    int age;
    String username;
    String address;

    public UserInfo(int age, String username, String address) {
        this.age = age;
        this.username = username;
        this.address = address;
    }
}
