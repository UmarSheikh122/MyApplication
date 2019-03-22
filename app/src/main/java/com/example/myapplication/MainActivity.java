package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text1=findViewById(R.id.text1);
                String name=text1.getText().toString();
                EditText text2=findViewById(R.id.text2);
                String fname=text2.getText().toString();
                EditText text3=findViewById(R.id.text3);
                String phoneNo=text3.getText().toString();
                EditText text4=findViewById(R.id.text4);
                String email=text4.getText().toString();
                EditText text5=findViewById(R.id.text5);
                String address=text5.getText().toString();
                Intent intent=new Intent(MainActivity.this,login.class);
                intent.putExtra("name",name);
                intent.putExtra("fName",fname);
                intent.putExtra("phoneNo",phoneNo);
                intent.putExtra("email",email);
                intent.putExtra("address",address);
                startActivity(intent);
            }
        });
    }


}
