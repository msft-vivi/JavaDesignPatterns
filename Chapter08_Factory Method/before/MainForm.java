package FactoryMethod.before;


public class MainForm {
    // 这里是成员变量定义

    public void buttonClick(String type){
        ISplitter iSplitter = null;

        if(type.equals("BinarySplitter")){
            iSplitter =  new BinarySplitter();
        }
        else if(type.equals("TextSplitter")) {
            iSplitter =  new TextSplitter();
        }
        else if (type.equals("PictureSplitter")){
            iSplitter =  new PictureSplitter();
        }
        else if(type.equals("VideoSplitter")){
            iSplitter =  new VideoSplitter();
        }

        iSplitter.split();

        // ... 其他操作
    }

    // ... 其他操作
}
