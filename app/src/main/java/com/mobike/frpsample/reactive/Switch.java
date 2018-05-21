package com.mobike.frpsample.reactive;

public class Switch {
    //via interface
    private  OnFlipListener onFlipListener;
    void addOnFlipListener(OnFlipListener onFlipListener) {
        this.onFlipListener = onFlipListener;

    }

    void  onFlip(boolean enable) {
        if(onFlipListener != null)
            onFlipListener.onFlip(enable);

    }

    interface OnFlipListener {
        void onFlip(boolean enable);
    }

}
