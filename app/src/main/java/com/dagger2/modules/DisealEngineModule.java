package com.dagger2.modules;

import com.dagger2.classes.DisealEngine;
import com.dagger2.interfaces.IEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DisealEngineModule {

    /**
     * Previous approach.
     * @param disealEngine
     * @return
     */
    /*
    @Provides
    IEngine provideDisealEngine(DisealEngine disealEngine) {
        return disealEngine;
    }
    */

    @Binds
    abstract IEngine bindsDisealEngine(DisealEngine disealEngine);
}
