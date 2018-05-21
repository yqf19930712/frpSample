package com.mobike.frpsample.rx;


import org.reactivestreams.Publisher;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;


public class Switch {
    private PublishSubject<Boolean> publisher = PublishSubject.create() ;
    Observable<Boolean> flips() {
       return publisher;
    }

    void  onFlip(boolean enable) {
        publisher.onNext(enable);

    }
}
