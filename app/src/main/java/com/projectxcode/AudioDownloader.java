package com.projectxcode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AudioDownloader extends AppCompatActivity {

    private EditText audioUrlEditText;
    private Button downloadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_download_options);

        audioUrlEditText = findViewById(R.id.audio_url_edit_text);
        downloadButton = findViewById(R.id.download_button);
