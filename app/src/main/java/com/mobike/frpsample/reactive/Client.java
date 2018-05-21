package com.mobike.frpsample.reactive;



public class Client {

    public static void main(String[] args) {
        flip();

    }

    private static  void flip () {
        Switch theSwitch = new Switch();
        LightBulb.create(theSwitch);
        theSwitch.onFlip(true);

    }
}
