package com.anwesome.ui.customcarousel;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.*;

/**
 * Created by anweshmishra on 16/12/16.
 */
public class CarouselComponent {
    private AppCompatActivity appCompatActivity;
    private List<CarouselFragment> carouselFragmentList = new ArrayList<>();
    public CarouselComponent(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }
    public void addCarousel(CarouselObject object) {
        CarouselFragment fragment = new CarouselFragment();
        fragment.setImage(object.getBitmap());
        fragment.setText(object.getText());
        carouselFragmentList.add(fragment);
    }
    public void create() {
        DisplayManager displayManager = (DisplayManager)appCompatActivity.getSystemService(Context.DISPLAY_SERVICE);
        Display display = displayManager.getDisplay(0);
        Point size = new Point();
        display.getRealSize(size);
        List<Button> buttons = new ArrayList<>();
        appCompatActivity.setContentView(R.layout.carousel_container);
        FrameLayout frameLayout = (FrameLayout)appCompatActivity.findViewById(R.id.container);

        float x = size.x/2-((carouselFragmentList.size())*AppConstants.BUTTON_GAP)/2;
        for(int i=0;i<carouselFragmentList.size();i++) {
            Button button = new Button(appCompatActivity.getApplicationContext());
            CircleDrawable circleDrawable = new CircleDrawable();
            if(i == 0) {
                circleDrawable.setColorIndex(0);
            }
            button.setBackground(circleDrawable);
            button.setY(size.y*0.3f);
            button.setX(x);
            x+=AppConstants.BUTTON_GAP;
            frameLayout.addView(button,new ViewGroup.LayoutParams(AppConstants.BUTTON_SIZE,AppConstants.BUTTON_SIZE));
            buttons.add(button);
        }
        ToggleButtonsComponent toggleButtonsComponent = new ToggleButtonsComponent(buttons);
        CarouselLayout layout = new CarouselLayout(appCompatActivity,carouselFragmentList,toggleButtonsComponent);
    }
}
