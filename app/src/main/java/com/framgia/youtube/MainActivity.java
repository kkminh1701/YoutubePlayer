package com.framgia.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.google.android.youtube.player.YouTubePlayer;

public class MainActivity extends AppCompatActivity {
    private ImageButton mButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button_click);
        mTextView = findViewById(R.id.text_name);
        String url = "http://img.youtube.com/vi/"+Constants.KEY_VIDEO+"/default.jpg";
        Glide.with(MainActivity.this).load(url).into(mButton);
        mTextView.setText(Constants.TITLE_VIDEO);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, YouTubeActivity.class);
                startActivity(intent);
            }
        });

    }
}
