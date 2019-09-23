package com.dagger2.CarComponent;

import com.dagger2.activity.FifthLessonActivity;
import com.dagger2.activity.FourthLessonActivity;
import com.dagger2.activity.SixthLessonActivity;
import com.dagger2.activity.ThirdLessonActivity;
import com.dagger2.classes.Car;
import com.dagger2.modules.DisealEngineModule;
import com.dagger2.modules.WheelsModule;

import dagger.Component;

@Component(modules = {WheelsModule.class, DisealEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(ThirdLessonActivity activity);

    void inject(FourthLessonActivity activity);

    void inject(FifthLessonActivity activity);

    void inject(SixthLessonActivity activity);
}
