package com.jijjy.grace.thebucket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

/**
 * Created by grace on 3/8/16.
 */
public class IntroAct extends AppIntro {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        addSlide(new SimpleSlide.Builder()
//                .title(R.string.app_name)
//                .description(R.string.welcome)
//                .image(R.drawable.cool)
//                .background(R.color.green)
////                .backgroundDark(R.color.Purple)
//                .build());
//
//
//        addSlide(new SimpleSlide.Builder()
//                .title(R.string.app_name2)
//                .description(R.string.description2)
//                .image(R.drawable.skydive)
//                .background(R.color.green)
////                .backgroundDark(R.color.Purple)
//                .build());
//
//
//        addSlide(new SimpleSlide.Builder()
//                .title(R.string.app_name3)
//                .description(R.string.description3)
//                .image(R.drawable.join)
//                .background(R.color.green)
////                .backgroundDark(R.color.Purple)
//                .build());
//
//        setFullscreen(true);
//
//        setSkipEnabled(true);
//
//        setFinishEnabled(true);
//
//
//        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//            }
//        });
//    }
//
//    @Override
//    protected void onStop() {
//        startActivity(new Intent(getBaseContext(), Main.class));
//        super.onStop();
//    }
        // Please DO NOT override onCreate. Use init.
        @Override
        public void init(Bundle savedInstanceState) {

            // Add your slide's fragments here.
            // AppIntro will automatically generate the dots indicator and buttons.
            addSlide(SampleSlide.newInstance(R.layout.first_fragment));
            addSlide(SampleSlide.newInstance(R.layout.second_fragment));
            addSlide(SampleSlide.newInstance(R.layout.third_fragment));

            // SHOW or HIDE the status bar
            showStatusBar(true);
            // Hide Skip/Done button
            showSkipButton(true);
            showDoneButton(true);


            // Animations -- use only one of the below. Using both could cause errors.
            setFadeAnimation();
        }

        //
    private void loadMainActivity(){
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
    }
    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        loadMainActivity();
//        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        loadMainActivity();

    }

    @Override
    public void onSlideChanged() {
        // Do something when slide is changed
    }
}
