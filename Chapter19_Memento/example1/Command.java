package Memento.example1;

import java.util.ArrayList;

import java.util.Stack;

/**
 * 负责对象
 */
public class Command {
    private Stack<Memento> history = new Stack<>();

    public void execute(Memento memento){
        history.push(memento);
    }

    public boolean undo(){
        if(!history.isEmpty()){
            history.peek().restore();
            history.pop();
            return true;
        }
        else return false;
    }
}
