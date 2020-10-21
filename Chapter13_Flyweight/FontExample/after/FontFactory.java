package Flyweight.example1.after;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂决定是否复用已有享元或者创建一个新的对象
 */
public class FontFactory {
    private static Map<String,Font> fontPool = new HashMap<>();

    public static Font getFont(final String key){
        if(fontPool.get(key) != null){
            return fontPool.get(key);
        }
        else{
            Font font = new Font(key);
            fontPool.put(key,font);
            return font;
        }
    }

    public static void clear(){
        // ...
    }
}
