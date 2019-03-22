package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      Intent intent=getIntent();
      Bundle bundle=intent.getExtras();
      String name=bundle.getString("name").toString();
      String fname=bundle.getString("fName").toString();
      String phoneNo=bundle.getString("phoneNo").toString();
      String email=bundle.getString("email").toString();
      String address=bundle.getString("address").toString();
      TextView t1=findViewById(R.id.Text1);
        TextView t2=findViewById(R.id.Text2);
        TextView t3=findViewById(R.id.Text3);
        TextView t4=findViewById(R.id.Text4);
        TextView t5=findViewById(R.id.Text5);
        t1.setText(name);
        t2.setText(fname);
        t3.setText(phoneNo);
        t4.setText(email);
        t5.setText(address);


    }
    }

