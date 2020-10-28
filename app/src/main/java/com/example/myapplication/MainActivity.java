package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable lightsAnimation;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ImageView imgFrame = (ImageView) findViewById(R.id.imageLights1);
        imgFrame.setBackgroundResource(R.drawable.animation);
        lightsAnimation = (AnimationDrawable) imgFrame.getBackground();

        Button startButton = (Button) findViewById(R.id.startButton);
        Button stopButton = (Button) findViewById(R.id.stopButton);


        startButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
        lightsAnimation.start();
            }
        });


        stopButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
        lightsAnimation.stop();
        startActivity(new Intent(MainActivity.this , Tween.class));
            }
        });



    }//end of oncreate
}