package com.example.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnsimental, btnbrangus, btnlimousin, btnbrahman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnsimental = findViewById(R.id.idsimental);
        btnbrangus = findViewById(R.id.idbrangus);
        btnlimousin = findViewById(R.id.idlimousin);
        btnbrahman = findViewById(R.id.idbrahman);

        btnsimental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.finalexam.ActivityBrahman.class);
                startActivity(i);
            }
        });

        btnbrangus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.finalexam.ActivityBrangus.class);
                startActivity(i);
            }
        });

        btnlimousin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.finalexam.ActivityLimousin.class);
                startActivity(i);
            }
        });

        btnbrahman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.finalexam.ActivityBrahman.class);
                startActivity(i);
            }
        });
    }
}