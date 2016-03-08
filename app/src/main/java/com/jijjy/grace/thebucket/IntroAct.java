package com.jijjy.grace.thebucket;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

/**
 * Created by grace on 3/8/16.
 */
public class IntroAct extends IntroActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SimpleSlide.Builder()
                .title(R.string.app_name)
                .description(R.string.description)
                .image(R.drawable.pb2)
                .background(R.color.black)
                .backgroundDark(R.color.Purple)
                .build());


        addSlide(new SimpleSlide.Builder()
                .title(R.string.app_name)
                .description(R.string.description2)
                .image(R.drawable.pb1)
                .background(R.color.Pink)
                .backgroundDark(R.color.Purple)
                .build());


        addSlide(new SimpleSlide.Builder()
                .title(R.string.app_name)
                .description(R.string.description3)
                .image(R.drawable.pb3)
                .background(R.color.black)
                .backgroundDark(R.color.Purple)
                .build());


        addSlide(new SimpleSlide.Builder()
                .title(R.string.app_name)
                .description(R.string.description4)
                .image(R.drawable.pb4)
                .background(R.color.Purple)
                .backgroundDark(R.color.Purple)
                .build());

        setFullscreen(true);

        setSkipEnabled(true);

        setFinishEnabled(true);


        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }
}
