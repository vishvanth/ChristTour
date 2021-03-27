package com.example.collegetourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ActivityList extends AppCompatActivity {
    private Button buttonBlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        buttonBlock = findViewById(R.id.blocks);
        buttonBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResult();


            }
        });
    }

    public void openActivityResult() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}