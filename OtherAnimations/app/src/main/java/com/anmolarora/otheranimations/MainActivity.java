package com.anmolarora.otheranimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

        public void run (View view){

            ImageView shinchan = (ImageView) findViewById(R.id.shinchan);
            shinchan.animate()
                    .translationXBy(1000f)
                    .translationYBy(1000f)
                    .rotationBy(3600)
                    .setDuration(2000);


            // shinchan.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);  Change Size
            //shinchan.animate().rotation(1800).setDuration(1000); For rotation
            // shinchan.animate().translationXBy(-1000f).setDuration(1000); to move from right to left;

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ImageView shinchan = (ImageView) findViewById(R.id.shinchan);
         shinchan.setTranslationX(-1000f);
         shinchan.setTranslationY(-1000f);

        /*
        shinchan.setTranslationX(1000f); to set initial position off the screen to the right

        */

    }
}
