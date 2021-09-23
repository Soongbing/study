package com.example.report4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch(requestCode){
            case 0: {
                int result = data.getIntExtra("sum", -1);
                TextView t1 = findViewById(R.id.text);
                t1.setText("더한 결과 = " + result);
                break;
            }
            case 1:{
                int result = data.getIntExtra("sum",-1);
                TextView t1 = findViewById(R.id.text);
                t1.setText("뺀 결과 = " + result);
                break;
            }
            case 2:{
                int result = data.getIntExtra("sum",-1);
                TextView t1 = findViewById(R.id.text);
                t1.setText("곱한 결과 = " + result);
                break;
            }
            case 3:{
                double result = data.getDoubleExtra("sum",-1);
                TextView t1 = findViewById(R.id.text);
                t1.setText("나눈 결과 = " + result);
                break;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void plus(View v){
        EditText e1 = findViewById(R.id.res1);
        EditText e2 = findViewById(R.id.res2);

        String s1 = e1.getText()+"";
        String s2 = e2.getText()+"";

        int val1 = Integer.parseInt(s1);
        int val2 = Integer.parseInt(s2);

        Intent Intent = new Intent(this,SubActivity_1.class);
        Intent.putExtra("num1",val1);
        Intent.putExtra("num2",val2);
        startActivityForResult(Intent,0);
    }
    public void minus(View v){
        EditText e1 = findViewById(R.id.res1);
        EditText e2 = findViewById(R.id.res2);

        String s1 = e1.getText()+"";
        String s2 = e2.getText().toString();

        int val1 = Integer.parseInt(s1);
        int val2 = Integer.parseInt(s2);

        Intent Intent = new Intent(this,SubActivity_2.class);
        Intent.putExtra("num1",val1);
        Intent.putExtra("num2",val2);
        startActivityForResult(Intent,1);
    }
    public void mul(View v){
        EditText e1 = findViewById(R.id.res1);
        EditText e2 = findViewById(R.id.res2);

        String s1 = e1.getText()+"";
        String s2 = e2.getText().toString();

        int val1 = Integer.parseInt(s1);
        int val2 = Integer.parseInt(s2);

        Intent Intent = new Intent(this,SubActivity_3.class);
        Intent.putExtra("num1",val1);
        Intent.putExtra("num2",val2);
        startActivityForResult(Intent,2);
    }
    public void div(View v){
        EditText e1 = findViewById(R.id.res1);
        EditText e2 = findViewById(R.id.res2);

        String s1 = e1.getText()+"";
        String s2 = e2.getText().toString();

        double val1 = Double.parseDouble(s1);
        double val2 = Double.parseDouble(s2);

        Intent Intent = new Intent(this,SubActivity_4.class);
        Intent.putExtra("num1",val1);
        Intent.putExtra("num2",val2);
        startActivityForResult(Intent,3);
    }
}
