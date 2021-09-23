package com.example.report07;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }@Override
    //내가 호출한 액티비티가 임무를 완수하고 돌아올 때 자동 실행되는 메소드
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent 인텐트) {
        // requestCode : 아까 호출할 때 입력했던 식별번호
        if(requestCode == 1){
            int result = 인텐트.getIntExtra("result", -1);
            TextView tv1 = findViewById(R.id.result);
            tv1.setText("더한 결과 = " + result );
        }else if(requestCode == 2){
            int result = 인텐트.getIntExtra("result", -1);
            TextView tv1 = findViewById(R.id.result);
            tv1.setText("뺀 결과 = " + result );
        }else if(requestCode == 3){
            int result = 인텐트.getIntExtra("result", -1);
            TextView tv1 = findViewById(R.id.result);
            tv1.setText("곱한 결과 = " + result );
        }else if(requestCode == 4){
            double result = 인텐트.getDoubleExtra("result", -1);
            TextView tv1 = findViewById(R.id.result);
            tv1.setText("나눈 결과 = " + result );
        }
        super.onActivityResult(requestCode, resultCode, 인텐트);
    }
    public void run1(View v1){
        EditText e1 = findViewById(R.id.inputNum1);
        EditText e2 = findViewById(R.id.inputNum2);
        //문자열의 숫자화를 위해 래퍼클래스 Integer.parseInt로 묶어줘서 숫자화시켜줌
        int k1 = Integer.parseInt(""+e1.getText()); //""넣어주는 이유는 일반문자열로 바꿔주기위해
        int k2 = Integer.parseInt(""+e2.getText());

        double k3 = Double.parseDouble(""+e1.getText());
        double k4 = Double.parseDouble(""+e2.getText());
        Intent 더하기 = new Intent(this, SubActivity.class); //this란 나자신 메인엑티비티라는 클래스 자기자신의 주소 일로 오라고 정해놓은것
        Intent 빼기 = new Intent(this, subActivity2.class);
        Intent 곱하기 = new Intent(this, subActivity3.class);
        Intent 나누기 = new Intent(this, subActivity4.class);

        RadioButton R1 = findViewById(R.id.더하기);
        RadioButton R2 = findViewById(R.id.빼기);
        RadioButton R3 = findViewById(R.id.곱하기);
        RadioButton R4 = findViewById(R.id.나누기);

        if(e1!= null && e2!=null) {
            if (R1.isChecked() ) {
                더하기.putExtra("num1", k1);
                더하기.putExtra("num2", k2);
                int 식별번호 = 1; //어느 엑티비티에서 돌아오는지 판별가능하게됨
                startActivityForResult(더하기, 1);
            } else if (R2.isChecked() ) {
                빼기.putExtra("num1", k1);
                빼기.putExtra("num2", k2);
                int 식별번호 = 2; //어느 엑티비티에서 돌아오는지 판별가능하게됨
                startActivityForResult(빼기, 2);
            } else if (R3.isChecked() ) {
                곱하기.putExtra("num1", k1);
                곱하기.putExtra("num2", k2);
                int 식별번호 = 3; //어느 엑티비티에서 돌아오는지 판별가능하게됨
                startActivityForResult(곱하기, 3);
            } else if (R4.isChecked() ) {
                나누기.putExtra("num1", k3);
                나누기.putExtra("num2", k4);
                int 식별번호 = 4;
                startActivityForResult(나누기, 4);
            } else {
                Toast.makeText(this, "연산자를 선택해야합니다.", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "숫자는 모두 입력해야합니다.", Toast.LENGTH_SHORT).show();

        }
    }
}
