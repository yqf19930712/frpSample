package com.mobike.frpsample.proactive;

public class Switch {
    //couple LightBulb
    LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    void onFlip(boolean enabled) {
        lightBulb.power(enabled);
    }
}
