package Prototype.before;

/**
 * ISplitter是文件分割接口
 * BinarySplitter 二进制文件分割器
 * TxtSplitter文本文件分割器
 * PictureSplitter 图片文件分割器
 * VideoSplitter 视频文件分割器
 */

public interface ISplitter {
     void split();
}

class BinarySplitter implements ISplitter {
    @Override
    public void split() {
        // ...
    }
}

class TextSplitter implements ISplitter {
    @Override
    public void split() {
        // ...
    }
}

class PictureSplitter implements ISplitter {
    @Override
    public void split() {
        // ...
    }
}

class VideoSplitter implements ISplitter {
    @Override
    public void split() {
        // ...
    }
}