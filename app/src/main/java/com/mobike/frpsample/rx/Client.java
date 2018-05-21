package com.mobike.frpsample.rx;

public class Client {
    public static void main(String[] args) {
        flip();
    }

    private static  void flip () {
        Switch theSwitch = new Switch();
        LightBulb.create(theSwitch.flips());
        theSwitch.onFlip(true);

    }
}
