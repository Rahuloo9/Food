package com.rahul009.food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Sign_In extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);
        getSupportActionBar().hide();
    }
}