package com.example.report03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

class 내뷰 extends View {

    public 내뷰(Context context) {
        super(context);
    }

    public 내뷰(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void onDraw(Canvas canvas){
        Paint bluePen = new Paint();
        Paint redStrokePen = new Paint();
        Paint greenLinePen = new Paint();
        Paint whitePen = new Paint();
        Paint blueStrokePen = new Paint();
        Paint redPen = new Paint();
        Paint redLinePen = new Paint();
        Paint whiteLinePen = new Paint();


        whiteLinePen.setColor(Color.WHITE);
        whiteLinePen.setStrokeWidth(8);
        canvas.drawLine(300,800,700,800,whiteLinePen);

        whitePen.setColor(Color.WHITE);
        canvas.drawCircle(600,600,80,whitePen);

        greenLinePen.setColor(Color.GREEN);
        greenLinePen.setStrokeWidth( 8 );
        canvas.drawLine(100,600,500,500,greenLinePen);

        redLinePen.setColor(Color.RED);
        redLinePen.setStrokeWidth(8);
        canvas.drawLine(600,300,800,300,redLinePen);

        redStrokePen.setColor(Color.RED);
        redStrokePen.setStrokeWidth( 8 );
        redStrokePen.setStyle(Paint.Style.STROKE);
        canvas.drawRect(200,200,300,300,redStrokePen);

        redPen.setColor(Color.RED);
        canvas.drawRect(400,400,500,500,redPen);
        canvas.drawCircle(300,100,80,redPen);

        blueStrokePen.setColor(Color.BLUE);
        blueStrokePen.setStyle(Paint.Style.STROKE);
        blueStrokePen.setStrokeWidth( 6 );
        canvas.drawCircle(500,100,80,blueStrokePen);

        bluePen.setColor(Color.BLUE);
        canvas.drawCircle(100,100,80,bluePen);
    }
}
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
