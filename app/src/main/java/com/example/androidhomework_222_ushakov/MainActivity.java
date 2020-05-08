package com.example.androidhomework_222_ushakov;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button nextButton;
    private Button backButton;
    private String final_url = "http://myfile.org/";
    private TextView url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        nextButton = findViewById(R.id.nextButton);
        backButton = findViewById(R.id.backButton);
        url = findViewById(R.id.url);
        url.setText(new StringBuilder().append(final_url).append(random_url()).toString());
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private int random_url(){
        Random rand = new Random();
        int number = rand.nextInt(100);
        return number;
    }
}
