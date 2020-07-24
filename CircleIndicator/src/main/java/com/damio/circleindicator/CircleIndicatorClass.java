package com.damio.circleindicator;

import android.content.Context;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CircleIndicatorClass extends AppCompatActivity {

    private LinearLayout mDotLayout;
    private TextView[] mDots;
    int position;
    Context context;

    public void addDotsIndicator(){

        mDots = new TextView[4];
        mDotLayout.removeAllViews();
        for (int i = 0; i < mDots.length; i++){
            mDots[i] = new TextView(context);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorPrimary));
            mDotLayout.addView(mDots[i]);
        }

        if(mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }
}
