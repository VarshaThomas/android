package com.example.registerc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText nameEditText, emailEditText;
    Button registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.editTextTextPersonName);
        emailEditText = findViewById(R.id.editTextEmail);
        registerButton = findViewById(R.id.button);
        registerButton.setOnClickListener(v->{
            String name = nameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            SharedPreferences sharedPref = getSharedPreferences("aishwarya", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString( "name", name);
            editor.putString("email", email);
            editor.apply();
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(intent);
        });
    }
}
