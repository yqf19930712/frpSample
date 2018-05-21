package com.mobike.frpsample.proactive;

public class Client {

    public static void main(String[] args) {
        flip();

    }

    private static  void flip () {
        LightBulb lightBulb = new LightBulb();
        Switch theSwitch = new Switch(lightBulb);
        theSwitch.onFlip(true);
    }


}
