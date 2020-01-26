package Encapsulation.Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        if(this.tonerLevel < 0) this.tonerLevel = 0;
        if(this.tonerLevel > 100) this.tonerLevel = 100;
        this.pagesPrinted = pagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        if(this.tonerLevel < 0) this.tonerLevel = 0;
        if(this.tonerLevel > 100) this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void increaseToner(int percent){
        if(percent < 0) System.out.println("Wow, how do you add negative  toner?  Try again.");
        else if (percent == 0) System.out.println("You're adding no toner?  Very zen.  Try again.");
        else if(this.tonerLevel + percent > 100) System.out.println("That's too much toner. Try again.");
        else this.tonerLevel += percent;
    }

    public void printPages(int pages){
        int pagesUsed;
        if(this.tonerLevel > 0 && this.tonerLevel * 10 > pages) {
            if(!this.isDuplexPrinter){
                pagesUsed = pages;
                System.out.println("Now printing " + pages + " pages on single-sided sheets.");
            }
            else{
                if(pages % 2 == 0){
                    pagesUsed = pages / 2;
                } else{
                    int pagesFullyUsed = pages / 2;
                    pagesUsed = pagesFullyUsed + 1;
                }
                System.out.println("Now printing " + pagesUsed + " pages on double-sided sheets.");
            }
            increasePagesPrinted(pagesUsed);
        } else if(pages > 1000){
            System.out.println("Max 1000 pages per print job.");
        } else{
            System.out.println("Please add toner and try again.");
        }
    }

    private void increasePagesPrinted(int pagesPrinted) {
        this.pagesPrinted += pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
