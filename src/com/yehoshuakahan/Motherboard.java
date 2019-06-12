package com.yehoshuakahan;

public class Motherboard {
    private String manufacturer;
    private String model;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String manufacturer, String model, int ramSlots, int cardSlots, String bios) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String name){
        System.out.println(name + " is now loading");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
