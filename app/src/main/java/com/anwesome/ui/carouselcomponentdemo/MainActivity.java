package com.anwesome.ui.carouselcomponentdemo;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anwesome.ui.customcarousel.CarouselComponent;
import com.anwesome.ui.customcarousel.CarouselObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        CarouselComponent carouselComponent = new CarouselComponent(this);
        carouselComponent.addCarousel(new CarouselObject(BitmapFactory.decodeResource(getResources(),R.drawable.sc1),"First Component"));
        carouselComponent.addCarousel(new CarouselObject(BitmapFactory.decodeResource(getResources(),R.drawable.sc2),"Second Component"));
        carouselComponent.addCarousel(new CarouselObject(BitmapFactory.decodeResource(getResources(),R.drawable.sc3),"Third Component"));
        carouselComponent.addCarousel(new CarouselObject(BitmapFactory.decodeResource(getResources(),R.drawable.sc4),"Fourth Component"));
        carouselComponent.create();
    }
}
