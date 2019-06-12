package com.yehoshuakahan;

public class Chair {
    private String material;
    private int legs;
    private int height;
    private boolean arms;
    private boolean back;
    private boolean rockingChair;
    private int weight;

    public Chair(String material, int legs, int height, boolean arms, boolean back, boolean rockingChair, int weight) {
        this.material = material;
        this.legs = legs;
        this.height = height;
        this.arms = arms;
        this.back = back;
        this.rockingChair = rockingChair;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public int getLegs() {
        return legs;
    }

    public int getHeight() {
        return height;
    }

    public boolean isArms() {
        return arms;
    }

    public boolean isBack() {
        return back;
    }

    public boolean isRockingChair() {
        return rockingChair;
    }

    public int getWeight() {
        return weight;
    }

    public void tuckIn(){
        System.out.println("Tucking chair in under the table...");
    }
}
