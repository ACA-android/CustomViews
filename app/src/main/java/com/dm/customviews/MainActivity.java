package com.dm.customviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = findViewById(R.id.layout);

        CircleView circleView = findViewById(R.id.circleView);
//        CircleView.CircleParams params = new CircleView.CircleParams();
//        params.isFilled = true;
//        params.centerX = 300;
//        params.centerY = 300;
//        params.color = Color.YELLOW;
//        params.radius = 200;
//        circleView.setParams(params);


//        OkCancelBar okCancelBar = new OkCancelBar(this);
////        layout.addView(okCancelBar);
////
////        okCancelBar.setBarClickListener(new OkCancelBar.BarClickListener() {
////            @Override
////            public void onButtonClick(Button button, int action) {
////                switch (action) {
////                    case OkCancelBar.ACTION_OK:
////                        Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
////                        break;
////                    case OkCancelBar.ACTION_CANCEL:
////                        Toast.makeText(MainActivity.this, "cancel", Toast.LENGTH_SHORT).show();
////                        break;
////                }
////            }
////        });

//        for (int i=0;i<20;i++){
//            MyTextView textView = new MyTextView(this);
//            textView.setText("Hello custom text view");
//            textView.setTextSize(20);
//
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
//            );
//            params.gravity = Gravity.CENTER;
//            params.topMargin = 18;
//            textView.setLayoutParams(params);
//            layout.addView(textView);
//        }


    }
}