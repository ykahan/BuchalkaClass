package InterfacesAndInnerAndAbstractClasses.AbstractClasses.Challenge;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        YLinkedList yll = new YLinkedList();
        ListItem name = new StringListItem("Yehoshua");
        ListItem town = new StringListItem("Bet Shemesh");
        ListItem familyName = new StringListItem("Kahan");
        ListItem wife = new StringListItem("Julie");

        yll.addItem(name);
        yll.addItem(town);
        yll.addItem(familyName);
        yll.addItem(wife);

        System.out.println(yll.toString());
    }
}
