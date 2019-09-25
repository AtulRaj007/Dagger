package com.dagger2.classes;

import android.util.Log;

import com.dagger2.interfaces.IEngine;

public class DisealEngine implements IEngine {
    private static String TAG = DisealEngine.class.getSimpleName();
    private int horsePower;

    public DisealEngine(int horsePower) {
        this.horsePower=horsePower;
    }

    @Override
    public void onStart() {
        Log.e(TAG, ">>>>> Diseal engine started ::"+horsePower);
    }
}
