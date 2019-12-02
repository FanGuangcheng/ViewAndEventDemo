package com.fgc.viewandeventdemo.event;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.fgc.viewandeventdemo.MotionEventActivity;

public class EventLinearLayout extends LinearLayout {
    public EventLinearLayout(Context context) {
        super(context);
    }

    public EventLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public EventLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public EventLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d(MotionEventActivity.MOTION_EVENT_TAG, "EventLinearLayout dispatchTouchEvent！ event action:" + event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.d(MotionEventActivity.MOTION_EVENT_TAG, "EventLinearLayout onInterceptTouchEvent！ event action:" + event.getAction());
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(MotionEventActivity.MOTION_EVENT_TAG, "EventLinearLayout onTouchEvent！ event action:" + event.getAction());

        return super.onTouchEvent(event);
    }
}
