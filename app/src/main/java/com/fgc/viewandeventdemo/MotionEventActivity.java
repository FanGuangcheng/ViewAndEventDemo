package com.fgc.viewandeventdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.fgc.viewandeventdemo.event.EventLinearLayout;
import com.fgc.viewandeventdemo.event.EventTextView;

public class MotionEventActivity extends AppCompatActivity {
    public static final String MOTION_EVENT_TAG = "motion_event_demo";

    EventTextView eventTextView;
    EventLinearLayout eventLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_event);

        eventTextView = (EventTextView)findViewById(R.id.event_view);
        eventLinearLayout = (EventLinearLayout)findViewById(R.id.event_view_group_container);
     }
}
