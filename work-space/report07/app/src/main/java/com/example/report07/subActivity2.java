package com.example.report07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class subActivity2 extends AppCompatActivity {
    int k1,k2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        //메인 액티비티에서 인텐트가 이쪽으로 정보를 넣어줌
        Intent 인텐트 = getIntent(); //넘어오는 인텐트를 받음
        k1 = 인텐트.getIntExtra("num1",-1);
        k2 = 인텐트.getIntExtra("num2",-1);
        TextView v1 = findViewById(R.id.num1);
        TextView v2 = findViewById(R.id.num2);
        v1.setText(""+k1);
        v2.setText(""+k2);
    }
    public void run2(View v1){
        Intent 인텐트 = new Intent();//돌아가기 위한 인텐트  (값을 담아서 돌아가기 위해)
        인텐트.putExtra("result", k1-k2);
        setResult(RESULT_OK,인텐트); //돌아가기위한 인텐트(결과물)을 지정
        finish(); //자기 임무를 마치고 불러줬던 곳으로 돌아감 그리고 죽음
    }
}