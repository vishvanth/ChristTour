package com.example.collegetourapp;
//test
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ActivityAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //Toast.makeText(ActivityAbout.this, "Welcome", Toast.LENGTH_SHORT).show();
    }
}
