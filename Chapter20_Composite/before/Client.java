package Composite.before;

public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        Composite treeNode1 = new Composite("treeNode1");
        Composite treeNode2 = new Composite("treeNode2");
        Composite treeNode3 = new Composite("treeNode3");
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        root.add(treeNode1);
        treeNode1.add(treeNode2);
        treeNode2.add(leaf1);

        root.add(treeNode3);
        treeNode3.add(leaf2);
    }

    /**
     * 这种处理方式，把对象和对象容器复杂数据结构处理过程和客户代码 invoke 耦合到一起，不利于扩展
     */
    public void invoke(Component component){
        if(component instanceof Leaf){
            // 针对叶节点进行处理
        }
        else if(component instanceof Composite){
            for(Component c: ((Composite) component).components){
                invoke(c);
            }
        }
    }
}
