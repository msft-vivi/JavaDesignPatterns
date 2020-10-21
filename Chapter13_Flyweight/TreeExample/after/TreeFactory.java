package Flyweight.example2.after;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;


/**
 * 享元工厂决定是否复用已有享元或者创建一个新的对象
 */

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>(); // 享元对象 Pool

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {

        TreeType result = treeTypes.get(name);

        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }

        return result;
    }
}
