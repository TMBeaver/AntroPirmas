package com.example.antropirmas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;


public class MainActivity extends AppCompatActivity {

    private TextView TVMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.TVMain = findViewById(R.id.TVMAin);

        Button ButtOn1= (Button) findViewById(R.id.ButtOn1);

        Button ButtOff1= (Button) findViewById(R.id.ButtOff1);


        ButtOn1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                TVMain.setText("Changed text");

                int color = ContextCompat.getColor(MainActivity.this, android.R.color.holo_red_dark);
                TVMain.setTextColor(color);

                ButtOff1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                TVMain.setText("Text view");
            }
        });
    }

    });
    }}
