package com.mobike.frpsample.reactive;

public class LightBulb {
    //couple Switch
    public static  LightBulb create(Switch theSwitch) {
        final LightBulb lightBulb = new LightBulb();
        theSwitch.addOnFlipListener(new Switch.OnFlipListener() {
            @Override
            public void onFlip(boolean enable) {
                lightBulb.power(enable);

            }
        });
        return lightBulb;

    }

    void power(boolean enable) {
        if (enable) {
            System.out.println("LightBulb light on !");

        }else {
            System.out.println("LightBulb light off !");
        }

    }
}
