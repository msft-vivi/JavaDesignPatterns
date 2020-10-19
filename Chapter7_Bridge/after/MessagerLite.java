package Bridge.after;

import java.awt.*;

public class MessagerLite extends Messager{
    public MessagerLite(MessagerImp messagerImp) {
        super(messagerImp);
    }

    @Override
    public void login(String username, String password) {
        messagerImp.connect();
        // ...
    }

    @Override
    public void sendMessage(String message) {
        messagerImp.connect();
        messagerImp.writeText();
        // ...
    }

    @Override
    public void sendPicture(Image image) {
        messagerImp.connect();
        messagerImp.drawShape();
        // ...
    }
}
