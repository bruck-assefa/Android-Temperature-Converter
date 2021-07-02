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

public class FahrenheitMainActivity extends AppCompatActivity {

    EditText n;
    TextView tv;
    Button b, swap;

    Fahrenheit f;

    DecimalFormat df = new DecimalFormat("####.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "The activity has been created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fahrenheit_activity_main);

        n = findViewById(R.id.fEntry);
        tv = findViewById(R.id.cOutput);
        b = findViewById(R.id.button);
        swap = findViewById(R.id.swapUnitsF);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "The Button has been clicked.");
                f = new Fahrenheit(Double.parseDouble(n.getText().toString()));
                tv.setText(df.format(f.convert())+"\u00B0"+"C");
            }
        });

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fahrenheitIntent = new Intent(FahrenheitMainActivity.this, CelsiusMainActivity.class);
                startActivity(fahrenheitIntent);
            }
        });
    }

}

