package com.example.midterm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private String Re="";
    public static final String REPLY_MESSAGE = "com.example.android.midterm_1.reply.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String n =intent.getStringExtra(MainActivity.NAME_MESSAGE);
        String h = intent.getStringExtra(MainActivity.HOBBY_MESSAGE);
        String g = intent.getStringExtra(MainActivity.GENDER_MESSAGE);
        String d = intent.getStringExtra(MainActivity.DEPT_MESSAGE);

        TextView textView1 = findViewById(R.id.txtGender2);
        textView1.setText(g);

        TextView textView2 = findViewById(R.id.txtHobby2);
        textView2.setText(h);

        TextView textView3 = findViewById(R.id.txtDept2);
        textView3.setText(d);

        TextView textView4 = findViewById(R.id.txtName2);
        textView4.setText(n);
    }

    public void BtnClick(View view){
        EditText editText = findViewById(R.id.Reply);
        Re= editText.getText().toString();

        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        intent.putExtra(REPLY_MESSAGE,Re);
        startActivity(intent);
    }
}