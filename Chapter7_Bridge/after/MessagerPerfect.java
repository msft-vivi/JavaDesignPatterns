package Bridge.after;

import java.awt.*;

public class MessagerPerfect extends Messager{
    public MessagerPerfect(MessagerImp messagerImp) {
        super(messagerImp);
    }

    @Override
    public void login(String username, String password) {
        messagerImp.connect();
        messagerImp.drawShape();
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
