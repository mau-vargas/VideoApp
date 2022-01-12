package com.example.videoapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, VideoViewWithMediaController::class.java))
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            startActivity(Intent(this, PlayerViewActivity::class.java))
        }

    }

}