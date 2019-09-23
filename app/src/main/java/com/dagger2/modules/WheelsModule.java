package com.dagger2.modules;

import com.dagger2.classes.Rims;
import com.dagger2.classes.Tyres;
import com.dagger2.classes.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Tyres providesTyres() {
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
    Rims providesRims() {
        return new Rims();
    }

    @Provides
    Wheels providesWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }

}
