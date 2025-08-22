package com.example.loginc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText nameEditText, passwordEditText;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.editTextTextPersonName2);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        loginButton = findViewById(R.id.button2);
        loginButton.setOnClickListener(v->{
            String name = nameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            SharedPreferences sharedPref = getSharedPreferences("aishwarya", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString( "name", name);
            editor.putString("password", password);
            editor.apply();
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(intent);
        });
    }
}
