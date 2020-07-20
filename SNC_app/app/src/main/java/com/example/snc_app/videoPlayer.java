package com.example.snc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoPlayer extends AppCompatActivity {

    VideoView myVideo;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        myVideo = (VideoView)findViewById(R.id.videoView);

        mediaController = new MediaController(this);

        String videoPath = "android.resource://com.example.snc_app/" + R.raw.small;

        Uri uri = Uri.parse(videoPath);
        myVideo.setVideoURI(uri);
        myVideo.setMediaController(mediaController);
        mediaController.setAnchorView(myVideo);
        myVideo.start();

    }


}
