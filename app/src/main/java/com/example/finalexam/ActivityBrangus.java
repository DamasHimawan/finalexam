package com.example.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.finalexam.HomeActivity;
import com.example.finalexam.R;

public class ActivityBrangus extends AppCompatActivity {
    Button btnbtlbrangus, btnbelibrangus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brangus);

        btnbelibrangus = findViewById(R.id.belibrangus);
        btnbtlbrangus = findViewById(R.id.batalbrangus);

        btnbelibrangus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });

        btnbtlbrangus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });
    }
}