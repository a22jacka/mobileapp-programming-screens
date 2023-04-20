package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText things = findViewById(R.id.editTextThing);
        EditText numberOf = findViewById(R.id.editTextNumber);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String thingsText = things.getText().toString();
                int numberOfText = Integer.parseInt(numberOf.getText().toString());

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("thing", thingsText);
                intent.putExtra("numberOf", numberOfText);
                startActivity(intent);
            }
        });
    }
}
