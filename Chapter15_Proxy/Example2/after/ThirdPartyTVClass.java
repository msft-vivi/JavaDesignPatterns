package Proxy.Example2.after;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务连接器的具体实现。该类的方法可以向腾讯视频请求信息。请求速度取决于
 * 用户和腾讯视频的互联网连接情况。如果同时发送大量请求，即使所请求的信息
        * 一模一样，程序的速度依然会减慢。
        */

public class ThirdPartyTVClass implements ThirdPartyTVLib{
    @Override
    public List<Video> listVideos() {
        // 向腾讯视频发送一个 API 请求。
        return new ArrayList<>();
    }

    @Override
    public String getVideoInfo(int id) {
        // 获取某个视频的元数据。
        Video video = new Video(1,"一部喜剧片");
        return video.getInfo();
    }

    @Override
    public Video downloadVideo(int id) {
        // 从腾讯视频下载一个视频文件。
        return new Video(2,"动作片"); // 假设是从远程下载下来的Video
    }
}
