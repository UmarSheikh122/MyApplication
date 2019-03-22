package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class lec7_1 extends AppCompatActivity {
     String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec7_1);
        Intent intent=new Intent(lec7_1.this,lec7_2.class);
        intent.putExtra("gender",gender);
        startActivity(intent);


    }
public void onClickRadioButton(View view){
    boolean checked = ((RadioButton) view).isChecked();


    switch(view.getId()) {
        case R.id.male:
            if (checked) {

                gender= "male";
                break;
            }
        case R.id.female: {
            if (checked)
                // Ninjas rule
                gender= "female";
            break;
        }
        default:  gender = "";
    }
}
}
