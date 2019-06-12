package com.yehoshuakahan;

public class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark seeks fine dining.";
    }
}
