package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadAct2(View view2) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("thing", "monkeys");
        intent.putExtra("numberOf", 3452);
        startActivity(intent);
    }
}
