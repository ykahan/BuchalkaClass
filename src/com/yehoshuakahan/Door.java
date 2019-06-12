package com.yehoshuakahan;

public class Door {
    private String material;
    private Dimensions dimensions;
    private String lock;

    public Door(String material, Dimensions dimensions, String lock) {
        this.material = material;
        this.dimensions = dimensions;
        this.lock = lock;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getLock() {
        return lock;
    }

    public void openDoor(){
        System.out.println("Creak...opening the dooor...");
    }
}
