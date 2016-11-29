package com.deeny.test.activitytransformanitest;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Window;

public class TransformActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        int flag = getIntent().getExtras().getInt(GlobalConfig.flag);
        switch (flag){
            case GlobalConfig.explode:
                getWindow().setEnterTransition(new Explode());
                break;
            case GlobalConfig.slide:
                getWindow().setEnterTransition(new Slide());
                break;
            case GlobalConfig.fade:
                getWindow().setEnterTransition(new Fade());
                break;
            case GlobalConfig.share:

                break;
            case GlobalConfig.fab:
                break;
        }
        setContentView(R.layout.activity_transform);
    }
}
