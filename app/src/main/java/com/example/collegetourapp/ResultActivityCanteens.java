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

public class ResultActivityCanteens extends AppCompatActivity {

    //private CardView b1;
    //private CardView b2;
    //private CardView b3;
    //private CardView b4;
    //private CardView b5;
    //private CardView b6;

    CardBool b1 = new CardBool();
    CardBool b2 = new CardBool();
    CardBool b3 = new CardBool();
    CardBool b4 = new CardBool();
    CardBool b5 = new CardBool();
    CardBool b6 = new CardBool();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_canteens);

        b1.c = (CardView) findViewById(R.id.b1);
        b2.c = (CardView) findViewById(R.id.b2);
        b3.c = (CardView) findViewById(R.id.b3);
        b4.c = (CardView) findViewById(R.id.b4);
        b5.c = (CardView) findViewById(R.id.b5);
        b6.c = (CardView) findViewById(R.id.b6);


        b1.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b2.getisCollapsed()) {
                    switchCard(b2);
                } else if (!b3.getisCollapsed()) {
                    switchCard(b3);
                } else if (!b4.getisCollapsed()) {
                    switchCard(b4);
                } else if (!b5.getisCollapsed()) {
                    switchCard(b5);
                } else if (!b6.getisCollapsed()) {
                    switchCard(b6);
                }
                switchCard(b1);
            }
        });

        b2.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.getisCollapsed()) {
                    switchCard(b1);
                } else if (!b3.getisCollapsed()) {
                    switchCard(b3);
                } else if (!b4.getisCollapsed()) {
                    switchCard(b4);
                } else if (!b5.getisCollapsed()) {
                    switchCard(b5);
                } else if (!b6.getisCollapsed()) {
                    switchCard(b6);
                }
                switchCard(b2);
            }
        });

        b3.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b2.getisCollapsed()) {
                    switchCard(b2);
                } else if (!b1.getisCollapsed()) {
                    switchCard(b1);
                } else if (!b4.getisCollapsed()) {
                    switchCard(b4);
                } else if (!b5.getisCollapsed()) {
                    switchCard(b5);
                } else if (!b6.getisCollapsed()) {
                    switchCard(b6);
                }
                switchCard(b3);
            }
        });

        b4.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b2.getisCollapsed()) {
                    switchCard(b2);
                } else if (!b3.getisCollapsed()) {
                    switchCard(b3);
                } else if (!b1.getisCollapsed()) {
                    switchCard(b1);
                } else if (!b5.getisCollapsed()) {
                    switchCard(b5);
                } else if (!b6.getisCollapsed()) {
                    switchCard(b6);
                }
                switchCard(b4);
            }
        });

        b5.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b2.getisCollapsed()) {
                    switchCard(b2);
                } else if (!b3.getisCollapsed()) {
                    switchCard(b3);
                } else if (!b4.getisCollapsed()) {
                    switchCard(b4);
                } else if (!b1.getisCollapsed()) {
                    switchCard(b1);
                } else if (!b6.getisCollapsed()) {
                    switchCard(b6);
                }
                switchCard(b5);
            }
        });

        b6.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b2.getisCollapsed()) {
                    switchCard(b2);
                } else if (!b3.getisCollapsed()) {
                    switchCard(b3);
                } else if (!b4.getisCollapsed()) {
                    switchCard(b4);
                } else if (!b5.getisCollapsed()) {
                    switchCard(b5);
                } else if (!b1.getisCollapsed()) {
                    switchCard(b1);
                }
                switchCard(b6);
            }
        });


    }

    //private Boolean isCollapsed = true;

    public void switchCard(CardBool b1) {

        final int originalDimension = Math.round(getResources().getDimension(R.dimen.original_card_view_height));
        final int newDimension = Math.round(getResources().getDimension(R.dimen.new_card_view_height));

        if (b1.getisCollapsed()) {
            TransitionManager.beginDelayedTransition(b1.c, new TransitionSet().addTransition(new ChangeBounds()));
            ViewGroup.LayoutParams params = b1.c.getLayoutParams();
            params.height = newDimension;
            b1.c.setLayoutParams(params);

            b1.setIsCollapsed(false);
        } else {
            TransitionManager.beginDelayedTransition(b1.c, new TransitionSet()
                    .addTransition(new ChangeBounds()));

            ViewGroup.LayoutParams params = b1.c.getLayoutParams();
            params.height = originalDimension;

            b1.c.setLayoutParams(params);


            b1.setIsCollapsed(true);
        }
    }

    class CardBool {
        private Boolean isCollapsed = true;
        private CardView c;

        Boolean getisCollapsed() {
            return isCollapsed;
        }

        void setIsCollapsed(Boolean n) {
            isCollapsed = n;
        }

    }

}

