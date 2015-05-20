package com.example.customfontandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);
        
        FontComic font = new FontComic(this);
        font.setText("Hallo Cak Galih Adityoooooo");
        
        layout.addView(font);
        
    }
}
