package RoomProject;

public class Window {
    private boolean open;
    private String color;

    public Window(boolean open, String color) {
        this.open = open;
        this.color = color;
    }

    public boolean isOpen() {
        return open;
    }

    public String getColor() {
        return color;
    }

    public void openWindow(){
        if(open) System.out.println("The window is already open");
        else{
            System.out.println("Opening the window");
            open = true;
        }
    }

    public void closeWindow(){
        if(!open) System.out.println("The window is already closed.");
        else{
            System.out.println("Closing the window");
            open = false;
        }
    }

    public void lookThrough(){
        if(!open) System.out.println("Everything is tinted " + color);
        if(open) System.out.println("It looks so real!");
    }


}
