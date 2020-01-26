package RoomProject;

public class Table {
    private int seats;
    private boolean expandable;
    private boolean expanded;

    public Table(int seats, boolean expandable) {
        this.expandable = expandable;
        this.expanded = false;
        this.seats = seats;
    }


    public int getSeats() {
        return seats;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void expand(){
        if (expandable) {
            System.out.println("Expanding the table");
            seats += 4;
            expanded = true;
        }
        else System.out.println("Not expandable");
    }

    public void unexpand(){
        if(expanded){
            System.out.println("Unexpanding the table");
            this.seats -= 4;
            expanded = false;
        }
    }

}
