package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class lec7_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec7_2);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String name=bundle.getString("gender").toString();
        TextView t1=findViewById(R.id.Text1);
        t1.setText(name);
    }
}
