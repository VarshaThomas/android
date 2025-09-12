package com.example.toggle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView6, imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // your XML layout file name

        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);

        // Initially show imageView6, hide imageView7
        imageView6.setVisibility(View.VISIBLE);
        imageView7.setVisibility(View.GONE);

        // When imageView6 is clicked, hide it and show imageView7
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView6.setVisibility(View.GONE);
                imageView7.setVisibility(View.VISIBLE);
            }
        });

        // When imageView7 is clicked, hide it and show imageView6
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView7.setVisibility(View.GONE);
                imageView6.setVisibility(View.VISIBLE);
            }
        });
    }
}
