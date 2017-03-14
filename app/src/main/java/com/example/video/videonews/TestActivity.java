package com.example.video.videonews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.video.videoplayer.part.SimpleVideoPlayer;

public class TestActivity extends AppCompatActivity {

    private SimpleVideoPlayer simpleVideoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Log.v("aaa","onCreate执行了");

        simpleVideoPlayer = (SimpleVideoPlayer) findViewById(R.id.test_svp);

        simpleVideoPlayer.setVideoPath(VideoUrlRes.getTestVideo1());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("aaa","onResume执行了");
        simpleVideoPlayer.onResume();
    }
// buildToolsVersion '25.0.0'
    @Override
    protected void onPause() {
        super.onPause();
        simpleVideoPlayer.onPause();
    }

}
