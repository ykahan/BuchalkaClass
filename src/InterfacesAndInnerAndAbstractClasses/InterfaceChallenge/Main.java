package InterfacesAndInnerAndAbstractClasses.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster();
        ArrayList<String> monsterValues = new ArrayList<>();
        monsterValues.add("Lionman");
        monsterValues.add("50");
        monsterValues.add("Poison breath");
        monsterValues.add("Garbage Pail Kid Cards");
        monster.populateFields(monsterValues);
        System.out.println(monster.toString());
        List<String> restoredMonster = monster.returnValues();
    }
}
