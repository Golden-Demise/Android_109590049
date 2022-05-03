package com.example.a109590049_hw7_orderactivity;

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

    public void donut(View view){
        Intent intent = new Intent(MainActivity.this, donutActivity.class);
        startActivity(intent);
    }

    public void iceCream(View view){
        Intent intent = new Intent(MainActivity.this, iceCreamActivity.class);
        startActivity(intent);
    }

    public void sandwich(View view){
        Intent intent = new Intent(MainActivity.this, sandwichActivity.class);
        startActivity(intent);
    }
}