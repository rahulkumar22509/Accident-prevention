package com.example.mahesh.traffic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    int a=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView map = (ImageView) findViewById(R.id.traffic_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,MapActivity.class);
                startActivity(mainIntent);
            }
        });

        final ImageView leftIndicator = (ImageView) findViewById(R.id.left_ind);
        final ImageView rightIndicator = (ImageView) findViewById(R.id.right_ind);

        leftIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0) {
                    if(b==1) {
                        rightIndicator.setImageResource(R.drawable.right);
                        b=0;
                    }
                    leftIndicator.setImageResource(R.drawable.left_sel);
                    a=1;
                }
                else {
                    leftIndicator.setImageResource(R.drawable.left);
                    a=0;
                }
            }
        });
        rightIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b==0) {
                    if(a==1){
                        leftIndicator.setImageResource(R.drawable.left);
                        a=0;
                    }
                    rightIndicator.setImageResource(R.drawable.right_sel);
                    b=1;
                }
                else {
                    rightIndicator.setImageResource(R.drawable.right);
                    b=0;
                }
            }
        });

    }
}
