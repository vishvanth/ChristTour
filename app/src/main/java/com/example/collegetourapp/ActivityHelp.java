package com.example.collegetourapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.Toast;
        import android.text.method.LinkMovementMethod;
        import android.widget.TextView;

public class ActivityHelp extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toast.makeText(ActivityHelp.this, "Welcome", Toast.LENGTH_SHORT).show();
        textView = findViewById(R.id.textView5);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

