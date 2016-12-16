package com.anwesome.ui.customcarousel;

import android.graphics.*;
import android.graphics.drawable.Drawable;

/**
 * Created by anweshmishra on 16/12/16.
 */
public class CarouselDrawable extends Drawable {
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Bitmap bitmap;
    private String text;
    public CarouselDrawable(Bitmap bitmap,String text) {
        this.bitmap = bitmap;
        this.text = text;
    }
    public void draw(Canvas canvas) {
        paint.setTextSize(AppConstants.TITLE_FONT_SIZE);
        paint.setColor(Color.WHITE);
        canvas.drawBitmap(bitmap,new Rect(0,0,bitmap.getWidth(),bitmap.getHeight()),new RectF(0,0,canvas.getWidth(),canvas.getHeight()),paint);
        float textWidth = paint.measureText(text);
        canvas.drawText(text,canvas.getWidth()/2-textWidth/2,canvas.getHeight()/2,paint);
    }
    public void setColorFilter(ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter);
    }
    public int getOpacity() {
        return 0;
    }
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }
}
