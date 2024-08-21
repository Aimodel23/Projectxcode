package com.projectxcode;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class BackgroundPlaybackService extends Service {

    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize media player
        mediaPlayer = new MediaPlayer();
        // Configure media player if needed
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
