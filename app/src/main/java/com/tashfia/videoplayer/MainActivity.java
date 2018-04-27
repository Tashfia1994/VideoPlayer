package com.tashfia.videoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView view;
    MediaController controller;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=(VideoView)findViewById(R.id.videoView);
        controller=new MediaController(this);

        view.setMediaController(controller);
        view.setVideoURI(Uri.parse("android.resource://com.tashfia.videoplayer/raw/video"));
        view.start();

    }
}
