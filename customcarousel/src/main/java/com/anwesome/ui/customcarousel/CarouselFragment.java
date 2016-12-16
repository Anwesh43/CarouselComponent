package com.anwesome.ui.customcarousel;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by anweshmishra on 16/12/16.
 */
public class CarouselFragment extends Fragment {
    private Bitmap bitmap;
    private String text;
    public View onCreateView(LayoutInflater inflater, ViewGroup root, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.carousel_frag,root,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.caro_image);
        if (bitmap != null && text != null && text!="") {
            CarouselDrawable carouselDrawable = new CarouselDrawable(bitmap,text);
            imageView.setImageDrawable(carouselDrawable);
        }
        return view;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setImage(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
