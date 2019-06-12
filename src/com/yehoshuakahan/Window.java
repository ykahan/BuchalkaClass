package com.yehoshuakahan;

public class Window {
    private String material;
    private String pattern;
    private Dimensions dimensions;
    private boolean openable;

    public Window(String material, String pattern, Dimensions dimensions, boolean openable) {
        this.material = material;
        this.pattern = pattern;
        this.dimensions = dimensions;
        this.openable = openable;
    }

    public String getMaterial() {
        return material;
    }

    public String getPattern() {
        return pattern;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isOpenable() {
        return openable;
    }

    public void openWindow(){
        if(openable) System.out.println("Opening the window...");
        else System.out.println("Cannot open the window...");
    }
}
