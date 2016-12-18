package com.anwesome.ui.customcarousel;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by anweshmishra on 16/12/16.
 */
public class CarouselObject {
    private Bitmap bitmap;
    private String text;
    private ImageView.OnClickListener clickListener;
    public CarouselObject(Bitmap bitmap,String text) {
        this.bitmap = bitmap;
        this.text = text;
    }

    public ImageView.OnClickListener getClickListener() {
        return clickListener;
    }

    public void setOnClickListener(ImageView.OnClickListener clickListener) {
        this.clickListener = clickListener;

    }
    public Bitmap getBitmap() {
        return bitmap;
    }
    public String getText() {
        return text;
    }
}
