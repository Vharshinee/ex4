package com.example.vharshinee.ex4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
        //circle();
        //  rect();
    }



    public class MyView extends View {
        public MyView(Context context) {
            super(context);
            // TODO Auto-generated constructor stub
        }


        @Override
        protected void onDraw(Canvas canvas) {
            // TODO Auto-generated method stub
            super.onDraw(canvas);
            int r = getWidth();
            int q = getHeight();
            int radius;
            radius = 100;
//            LinearLayout l1=(LinearLayout)findViewById(R.id.ll);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            // Use Color.parseColor to define HTML colors
            paint.setColor(Color.parseColor("#CD5C5C"));
            canvas.drawCircle(r / 2, q / 2, radius, paint);
            paint.setColor(Color.GREEN);
           canvas.drawRect(50,50,200,300, paint);
            //canvas.clipRect(25,25,100,150);
            //canvas.clipRect(100,50,100,50);
            paint.setColor(Color.BLUE);
            RectF oval = new RectF(250, 50, 350, 400);
            canvas.drawOval(oval, paint);

            //int h = getHeight();
            //int w = getWidth();
            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(10);
            canvas.drawLine(400,600,250,600,paint);
           // canvas.drawRect(0,0,w,h,paint);

            Path path = new Path();
            path.moveTo(700,800);
            path.lineTo(800,900);
            //path.moveTo(500,800);
            path.lineTo(900,700);
            path.lineTo(700,800);
           // path.lineTo(1100,700);
            //path.close();
            paint.setColor(Color.CYAN);
            canvas.drawPath(path, paint);

           // canvas.(150,150,100,150,paint);*/
        }
    }
}

