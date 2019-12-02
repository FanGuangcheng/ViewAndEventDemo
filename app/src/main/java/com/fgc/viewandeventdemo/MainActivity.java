package com.fgc.viewandeventdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tvMotionEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMotionEvent = (Button)findViewById(R.id.tv_motion_event);
        tvMotionEvent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_motion_event:
                Intent intent = new Intent();
                intent.setClass(this, MotionEventActivity.class);
                startActivity(intent);
                break;
        }
    }
}
