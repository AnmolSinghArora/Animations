package com.anmolarora.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView shinchan = (ImageView) findViewById(R.id.shinchan);
        ImageView shiro = (ImageView) findViewById(R.id.shiro);

        shinchan.animate().alpha(0f).setDuration(2000);
        shiro.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
