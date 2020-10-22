package Proxy.Example2.after;

import java.util.List;

// 远程服务接口
public interface ThirdPartyTVLib {
    List<Video> listVideos();
    String getVideoInfo(int id);
    Video downloadVideo(int id);
}
