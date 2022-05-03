package com.example.midterm_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    public static final String NAME_MESSAGE = "com.example.android.midterm_1.name.message";
    public static final String GENDER_MESSAGE = "com.example.android.midterm_1.gender.message";
    public static final String DEPT_MESSAGE = "com.example.android.midterm_1.dept.message";
    public static final String HOBBY_MESSAGE = "com.example.android.midterm_1.hobby.message";
    public static final String REPLY_MESSAGE = "com.example.android.midterm_1.reply.message";
    private String Name="";
    private String mGender="";
    private String mDept="";
    private String mHobby="";

    private static final String TAG = MainActivity.class.getSimpleName();
    private String mSpinnerLabel = "";

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.cbSport);
        checkBox2 = (CheckBox) findViewById(R.id.cbMovie);
        checkBox3 = (CheckBox) findViewById(R.id.cbReading);

        Spinner spinner = findViewById(R.id.spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(
                        this, R.array.labels_array,
                        android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

        //get intent
        Intent intent = getIntent();
        String receive =intent.getStringExtra(MainActivity.REPLY_MESSAGE);
        TextView t1 = findViewById(R.id.text_header_reply);
        TextView t2 = findViewById(R.id.text_message_reply);
        if(receive!=null){
            t1.setText("Reply Received：");
            t2.setText(receive);
            t1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
        }
        else{
            t1.setVisibility(View.INVISIBLE);
            t2.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView,
                               View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        mDept=mSpinnerLabel;
        Toast.makeText(getApplicationContext(), mSpinnerLabel, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, "onNothingSelected: ");
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.rBtnMale:
                if(checked)
                    displayToast("Male");
                    mGender="Male";
                break;
            case R.id.rBtnFemale:
                if(checked)
                    displayToast("Female");
                    mGender="Female";
                break;
            default:
                break;
        }
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
    }

    public void CheckClick(View view){
        if(checkBox1.isChecked()){
            displayToast("Sport");
            mHobby+="Sport ";
        }
        if(checkBox2.isChecked()){
            displayToast("Movie");
            mHobby+="Movie ";
        }
        if(checkBox3.isChecked()){
            displayToast("Reading");
            mHobby+="Reading ";
        }
    }

    public void btnClick(View view){
        EditText editText = findViewById(R.id.txtName);
        Name= editText.getText().toString();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra(NAME_MESSAGE,Name);
        intent.putExtra(HOBBY_MESSAGE,mHobby);
        intent.putExtra(GENDER_MESSAGE,mGender);
        intent.putExtra(DEPT_MESSAGE,mDept);
        startActivity(intent);

    }
}