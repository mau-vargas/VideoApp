package com.example.videoapp

import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerView

class PlayerViewActivity : BaseActivity() {
    private val videoUrl =
        "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4";
    private var videoPlayer: SimpleExoPlayer? = null

    override fun myView() = R.layout.player_view_layout

    override fun activityCreated() {
        initializePlayer()
    }


    private fun initializePlayer() {
        videoPlayer = SimpleExoPlayer.Builder(this)
            .build()
            .also { exoPlayer ->
                findViewById<PlayerView>(R.id.video_view_2).player = exoPlayer

                val mediaItem = MediaItem.fromUri(videoUrl)
                exoPlayer.playWhenReady = true
                exoPlayer.setMediaItem(mediaItem)
                exoPlayer.prepare()
            }
    }

    override fun onResume() {
        super.onResume()
        videoPlayer?.playWhenReady = true
    }

    override fun onStop() {
        super.onStop()
        videoPlayer?.playWhenReady = false
        if (isFinishing) {
            releasePlayer()
        }
    }

    private fun releasePlayer() {
        videoPlayer?.release()
    }

}