package com.example.antropirmas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TVMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.TVMain = findViewById(R.id.TVMAin);

        Button ButtOn1= (Button) findViewById(R.id.ButtOn1);

        ButtOn1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                TVMain.setText("Changed text");
            }
        });
    }

    }
