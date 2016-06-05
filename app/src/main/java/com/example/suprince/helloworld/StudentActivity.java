package com.example.suprince.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        String str=getIntent().getStringExtra("key1");
        Toast.makeText(this,""+str,Toast.LENGTH_SHORT).show();
    }
}
