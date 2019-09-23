package com.example.practice1games;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView=findViewById(R.id.image);
        Bitmap b=Bitmap.createBitmap(300,500, Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(b);
        Paint drawPaint=new Paint();
        canvas.drawColor(Color.BLACK);
        drawPaint.setColor(Color.YELLOW);
        canvas.drawLine(10,50,200,50,drawPaint);
        canvas.drawRect(100,100,120,120,drawPaint);
        drawPaint.setColor(Color.RED);
        imageView.setImageBitmap(b);

        drawPaint.setTextSize(40);
        drawPaint.setColor(Color.GREEN);
        canvas.drawText("Hello Java",10,400,drawPaint);

        drawPaint.setTextSize(100);
        drawPaint.setColor(Color.YELLOW);
        canvas.drawText("Goodbye",10,450,drawPaint);

        }



}
