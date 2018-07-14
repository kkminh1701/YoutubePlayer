package com.framgia.youtube;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YouTubeActivity extends YoutubeBaseActivity  {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.player_view);
        youTubePlayerView.initialize(Constants.DEVELOPER_KEY, this);
    }

    @Override
    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView) findViewById(R.id.player_view);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider,
            YouTubePlayer youTubePlayer, boolean b) {
        if(!b){
            youTubePlayer.cueVideo(Constants.KEY_VIDEO);
        }

    }
}
