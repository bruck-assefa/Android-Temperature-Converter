package com.example.combinedtemperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import static android.content.ContentValues.TAG;

public class CelsiusMainActivity extends AppCompatActivity {

    EditText n;
    TextView tv;
    Button b, swap;

    Celsius c;

    DecimalFormat df = new DecimalFormat("####.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "The activity has been created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celsius_activity_main);

        n = findViewById(R.id.cEntry);
        tv = findViewById(R.id.fOutput);
        b = findViewById(R.id.button);
        swap = findViewById(R.id.swapUnitsC);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "The Button has been clicked.");
                c = new Celsius(Double.parseDouble(n.getText().toString()));
                tv.setText(df.format(c.convert())+"\u00B0"+"F");
            }
        });

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fahrenheitIntent = new Intent(CelsiusMainActivity.this, FahrenheitMainActivity.class);
                startActivity(fahrenheitIntent);
            }
        });







    }
}

