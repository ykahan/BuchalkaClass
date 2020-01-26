package Encapsulation.Challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial number of pages printed: " + printer.getPagesPrinted());
        System.out.println("Initial toner level: " + printer.getTonerLevel());
        printer.printPages(4);
        System.out.println("Current number of pages printed: " + printer.getPagesPrinted());
        System.out.println("Current toner level: " + printer.getTonerLevel());
        printer.printPages(51);
        System.out.println("Current number of pages printed: " + printer.getPagesPrinted());
        System.out.println("Current toner level: " + printer.getTonerLevel());

    }
}
