package com.dagger2.classes;

import android.util.Log;

import com.dagger2.interfaces.IEngine;

import javax.inject.Inject;

public class Car {
    private static String TAG = Car.class.getSimpleName();

    /**
     * 2.
     * After constructor injection, dagger calls field injection.
     */
    @Inject
    Wheels wheels;

    private IEngine engine;

    /**
     * 1.
     * Dagger first call constructor injection.
     *
     * @param engine
     */
    @Inject
    public Car(IEngine engine) {
        this.engine = engine;
    }

    /**
     * 3.
     * After constructor injection then field injection, dagger calls method injection.
     *
     * @param remote
     */
    @Inject
    public void connectRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.onStart();
        System.out.println(">>>>> drive.");
        Log.e(TAG, ">>>>> drive.");
    }
}
