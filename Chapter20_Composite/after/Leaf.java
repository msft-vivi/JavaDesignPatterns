package Composite.after;

public class Leaf implements Component{
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        // ...
    }
}
