package com.example.report4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubActivity_4 extends AppCompatActivity {
Double num1;
Double num2;
Double sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_4);

        Intent Intent = getIntent();
        num1 = Intent.getDoubleExtra("num1",-1);
        num2 = Intent.getDoubleExtra("num1",-1);
        TextView t1 = findViewById(R.id.get1);
        TextView t2 = findViewById(R.id.get2);

        t1.setText(num1+"");
        t2.setText(num2+"");

        sum = num1/num2;
    }

    public void sum(View v){
        Intent Intent = new Intent();
        Intent.putExtra("sum",sum);
        setResult(RESULT_OK,Intent);
        finish();
    }
}
