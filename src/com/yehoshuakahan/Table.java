package com.yehoshuakahan;

public class Table {
    private String material;
    private int legs;
    private int places;
    private String shape;
    private int height;
    private int maxLoad;

    public Table(String material, int legs, int places, String shape, int height, int maxLoad) {
        this.material = material;
        this.legs = legs;
        this.places = places;
        this.shape = shape;
        this.height = height;
        this.maxLoad = maxLoad;
    }

    public String getMaterial() {
        return material;
    }

    public int getLegs() {
        return legs;
    }

    public int getPlaces() {
        return places;
    }

    public String getShape() {
        return shape;
    }

    public int getHeight() {
        return height;
    }

    public int getMaxLoad() {
        return maxLoad;
    }
}
