package com.anwesome.ui.carouselcomponentdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.anwesome.ui.customcarousel.CarouselComponent;
import com.anwesome.ui.customcarousel.CarouselObject;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        CarouselComponent carouselComponent = new CarouselComponent(this);
        String titles[] = {"First Component","Second Component","Third Component","Fourth Component"};
        Bitmap bitmaps[] = {BitmapFactory.decodeResource(getResources(),R.drawable.car1),BitmapFactory.decodeResource(getResources(),R.drawable.car2),BitmapFactory.decodeResource(getResources(),R.drawable.car3),BitmapFactory.decodeResource(getResources(),R.drawable.car4)};
        addCarousels(carouselComponent,bitmaps,titles);
        carouselComponent.create();
    }
    private void addCarousels(CarouselComponent carouselComponent,Bitmap[] bitmaps,String[] titles) {
        for(int i=0;i<titles.length;i++) {

            Bitmap bitmap = bitmaps[i];
            final String title = titles[i];
            CarouselObject carouselObject = new CarouselObject(bitmap,title);
            carouselObject.setOnClickListener(new ImageView.OnClickListener(){
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this,"Clicked on "+title,Toast.LENGTH_SHORT).show();
                }
            });

            carouselComponent.addCarousel(carouselObject);
        }
    }
}
