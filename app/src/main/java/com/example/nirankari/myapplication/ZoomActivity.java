package com.example.nirankari.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import static java.lang.Integer.*;

/**
 * Created by nirankari on 15/5/15.
 */
public class ZoomActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int stickerId  = getIntent().getIntExtra("stickerId", 0);
        setContentView(R.layout.monday);
        ImageView sticker = (ImageView) findViewById(stickerId);
        //Toast.makeText(getApplicationContext(), "hhhhhhhhhhhhhhh", Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(sticker), Toast.LENGTH_SHORT).show();
        sticker.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        sticker.setScaleType(ImageView.ScaleType.FIT_XY);
       // setContentView(R.layout.monday);
      //  Toast.makeText(getApplicationContext(), imageId, Toast.LENGTH_SHORT).show();


    }
}
