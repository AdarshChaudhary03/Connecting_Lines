package com.example.dharamvirsingh.linedrawtest;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DrawView extends View{

    Paint paint = new Paint();
    View startView;
    View endView;


    public DrawView(Context context, View startView, View endView) {
        super(context);
        paint.setColor(Color.RED);
        this.startView=startView;
        this.endView=endView;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawLine(startView.getX()-10, startView.getY()+3,endView.getX()-5, endView.getY()+3,paint);
    }
}
