package InterfacesAndInnerAndAbstractClasses.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster();
        List<String> monsterValues = new ArrayList<>();
        monsterValues.add("Lionman");
        monsterValues.add("50");
        monsterValues.add("Poison Breath");
        monsterValues.add("Garbage Pail Kid Cards");
        monster.populateFields(monsterValues);
        System.out.println(monster.toString());
        List<String> restoredMonster = monster.returnValues();

        PlayerCharacter pc = new PlayerCharacter();
        List<String> pcValues = new ArrayList<>();
        pcValues.add("Warren the Warrior");
        pcValues.add("Warrior");
        pcValues.add("Warren");
        pcValues.add("15");
        pcValues.add("Sword");
        pcValues.add("Garbage Pail Kid Cards");
        pcValues.add("Leather Shirt");
        pcValues.add("Baseball Glove");
        pcValues.add("20");
        pc.populateFields(pcValues);
        System.out.println(pc.toString());
        List<String> restoredPc = pc.returnValues();

    }
}
