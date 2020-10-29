package Composite.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite 可以由 Leaf 和 Composite 组合嵌套而成，本质还是树形结构
 */

public class Composite implements Component{
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    // ...

    public void add(Component c){
        // ...
    }

    public void remove(Component c){
        // ...
    }
}
