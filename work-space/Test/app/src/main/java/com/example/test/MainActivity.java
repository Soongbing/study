package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("창조","onCreate()호출");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
           number = savedInstanceState.getInt("number");
           TextView a = findViewById(R.id.number);
           a.setText(""+number);
        }
    }
    protected void onDestroy(){
        Log.d("파괴","onDestroy 호출");
        super.onDestroy();
    }
    protected void onStart(){
        Log.d("시작","onStart 호출");
        super.onStart();
    }
    protected void onStop(){
        Log.d("스탑","onStop 호출");
        super.onStop();
    }
    protected void onResume(){
        Log.d("파괴","onResume 호출");
        super.onResume();
    }
    protected void onPause(){
        Log.d("파괴","onPause 호출");
        super.onPause();
    }
        protected void onRestart(){
        Log.d("파괴","onRestart 호출");
        super.onRestart();
    }
    public void Button(View v){
        TextView a = findViewById(R.id.number);
        number++;
        a.setText(""+number);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("number",number);
    }
    public void box(View v1){
        CheckBox d = (CheckBox) v1;
        if(d.isChecked()){
            Toast.makeText(this,"체크됨", Toast.LENGTH_LONG).show();
        }
    }}
