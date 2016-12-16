package com.anwesome.ui.customcarousel;

import android.graphics.Bitmap;

/**
 * Created by anweshmishra on 16/12/16.
 */
public class CarouselObject {
    private Bitmap bitmap;
    private String text;
    public CarouselObject(Bitmap bitmap,String text) {
        this.bitmap = bitmap;
        this.text = text;
    }
    public Bitmap getBitmap() {
        return bitmap;
    }
    public String getText() {
        return text;
    }
}
