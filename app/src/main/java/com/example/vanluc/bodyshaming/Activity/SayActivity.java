package com.example.vanluc.bodyshaming.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import com.example.vanluc.bodyshaming.R;

public class SayActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    Animation animIn, animOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say);
        viewFlipper = findViewById(R.id.vf_Say);

       /* //Khởi tạo anim
        animIn = AnimationUtils.loadAnimation(this,R.anim.in);
        animOut = AnimationUtils.loadAnimation(this,R.anim.fade_out);

        //Set anim
        viewFlipper.setAnimation(animIn);
        viewFlipper.setAnimation(animOut);*/

        //Chạy viewFliper
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
    }
}
