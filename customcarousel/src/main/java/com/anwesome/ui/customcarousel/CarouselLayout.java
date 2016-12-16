package com.anwesome.ui.customcarousel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


import java.util.List;

/**
 * Created by anweshmishra on 16/12/16.
 */
public class CarouselLayout  {
    private ViewPager viewPager;
    public CarouselLayout(AppCompatActivity activity, List<CarouselFragment> fragments,final ToggleButtonsComponent toggleButtonsComponent) {
        viewPager = (ViewPager) activity.findViewById(R.id.vp);
        viewPager.setAdapter(new CarouselAdapter(activity.getSupportFragmentManager(),fragments));

            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    ;
                }

                @Override
                public void onPageSelected(int position) {
                    toggleButtonsComponent.activateCurrentButton(position);

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }

    class CarouselAdapter extends FragmentStatePagerAdapter {
        private List<CarouselFragment> fragments;
        public CarouselAdapter(FragmentManager fragmentManager,List<CarouselFragment> fragments) {
            super(fragmentManager);
            this.fragments = fragments;
        }
        public int getCount() {
            return this.fragments.size();
        }
        public Fragment getItem(int i) {
            return this.fragments.get(i);
        }
    }
}
