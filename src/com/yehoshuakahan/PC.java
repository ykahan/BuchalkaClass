package com.yehoshuakahan;

public class PC {
    private Case shell;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case shell, Monitor monitor, Motherboard motherboard) {
        this.shell = shell;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixel(100, 200, "green");
    }

    public void powerUp(){
        shell.pressPowerButton();
        drawLogo();
    }
}
