package com.dm.customviews;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class OkCancelBar extends LinearLayout implements View.OnClickListener {

    public static final int ACTION_OK = 100;
    public static final int ACTION_CANCEL = 101;

    private BarClickListener listener;

    private Button cancelBtn;
    private Button okBtn;

    public OkCancelBar(Context context) {
        super(context);

        setOrientation(HORIZONTAL);
        setGravity(Gravity.CENTER);

        cancelBtn = new Button(context);
        okBtn = new Button(context);

        cancelBtn.setText("cancel");
        okBtn.setText("ok");

        cancelBtn.setOnClickListener(this);
        okBtn.setOnClickListener(this);

        addView(cancelBtn);
        addView(okBtn);
    }

    public void setBarClickListener(BarClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if (v == okBtn) {
            listener.onButtonClick(okBtn, ACTION_OK);
        } else if (v == cancelBtn){
            listener.onButtonClick(cancelBtn, ACTION_CANCEL);
        }
    }

    interface BarClickListener {
        void onButtonClick(Button button, int action);
    }
}
