package com.jijjy.grace.thebucket;

import android.content.Intent;
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
                .description(R.string.welcome)
                .image(R.drawable.cool)
                .background(R.color.green)
//                .backgroundDark(R.color.Purple)
                .build());


        addSlide(new SimpleSlide.Builder()
                .title(R.string.app_name)
                .description(R.string.description2)
                .image(R.drawable.skydive)
                .background(R.color.green)
//                .backgroundDark(R.color.Purple)
                .build());


        addSlide(new SimpleSlide.Builder()
                .title(R.string.app_name)
                .description(R.string.description3)
                .image(R.drawable.join)
                .background(R.color.green)
//                .backgroundDark(R.color.Purple)
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

    @Override
    protected void onStop() {
        startActivity(new Intent(getBaseContext(), Main.class));
        super.onStop();
    }
}
