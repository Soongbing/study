package com.example.report4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubActivity_2 extends AppCompatActivity {
int num1;
int num2;
int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_2);

        Intent Intent = getIntent();
        num1 = Intent.getIntExtra("num1",0);
        num2 = Intent.getIntExtra("num2",0);

        TextView t1 = findViewById(R.id.get1);
        TextView t2 = findViewById(R.id.get2);
        t1.setText(num1+"");
        t2.setText(num2+"");

        sum = num1-num2;
    }
    public void sum(View v){
        Intent Intent = new Intent();
        Intent.putExtra("sum",sum);
        setResult(RESULT_OK,Intent);
        finish();
    }
}
