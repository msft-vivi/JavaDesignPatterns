package Memento.example1;


/**
 * 保存原发器对象，和快照 state
 */
public class Memento {
    String state;
    Originator originator;

    public Memento(String state,Originator originator) {
        this.state = state;
        this.originator = originator;
    }

    public void restore(){
        originator.restore(state);
    }
}
