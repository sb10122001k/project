package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vid = (VideoView) findViewById(R.id.videoView);
        vid.setVideoPath("android.resources//" + getPackageName() +"/" +R.raw.demovideo);
        vid.start();
        vid.stopPlayback();
    }
}