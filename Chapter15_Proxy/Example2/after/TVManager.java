package Proxy.Example2.after;

import java.util.List;

public class TVManager {
    private ThirdPartyTVLib service;

    public TVManager(ThirdPartyTVLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id){
        String info = service.getVideoInfo(id);
        // 渲染视频页面。
    }

    public void renderListPane(){
        List<Video> videoList = service.listVideos();
        // 渲染视频缩略图列表。
    }

    public void renderOnUserInput(int inputId){
        renderVideoPage(inputId);
        renderListPane();
    }
}
