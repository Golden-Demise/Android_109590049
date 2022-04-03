package com.example.checkbox_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String check="";
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);

    }

    public void showToast(View view){
        check="Toppings:";
        if(checkBox1.isChecked()){
            check += " "+checkBox1.getText();
        }
        if(checkBox2.isChecked()){
            check += " "+checkBox2.getText();
        }
        if(checkBox3.isChecked()){
            check += " "+checkBox3.getText();
        }
        if(checkBox4.isChecked()){
            check += " "+checkBox4.getText();
        }
        if(checkBox5.isChecked()){
            check += " "+checkBox5.getText();
        }
        Toast toast = Toast.makeText(this,check,Toast.LENGTH_SHORT);
        toast.show();
    }
}