package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private BaseSurface mSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSurfaceView = findViewById(R.id.surfaceView);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        // start the drawing
        mSurfaceView.startDrawThread();
    }

    @Override
    protected void onPause()
    {
        // stop the drawing to save cpu time
        mSurfaceView.stopDrawThread();
        super.onPause();
    }
}