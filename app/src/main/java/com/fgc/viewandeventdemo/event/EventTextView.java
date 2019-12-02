package com.fgc.viewandeventdemo.event;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.fgc.viewandeventdemo.MotionEventActivity;

@SuppressLint("AppCompatCustomView")
public class EventTextView extends TextView {
    public EventTextView(Context context) {
        super(context);
    }

    public EventTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public EventTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public EventTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d(MotionEventActivity.MOTION_EVENT_TAG, "EventTextView dispatchTouchEvent！ event action:" + event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(MotionEventActivity.MOTION_EVENT_TAG, "EventTextView onTouchEvent！ event action:" + event.getAction());
        return super.onTouchEvent(event);
    }
}
