package Composite.after;

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

    // 对客户来说，无论是 Leaf 还是 Composite 还是各种组合，都提供了统一的调用接口 invoke
    public void invoke(Component component){
        component.execute();
    }
}
