package com.gift2bike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.jwdeveloper.tiktok.TikTokLive;

public class MainActivity extends AppCompatActivity {

    private TextView statusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusTextView = findViewById(R.id.statusTextView);
        statusTextView.setText("TikTok Live Gift Controller\nReady");
    }
}
