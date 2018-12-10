package com.example.vanluc.bodyshaming.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.vanluc.bodyshaming.R;

public class MainActivity extends AppCompatActivity {

    CardView cvTotal, cvArt , cvSay, cvQues, cvFist, cvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
    }

    private void initListener() {
        cvTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TotalActivity.class);
                startActivity(intent);
            }
        });

        cvSay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SayActivity.class);
                startActivity(intent);
            }
        });
        cvArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ArtActivity.class);
                startActivity(intent);
            }
        });
        cvInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),InfoActivity.class);
                startActivity(intent);
            }
        });
        cvFist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FisActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        cvTotal = findViewById(R.id.cv_Total);
        cvQues = findViewById(R.id.cv_Ques);
        cvArt = findViewById(R.id.cv_Art);
        cvSay = findViewById(R.id.cv_Say);
        cvFist = findViewById(R.id.cv_Fist);
        cvInfo = findViewById(R.id.cv_Info);

    }



}
