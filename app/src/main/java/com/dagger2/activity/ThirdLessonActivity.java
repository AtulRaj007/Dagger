package com.dagger2.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dagger2.CarComponent.CarComponent;
import com.dagger2.CarComponent.DaggerCarComponent;
import com.dagger2.R;
import com.dagger2.classes.Car;

import javax.inject.Inject;

public class ThirdLessonActivity extends BaseActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_lesson);
        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        car.drive();
    }
}
