package com.example.medicinereminder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToForm(View view){
        Intent i = new Intent(getApplicationContext(), scheduleForm.class);
        startActivity(i);
    }
}