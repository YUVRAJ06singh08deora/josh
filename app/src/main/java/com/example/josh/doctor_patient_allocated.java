package com.example.josh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class doctor_patient_allocated extends AppCompatActivity {
    RelativeLayout patientViewtest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_patient_allocated);
        patientViewtest=findViewById(R.id.patientsinfo);
        patientViewtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),patient_home.class);
                startActivity(intent);
            }
        });
    }
}