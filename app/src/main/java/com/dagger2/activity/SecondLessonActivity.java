package com.dagger2.activity;

import android.os.Bundle;

import com.dagger2.CarComponent.CarComponent;
import com.dagger2.CarComponent.DaggerCarComponent;
import com.dagger2.R;
import com.dagger2.classes.Car;

public class SecondLessonActivity extends BaseActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.create();
        car = component.getCar();
        car.drive();
    }
}
