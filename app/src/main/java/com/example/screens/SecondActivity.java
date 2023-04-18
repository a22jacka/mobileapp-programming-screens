package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView thingText = findViewById(R.id.textView_thing);
        TextView numberText = findViewById(R.id.textView_numberOf);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String things = extras.getString("thing");
            int numberOf = extras.getInt("numberOf");

            thingText.setText(things);
            numberText.setText(String.valueOf(numberOf));
        }
    }
}