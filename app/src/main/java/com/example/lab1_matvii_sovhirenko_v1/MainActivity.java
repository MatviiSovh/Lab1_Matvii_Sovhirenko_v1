package com.example.lab1_matvii_sovhirenko_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSecond = findViewById(R.id.tvSecondary);
    }

    public void buttonClick1(View v)
    {
        tvSecond.setText("THE TEXT WAS CHANGED SUCCESSFULLY");
    }
}