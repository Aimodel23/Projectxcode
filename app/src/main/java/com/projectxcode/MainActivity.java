package com.projectxcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button downloadVideoButton;
    private Button downloadAudioButton;
    private Button backgroundPlaybackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        downloadVideoButton = findViewById(R.id.download_video_button);
        downloadAudioButton = findViewById(R.id.download_audio_button);
        backgroundPlaybackButton = findViewById(R.id.background_playback_button);

        // Set onClick listeners
        downloadVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoDownloader.class));
            }
        });

        downloadAudioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent
