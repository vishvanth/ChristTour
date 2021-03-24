package com.example.collegetourapp;
//Testing commit signature:  march 22nd 12:29 Vish Varadh

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView buttonListIcon;
    private ImageView buttonAboutIcon;
    private ImageView buttonMapIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMapIcon = (ImageView) findViewById(R.id.buttonMapIcon);
        buttonMapIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMap();
            }
        });

        buttonListIcon = (ImageView) findViewById(R.id.buttonListIcon);
        buttonListIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityList();
            }
        });

        buttonAboutIcon = (ImageView) findViewById(R.id.buttonAboutIcon);
        buttonAboutIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAbout();
            }
        });


    }

    public void openActivityMap(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openActivityList(){
        Intent intent = new Intent(this, ActivityList.class);
        startActivity(intent);
    }

    public void openActivityAbout(){
        Intent intent = new Intent(this, ActivityAbout.class);
        startActivity(intent);

    }
}