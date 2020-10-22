package Proxy.Example2.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 对应结构图中的 Proxy
 * 细分的化，属于缓存代理
 * 为了节省网络带宽，我们可以将请求结果缓存下来并保存一段时间。但你可能无
 * 法直接将这些代码放入服务类中。比如该类可能是第三方程序库的一部分或其签
 * 名是`final（最终）`。因此我们会在一个实现了服务类接口的新代理类中放入
 * 缓存代码。当代理类接收到真实请求后，才会将其委派给服务对象。
 */
public class CachedTVClass implements ThirdPartyTVLib  {
    private ThirdPartyTVLib service;
    private List<Video> listCache = new ArrayList<>();
    private Map<Integer,Video> cacheVideo = new HashMap<>();

    private boolean needReset; // 是否刷新缓存，重新下载

    public void setNeedReset(boolean needReset) {
        this.needReset = needReset;
    }

    public CachedTVClass(ThirdPartyTVLib service) {
        this.service = service;
        this.needReset = false;
    }

    @Override
    public List<Video> listVideos() {
        if(listCache == null || needReset){
            listCache = service.listVideos();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        if(cacheVideo.get(id) == null || needReset){
            return service.getVideoInfo(id);
        }
        return cacheVideo.get(id).getInfo();
    }

    @Override
    public Video downloadVideo(int id) {
        if(cacheVideo.get(id) == null || needReset){
            return service.downloadVideo(id);
        }
        return cacheVideo.get(id);
    }
}
