package InterfacesAndInnerAndAbstractClasses.InterfaceChallenge;

import InterfacesAndInnerAndAbstractClasses.InterfaceChallenge.ISaveable;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String type;
    private String hitPoints;
    private String attack;
    private String weakness;

    @Override
    public List<String> returnValues() {
        List<String> values = new ArrayList<>();
        values.add(type);
        values.add(hitPoints);
        values.add(attack);
        values.add(weakness);
        return values;
    }

    @Override
    public void populateFields(List<String> list) {
       type = list.get(0);
       hitPoints = list.get(1);
       attack = list.get(2);
       weakness = list.get(3);
    }

    @Override
    public String toString() {
        return "Type: " + type + "\n" +
                "Hit Points: " + hitPoints + "\n" +
                "Attack: " + attack + "\n" +
                "Weakness: " + weakness + "\n";
    }
}
