package com.colornative.lockapp.util;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.colornative.lockapp.R;


public class LaunchInterstitialActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Transparent);
        setContentView(new View(this));

    }

    boolean mCreated;
    @Override
    protected void onResume() {
        super.onResume();
        if (!mCreated) mCreated = true;
        else finish();
    }
}