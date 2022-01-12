package com.example.videoapp

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class VideoViewWithMediaController : BaseActivity() {

    private val videoUrl = "https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4";
    override fun myView() = R.layout.video_with_media_controller_layout

    override fun activityCreated() {
        callVideo()
    }

    private fun callVideo() {
        // finding videoview by its id
        val videoView: VideoView = findViewById(R.id.videoView);

        // Uri object to refer the
        // resource from the videoUrl
        val uri: Uri = Uri.parse(videoUrl)

        // sets the resource from the
        // videoUrl to the videoView
        videoView.setVideoURI(uri)

        // creating object of
        // media controller class
        val mediaController = MediaController(this)

        // sets the anchor view
        // anchor view for the videoView
        mediaController.setAnchorView(videoView)

        // sets the media player to the videoView
        mediaController.setMediaPlayer(videoView)


        // sets the media controller to the videoView
        videoView.setMediaController(mediaController)

        videoView.start()
    }


}