package com.example.a109590049_hw8_drawabletest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {
    LevelListDrawable batteryAni;
    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        num+=1;
        if(num>=7){
            num=7;
        }
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageLevel(num);
    }
    public void minus(View view){
        num-=1;
        if(num<=0){
            num=0;
        }
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageLevel(num);
    }
}