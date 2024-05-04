package com.example.medicinereminder;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class scheduleForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_form);
    }

    public void addSchedule(View view){
//        ADD to database & return to main activity
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
    public void addTime(View view){
//        extract values of frequency field
//        show fragment with "frequency" number of input fields
    }
}