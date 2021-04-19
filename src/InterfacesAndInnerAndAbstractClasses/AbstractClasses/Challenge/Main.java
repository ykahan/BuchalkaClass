package InterfacesAndInnerAndAbstractClasses.AbstractClasses.Challenge;

public class Main {

    public static void main(String[] args) {
        YLinkedList yll = new YLinkedList();
        ListItem name = new StringListItem("Yehoshua");
        ListItem town = new StringListItem("Bet Shemesh");
        ListItem familyName = new StringListItem("Kahan");
        ListItem wife = new StringListItem("Julie");
        ListItem otherWife = new StringListItem("Julie");
        ListItem bird = new StringListItem("Robin");
        ListItem tree = new StringListItem("Tree");
        ListItem zebra = new StringListItem("Zebra");
        ListItem zzz = new StringListItem("zzz");
        ListItem aaa = new StringListItem("aaa");
        ListItem aaa2 = new StringListItem("aaa");
        ListItem crawCall = new StringListItem("Kaaa!");
        yll.addItem(name);
        yll.addItem(town);
        yll.addItem(wife);
        yll.addItem(zebra);
        yll.addItem(familyName);
        yll.addItem(tree);
        yll.addItem(bird);
        yll.addItem(zzz);
        yll.addItem(aaa);
        yll.addItem(crawCall);
        yll.addItem(aaa2);
        System.out.println(yll.toString());
        yll.removeItemByIndex(5);
        System.out.println(yll.toString());
//        yll.removeItemByValue("Tree");
//        System.out.println(yll.toString());

    }
}
