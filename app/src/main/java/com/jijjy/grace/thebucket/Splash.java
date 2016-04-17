package com.jijjy.grace.thebucket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by grace on 3/8/16.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        int timer = 2000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), IntroAct.class));
            }
        }, timer);


    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
