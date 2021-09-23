package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void park(View v){
    Intent park = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jbit.bufs.ac.kr/~cap20130655/"));
    startActivity(park);
        }
        public void bufs(View v1){
        Intent bufs = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bufs.ac.kr/html/00_main/default.aspx"));
        startActivity(bufs);
        }
        public void cycho(View v2){
        Intent cycho = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jbit.or.kr/~cycho/"));
        startActivity(cycho);
        }
}
