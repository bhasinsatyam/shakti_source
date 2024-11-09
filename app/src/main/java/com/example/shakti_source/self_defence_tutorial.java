package com.example.shakti_source;

import android.content.Intent;
import android.os.Bundle;

import android.webkit.WebChromeClient;
import android.webkit.WebView;


import androidx.appcompat.app.AppCompatActivity;



public class self_defence_tutorial extends AppCompatActivity  { // Implement YouTubePlayerListener interface



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_defence_tutorial);

        WebView webView = findViewById(R.id.webView);

        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KVpxP3ZZtAc?si=45Lwnvbz5z25CWg2\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        webView.loadData(video, "text/html","utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }



//    @Override
//    public void onApiChange(@NonNull YouTubePlayer youTubePlayer) {
//        // Handle API changes (optional)
//    }
//
//
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        youTubePlayerView.release(); // Release the player when the Activity is destroyed
//    }
}