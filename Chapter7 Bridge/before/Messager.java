package Bridge.before;

import java.awt.*;

public class Messager {
    //平台无关
    public void login(String username,String password){};
    public void sendMessage(String message){};
    public void sendPicture(Image image){};

    // 与平台相关
    public void playSound(){};
    public void drawShape(){};
    public void writeText(){};
    public void connect(){};
}

