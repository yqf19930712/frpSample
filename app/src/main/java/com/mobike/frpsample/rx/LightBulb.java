package com.mobike.frpsample.rx;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class LightBulb {
    public static LightBulb create(Observable<Boolean> observable) {
        final LightBulb lightBulb =new LightBulb();
        observable.subscribe(new Observer<Boolean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Boolean aBoolean) {
                lightBulb.power(aBoolean);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

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
