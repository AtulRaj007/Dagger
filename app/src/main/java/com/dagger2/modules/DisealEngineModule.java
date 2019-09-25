package com.dagger2.modules;

import com.dagger2.classes.DisealEngine;
import com.dagger2.interfaces.IEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class DisealEngineModule {
//    private int horsePower;

//    public DisealEngineModule(int horsePower) {
//        this.horsePower = horsePower;
//    }

    /**
     * Previous approach.
     *
     * @param disealEngine
     * @return
     */
    /*
    @Provides
    IEngine provideDisealEngine(DisealEngine disealEngine) {
        return disealEngine;
    }
    */

    /*
    @Binds
    abstract IEngine bindsDisealEngine(DisealEngine disealEngine);
    */
    @Provides
    IEngine providesDisealEngine() {
        return new DisealEngine(10);
    }
}
