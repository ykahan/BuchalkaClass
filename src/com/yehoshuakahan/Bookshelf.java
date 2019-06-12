package com.yehoshuakahan;

public class Bookshelf {
    private int numShelves;
    private Dimensions dimensions;
    private String material;

    public Bookshelf(int numShelves, Dimensions dimensions, String material) {
        this.numShelves = numShelves;
        this.dimensions = dimensions;
        this.material = material;
    }

    public int getNumShelves() {
        return numShelves;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }
}
