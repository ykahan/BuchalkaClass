package RoomProject;

public class Light {
    private int watts;
    boolean on;

    public Light(int watts, boolean on) {
        this.watts = watts;
        this.on = on;
    }

    public int getWatts() {
        return watts;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn(){
        if(!on){
            System.out.println("Turning the light on");
            on = true;
        }
    }

    public void turnOff(){
        if(on){
            System.out.println("Turning the light off");
            on = false;
        }
    }
}
