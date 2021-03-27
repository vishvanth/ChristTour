package com.example.collegetourapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.ImageSwitcher;
        import android.widget.ImageView;
        import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ImageView buttonListIcon;
    private ImageView buttonAboutIcon;
    private ImageView buttonMapIcon;
    private ImageView buttonHelpIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Welcome to Christ Tour App :)", Toast.LENGTH_LONG).show();

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

        buttonHelpIcon = (ImageView) findViewById(R.id.buttonHelpIcon);
        buttonHelpIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHelp();
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

    public void openActivityHelp(){
        Intent intent = new Intent(this, ActivityHelp.class);
        startActivity(intent);
    }
}