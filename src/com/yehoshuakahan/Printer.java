package com.yehoshuakahan;

public class Printer {
    private int tonerLevel = 10;
    private int pagesPrinted = 0;
    private boolean duplex;
    private int paperAvailable = 0;

    public Printer(int tonerLevel, int pagesPrinted, int paperAvailable, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 10) this.tonerLevel = tonerLevel;
        if (pagesPrinted >= 0) this.pagesPrinted = pagesPrinted;
        if (paperAvailable >= 0 && paperAvailable <= 100) this.paperAvailable = paperAvailable;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public void addToner(int levels) {
        int maxToAdd = 10 - this.tonerLevel;
        if(levels > maxToAdd) levels = maxToAdd;
        this.tonerLevel += maxToAdd;
        System.out.println("Added " + maxToAdd + " levels of toner.");
        printTonerLevel();
    }

    public void printTonerLevel() {
        System.out.println("Current toner level: " + this.tonerLevel);
        int canAdd = 10 - this.tonerLevel;
        if (this.tonerLevel == 10) System.out.println("Toner level at maximum.");
        else System.out.println("Can still add " + canAdd + " levels of toner.");
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public void printPage() {
        if (this.tonerLevel > 0 && this.paperAvailable > 0) {
            System.out.println("Printing a page.");
            this.pagesPrinted++;
            this.paperAvailable--;
            this.tonerLevel--;
        }
        else if(this.paperAvailable == 0){
            System.out.println("No paper available.");
        }
        else if(this.tonerLevel == 0){
            System.out.println("No toner available.");
        }
    }

    public void addPaper(int sheets){
        int maxToAdd = 100 - this.paperAvailable;
        if(sheets > maxToAdd) sheets = maxToAdd;
        this.paperAvailable += sheets;
        System.out.println("Added " + sheets + " sheets.");
        printPaperAvailable();
    }

    public int getPaperAvailable(){
        return this.paperAvailable;
    }

    public void printPaperAvailable(){
        System.out.println("Current paper available: " + this.paperAvailable);
        int canAdd = 100 - this.paperAvailable;
        if (this.paperAvailable == 100) System.out.println("Paper available at maximum.");
        else System.out.println("Can still add " + canAdd + " sheets.");
    }

    public boolean getDuplex(){
        return this.duplex;
    }

    public void printDuplex(){
        if(this.duplex) System.out.println("This is a duplex printer");
        else System.out.println("This is not a duplex printer.");
    }
}
