package com.dagger2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dagger2.CarComponent.CarComponent;
import com.dagger2.CarComponent.DaggerCarComponent;
import com.dagger2.R;
import com.dagger2.classes.Car;

import javax.inject.Inject;

public class SixthLessonActivity extends BaseActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_lesson);
        CarComponent carComponent= DaggerCarComponent.create();
        carComponent.inject(this);
        car.drive();

    }
}
