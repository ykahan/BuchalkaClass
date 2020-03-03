package LinkedList;

public class Main {
    public static void main(String[] args) {
        Customer yehoshua = new Customer("Yehoshua", 2.45);
        Customer josh;
        josh = yehoshua;
        josh.setBalance(5.62);
        System.out.println("Balance for " + yehoshua.getName() + " is $" + yehoshua.getBalance());
        System.out.println("Josh's name is " + josh.getName());
        josh.setName("Frank");
        System.out.println("Now Yehoshua's name is " + yehoshua.getName());
    }
}
