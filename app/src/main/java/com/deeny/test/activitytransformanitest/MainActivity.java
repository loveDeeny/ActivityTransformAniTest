package com.deeny.test.activitytransformanitest;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //分解动画效果
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void explode(View view){
        intent = new Intent(this,TransformActivity.class);
        intent.putExtra(GlobalConfig.flag,GlobalConfig.explode);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    //滑动动画效果
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void slide(View view){
        intent = new Intent(this,TransformActivity.class);
        intent.putExtra(GlobalConfig.flag,GlobalConfig.slide);
        startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    //淡出的效果
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void fade(View view){
        intent = new Intent(this,TransformActivity.class);
        intent.putExtra(GlobalConfig.flag,GlobalConfig.fade);
        startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    //共享的效果
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void share(View view){
        intent = new Intent(this,TransformActivity.class);
        intent.putExtra(GlobalConfig.flag,GlobalConfig.share);
        startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this,view,"share").toBundle());
    }

    //多个共享的效果
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void fab(View view){
        View fabs = findViewById(R.id.fab_button);
        intent = new Intent(this,TransformActivity.class);
        intent.putExtra(GlobalConfig.flag,GlobalConfig.fab);
        startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this,
                //创建多个共享元素
                Pair.create(view,"share"),Pair.create(fabs,"fab")).toBundle());
    }


}
