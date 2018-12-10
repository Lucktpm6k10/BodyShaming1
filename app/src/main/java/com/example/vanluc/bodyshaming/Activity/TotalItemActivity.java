package com.example.vanluc.bodyshaming.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.vanluc.bodyshaming.R;

public class TotalItemActivity extends AppCompatActivity {

    TextView tvConttentItem,tvTittleItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_item);
        tvConttentItem = findViewById(R.id.tv_ConttentItem);
        tvTittleItem = findViewById(R.id.tv_TittleItem);

        Intent getString = getIntent();
        String tittle = getString.getStringExtra("tittle");
        String conttent = getString.getStringExtra("content");

        tvTittleItem.setText(tittle);
        tvConttentItem.setText(conttent);


    }
}
