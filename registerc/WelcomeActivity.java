package com.example.registerc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcomeTextView = findViewById(R.id.welcomeTextView);
        SharedPreferences sharedPref = getSharedPreferences("aishwarya", Context.MODE_PRIVATE);
        String name = sharedPref.getString("name", "User");
        String email = sharedPref.getString("email", "Email");

        welcomeTextView.setText("Welcome " + name + "\nEmail: " + email);
    }
}
