package com.fragmentlifecycle;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private void logd(String msg) {
        Log.d("Bill", "MainActivity " + msg);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        logd("onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        logd("onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            int key = savedInstanceState.getInt("key", 0);
            logd("onCreate key:" + key);
        }
    }

    @Override
    protected void onRestart() {
        logd("onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        logd("onStart");
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        logd("onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        int key = savedInstanceState.getInt("key", 0);
        logd("onRestoreInstanceState key:" + key);
    }

    @Override
    protected void onResume() {
        logd("onResume");
        super.onResume();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        logd("onWindowFocusChanged:" + hasFocus);
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    protected void onPause() {
        logd("onPause");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        logd("onSaveInstanceState");
        super.onSaveInstanceState(outState);
        outState.putInt("key", 250);
    }

    @Override
    protected void onStop() {
        logd("onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        logd("onDestroy");
        super.onDestroy();
    }

}
