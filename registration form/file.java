package com.example.registrationform;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, phoneEditText, emailEditText;
    RadioGroup genderRadioGroup;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.editTextTextPersonName);
        phoneEditText = findViewById(R.id.editTextPhone);
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        genderRadioGroup = findViewById(R.id.radioGroupGender);
        registerButton = findViewById(R.id.button);

        registerButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString().trim();
            String phone = phoneEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String gender;


            int selectedGenderId = genderRadioGroup.getCheckedRadioButtonId();

            if (selectedGenderId == R.id.radioButton) {
                gender = "Male";
            } else if (selectedGenderId == R.id.radioButton2) {
                gender = "Female";
            } else {
                gender = "Not Selected";
            }

            if (name.isEmpty()) {
                Toast.makeText(MainActivity.this, "Name is required", Toast.LENGTH_SHORT).show();
                return;
            }

            if (phone.isEmpty()) {
                Toast.makeText(MainActivity.this, "Phone number is required", Toast.LENGTH_SHORT).show();
                return;
            } else if (!phone.matches("\\d{10}")) {
                Toast.makeText(MainActivity.this, "Phone number must be 10 digits", Toast.LENGTH_SHORT).show();
                return;
            }

            if (email.isEmpty()) {
                Toast.makeText(MainActivity.this, "Email is required", Toast.LENGTH_SHORT).show();
                return;
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(MainActivity.this, "Invalid email address", Toast.LENGTH_SHORT).show();
                return;
            }

            if (gender.equals("Not Selected")) {
                Toast.makeText(MainActivity.this, "Please select a gender", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(MainActivity.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
        });
    }
}
