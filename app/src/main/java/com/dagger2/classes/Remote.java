package com.dagger2.classes;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static String TAG = Remote.class.getSimpleName();

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Log.e(TAG, ">>>>> Remote connected");
    }
}
