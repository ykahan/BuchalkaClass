package com.yehoshuakahan;

public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Width: " + width);
        sb.append("\nHeight: " + height);
        sb.append("\nDepth: " + depth);
        return sb.toString();
    }

    public void printDimensions(){
        System.out.println(toString());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
