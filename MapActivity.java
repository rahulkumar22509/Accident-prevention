package com.example.mahesh.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MapActivity extends AppCompatActivity {

    RelativeLayout rl;
    int x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_map);

        /*rl = (RelativeLayout) findViewById(R.id.mapLayout);
        final ImageView iv = new ImageView(this);
        rl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = (int) rl.getX();
                y = (int) rl.getY();
                iv.setImageResource(R.drawable.car_icon);
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(50, 50);
                lp.leftMargin = x;
                lp.rightMargin = y;
                rl.addView(rl,lp);
                return true;
            }
        });*/
    }
}
