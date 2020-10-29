package Composite.after;

import java.util.ArrayList;
import java.util.List;

/**
 * 把对象或者对象容器统使用 execute() 方法进行了统一
 * 组合会以特定的方式执行其主要逻辑。它会递归遍历所有子项目，并收集和
 * 汇总其结果。由于组合的子项目也会将调用传递给自己的子项目，以此类推，
 * 最后组合将会完成整个对象树的遍历工作。
 *
 * 该方式的最大优点在于你无需了解构成树状结构的对象的具体类。 你也无需了
 * 解对象是简单的Leaf还是复杂的节点组合(Composite)。你只需调用通用接口以相同的方式对其
 * 进行处理即可。当你调用该方法后，对象会将请求沿着树结构传递下去。
 */

public class Composite implements Component{
    String name;
    // 当前节点的子节点（也是Component类型，可以是Composite或者Leaf）
    // 表达了一种树形结构
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    /**
     * execute 实际上是把对象和对象容器的复杂数据结构操作封装起来了，以便于对用户提供统一的接口
     */
    @Override
    public void execute() {
        //1. 处理当前节点（针对对象容器本身（Composite）的操作）
        // ...

        //2. 处理当前节点的子节点
        // 如果子节点是 Leaf ，则调用 Leaf 的 execute 方法
        // 如果子节点是 Composite ，则调用Composite的 execute ，递归执行
        for(Component c : components){
            c.execute(); // 多态调用， c 可以是 Leaf 也可以是 Composite
        }
        // ...
    }

    public void add(Component c){
        // ...
    }

    public void remove(Component c){
        // ...
    }
}
