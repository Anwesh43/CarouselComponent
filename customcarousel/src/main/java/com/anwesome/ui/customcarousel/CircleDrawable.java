package com.anwesome.ui.customcarousel;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/**
 * Created by anweshmishra on 16/12/16.
 */
public class CircleDrawable extends Drawable{
    private int colorIndex = 1;
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private int colors[] = {Color.WHITE,Color.GRAY};
    public void draw(Canvas canvas) {
        paint.setColor(colors[colorIndex]);
        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,canvas.getWidth()/2,paint);
    }
    public void setColorFilter(ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter);
    }
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }
    public int getOpacity() {
        return 0;
    }
    public void setColorIndex(int colorIndex) {
        this.colorIndex = colorIndex;
    }
}
