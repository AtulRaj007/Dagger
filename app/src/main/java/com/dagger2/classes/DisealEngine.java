package com.dagger2.classes;

import android.util.Log;

import com.dagger2.interfaces.IEngine;

import javax.inject.Inject;

public class DisealEngine implements IEngine {
    private static String TAG = DisealEngine.class.getSimpleName();

    @Inject
    public DisealEngine() {

    }

    @Override
    public void onStart() {
        Log.e(TAG, ">>>>> Diseal engine started");
    }
}
