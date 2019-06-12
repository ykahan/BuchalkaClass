package com.yehoshuakahan;

import java.awt.*;

public class Room {
    Door door;
    Window window;
    Table table;
    Chair chair;
    Bookshelf bookshelf;
    Lamp lamp;
    Dimensions dimensions;

    public Room(Door door, Window window, Table table,
                Chair chair, Bookshelf bookshelf, Lamp lamp, Dimensions dimensions) {
        this.door = door;
        this.window = window;
        this.table = table;
        this.chair = chair;
        this.bookshelf = bookshelf;
        this.lamp = lamp;
        this.dimensions = dimensions;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }

    public Table getTable() {
        return table;
    }

    public Chair getChair() {
        return chair;
    }

    public Bookshelf getBookshelf() {
        return bookshelf;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void ventilateRoom(){
        door.openDoor();
        window.openWindow();
    }

    public void organizeRoom(){
        chair.tuckIn();
        getLamp().turnOn();
    }
}
