package com.anwesome.ui.customcarousel;

import android.widget.Button;

import java.util.List;

/**
 * Created by anweshmishra on 16/12/16.
 */
public class ToggleButtonsComponent {
    private List<Button> buttons;
    public ToggleButtonsComponent(List<Button> buttons) {
        this.buttons = buttons;
    }
    public void activateCurrentButton(int position) {
        for(int i=0;i<buttons.size();i++) {
            CircleDrawable circleDrawable = new CircleDrawable();
            Button button = buttons.get(i);
            if(i == position) {
                circleDrawable.setColorIndex(0);
            }
            button.setBackground(circleDrawable);
        }

    }
}
