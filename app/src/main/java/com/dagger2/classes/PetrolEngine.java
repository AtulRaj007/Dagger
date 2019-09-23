package com.dagger2.classes;

import android.util.Log;

import com.dagger2.interfaces.IEngine;

import javax.inject.Inject;

public class PetrolEngine implements IEngine {
    private static String TAG = PetrolEngine.class.getSimpleName();

    @Inject
    public PetrolEngine(){

    }

    @Override
    public void onStart() {
        Log.e(TAG,">>>>> Petrol engine started");
    }
}
