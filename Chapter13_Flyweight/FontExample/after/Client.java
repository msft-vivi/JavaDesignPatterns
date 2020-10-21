package Flyweight.example1.after;

import java.util.ArrayList;
import java.util.List;

/**
 * 对情景对象操作，和使用享元对象之前使用原始对象的业务逻辑一致
 * 只是现在操作的是新定义的情景对象
 */
public class Client {
    private List<Character> characters = new ArrayList<>();

    // 客户端添加情景对象
    public void addCharacter(char c, String name){
        Font font = FontFactory.getFont(name);
        characters.add(new Character(c,font));

    }

    // 客户端具体逻辑
    public void print(){
        for(Character character : characters){
            character.write();
        }
    }
}
