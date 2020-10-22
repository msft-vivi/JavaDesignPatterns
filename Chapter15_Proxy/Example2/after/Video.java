package Proxy.Example2.after;

public class Video {
    //具体的视频文件
    private int id; // 唯一标识电影
    private String info; // 电影info
    // ... 其他属性

    public Video(int id, String info) {
        this.id = id;
        this.info = info;
    }

    // .. setter 、 getter 等方法


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
