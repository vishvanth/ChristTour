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
    private Button buttonLabs;
    private Button buttonGrounds;
    private Button buttonCanteens;
    private Button buttonTheater;
    private Button buttonHangout;
    private Button buttonEvent;
    private Button buttonOthers;


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
        //labs
        buttonLabs = findViewById(R.id.labs);
        buttonLabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultLabs();
            }
        });
        //grounds
        buttonGrounds = findViewById(R.id.grounds);
        buttonGrounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultGrounds();
            }
        });
        //canteen
        buttonCanteens = findViewById(R.id.canteens);
        buttonCanteens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultCanteens();
            }
        });
        //theaters
        buttonTheater = findViewById(R.id.theaters);
        buttonTheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultTheaters();
            }
        });
        //hangouts
        buttonHangout = findViewById(R.id.hangouts);
        buttonHangout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultHangouts();
            }
        });
        //Events
        buttonEvent = findViewById(R.id.events);
        buttonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultEvents();
            }
        });
        //others
        buttonOthers = findViewById(R.id.others);
        buttonOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResultOthers();
            }
        });


    }

    public void openActivityResult() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }

    public void openActivityResultLabs() {
        Intent intent = new Intent(this, ReseultActivityLabs.class);
        startActivity(intent);
    }

    public void openActivityResultGrounds() {
        Intent intent = new Intent(this, ResultActivityGrounds.class);
        startActivity(intent);
    }

    public void openActivityResultCanteens() {
        Intent intent = new Intent(this, ResultActivityCanteens.class);
        startActivity(intent);
    }

    public void openActivityResultTheaters() {
        Intent intent = new Intent(this, ResultActivityTheaters.class);
        startActivity(intent);
    }

    public void openActivityResultHangouts() {
        Intent intent = new Intent(this, ResultActivityHangouts.class);
        startActivity(intent);
    }

    public void openActivityResultEvents() {
        Intent intent = new Intent(this, ResultActivityEvents.class);
        startActivity(intent);
    }

    public void openActivityResultOthers() {
        Intent intent = new Intent(this, ResultActivityOthers.class);
        startActivity(intent);
    }


}