package InterfacesAndInnerAndAbstractClasses.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter implements ISaveable{
    private String characterName;
    private String characterType;
    private String playerName;
    private String hitPoints;
    private String mainWeapon;
    private String secondaryWeapon;
    private String armor;
    private String shield;
    private String gold;

    @Override
    public List<String> returnValues() {
        List<String> values = new ArrayList<>();
        values.add(characterName);
        values.add(characterType);
        values.add(playerName);
        values.add(hitPoints);
        values.add(mainWeapon);
        values.add(secondaryWeapon);
        values.add(armor);
        values.add(shield);
        values.add(gold);
        return values;
    }

    @Override
    public void populateFields(List<String> list) {
        characterName = list.get(0);
        characterType = list.get(1);
        playerName = list.get(2);
        hitPoints = list.get(3);
        mainWeapon = list.get(4);
        secondaryWeapon = list.get(5);
        armor = list.get(6);
        shield = list.get(7);
        gold = list.get(8);
    }

    @Override
    public String toString() {
        return "Character Name: " + characterName + "\n" +
                "Character Type: " + characterType + "\n" +
                "Player Name: " + playerName + "\n" +
                "Hit Points: " + hitPoints + "\n" +
                "Main Weapon: " + mainWeapon + "\n" +
                "Secondary Weapon: " + secondaryWeapon + "\n" +
                "Armor: " + armor + "\n" +
                "Shield: " + shield + "\n" +
                "Gold: " + gold + "\n";
    }
}
