package com.example.report01;

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

    public void onClick(View v) {
        Intent 이동 = new Intent();
        이동.setAction(Intent.ACTION_VIEW);
        이동.setData(Uri.parse("https://www.bufs.ac.kr/"));
        startActivity(이동);
    }

    public void Click(View v) {
        Intent 이동 = new Intent();
        이동.setAction(Intent.ACTION_VIEW);
        이동.setData(Uri.parse("https://www.jbit.or.kr/~cycho/"));
        startActivity(이동);
    }
}
