package com.example.collegetourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ResultActivity extends AppCompatActivity {

    private CardView b1;
    private CardView b2;
    private CardView b3;
    private CardView b4;
    private CardView b5;
    private CardView b6;
    private CardView b7;
    private CardView b8;

    private Boolean isCollapsed = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        b1 = (CardView) findViewById(R.id.b1);
        b2 = (CardView) findViewById(R.id.b2);
        b3 = (CardView) findViewById(R.id.b3);
        b4 = (CardView) findViewById(R.id.b4);
        b5 = (CardView) findViewById(R.id.b5);
        b6 = (CardView) findViewById(R.id.b6);
        b7 = (CardView) findViewById(R.id.b7);
        b8 = (CardView) findViewById(R.id.b8);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCard(b1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCard(b2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCard(b3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCard(b4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCard(b5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCard(b6);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCard(b7);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCard(b8);
            }
        });

    }

    public void switchCard(CardView b1) {

        final int originalDimension = Math.round(getResources().getDimension(R.dimen.original_card_view_height));
        final int newDimension = Math.round(getResources().getDimension(R.dimen.new_card_view_height));

        if (isCollapsed) {
            TransitionManager.beginDelayedTransition(b1, new TransitionSet().addTransition(new ChangeBounds()));
            ViewGroup.LayoutParams params = b1.getLayoutParams();
            params.height = newDimension;
            b1.setLayoutParams(params);

            isCollapsed = false;
        } else {
            TransitionManager.beginDelayedTransition(b1, new TransitionSet()
                    .addTransition(new ChangeBounds()));

            ViewGroup.LayoutParams params = b1.getLayoutParams();
            params.height = originalDimension;

            b1.setLayoutParams(params);


            isCollapsed = true;
        }
    }

}