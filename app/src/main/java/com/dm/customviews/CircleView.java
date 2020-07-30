package com.dm.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class CircleView extends View {

    private Paint paint;
    private CircleParams params;

    public CircleView(Context context) {
        super(context);
        init();
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CircleView);
        CircleParams params = new CircleParams();
        params.color = a.getColor(R.styleable.CircleView_color, Color.BLACK);
        params.centerX = a.getInt(R.styleable.CircleView_center_x, 0);
        params.centerY = a.getInt(R.styleable.CircleView_center_y, 0);
        params.radius = a.getInt(R.styleable.CircleView_radius, 0);
        params.isFilled = a.getBoolean(R.styleable.CircleView_filled, true);
        a.recycle();
        setParams(params);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        params = new CircleParams();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        setupPaint();
    }

    private void setupPaint() {
        paint.setColor(params.color);
        paint.setStyle(params.isFilled ? Paint.Style.FILL : Paint.Style.STROKE);
        paint.setStrokeWidth(20);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(params.centerX, params.centerY,
                params.radius, paint);
        super.onDraw(canvas);
    }

    public void setParams(CircleParams params) {
        this.params = params;
        setupPaint();
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            params.centerX = (int) event.getX();
            params.centerY = (int) event.getY();
            setParams(params);
            return true;
        }
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            params.centerX = (int) event.getX();
            params.centerY = (int) event.getY();
            setParams(params);
            return true;
        }
        return true;
    }

    public static class CircleParams {
        int color;
        int centerX;
        int centerY;
        int radius;
        boolean isFilled;
    }
}
