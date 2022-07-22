package com.example.hospitalfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class aboutActivity extends AppCompatActivity {
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        link = findViewById(R.id.click);
        link.setMovementMethod(LinkMovementMethod.getInstance());

    }
}