package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button buttonZ;
    private Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        buttonC = (Button) findViewById(R.id.button_count);
        buttonZ = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.app_name,
                Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {
        buttonC.setBackgroundColor(0xFF4CAF50);
        buttonZ.setBackgroundColor(0XFFE91E63);
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

    public void toZero(View view) {
        buttonC.setBackgroundColor(0XFF3F51B5);
        buttonZ.setBackgroundColor(0xFF7F7F7F);
        mCount=0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}