package com.example.antropirmas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TVMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.TVMain = findViewById(R.id.TVMAin);

    }

    public void OnButtonClickChangeText (View view) {
this.TVMain.setText("Changed text");

    }
}