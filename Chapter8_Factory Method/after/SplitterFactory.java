package FactoryMethod.after;

// 工厂接口
public interface SplitterFactory {
    ISplitter createSplitter(String type);
}

/**
 * BinarySplitterFactory、TextSplitterFactory、
 * PictureSplitterFactory、VideoSplitterFactory
 * 是 Concrete Factory （具体工厂）
 */

class FileSplitterFactory implements  SplitterFactory{
    @Override
    public ISplitter createSplitter(String type) {
         if(type.equals("BinarySplitter")){
             return new BinarySplitter();
         }
         else if(type.equals("TextSplitter")) {
             return new TextSplitter();
         }
         else if (type.equals("PictureSplitter")){
             return new PictureSplitter();
         }
         else if(type.equals("VideoSplitter")){
             return new VideoSplitter();
         }
         return null;
    }
}
