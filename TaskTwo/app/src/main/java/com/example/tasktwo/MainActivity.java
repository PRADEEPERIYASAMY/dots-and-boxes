package com.example.tasktwo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;
    public int count = 1;
    public static MediaPlayer mediaPlayer;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView ( R.layout.activity_main );
        mediaPlayer = MediaPlayer.create ( getApplicationContext (),R.raw.loading );
        mediaPlayer.start ();
        if(!mediaPlayer.isPlaying ()){
            mediaPlayer.start ();
        }

        new Handler (  ).postDelayed ( new Runnable () {
            @Override
            public void run() {
                Intent intent = new Intent ( getApplicationContext (),Index.class );
                startActivity ( intent );
                finish ();
            }
        },SPLASH_TIME_OUT );
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed ();
        System.exit ( 0 );
    }

    @Override
    protected void onPause() {
        super.onPause ();
        overridePendingTransition ( android.R.anim.fade_in,android.R.anim.fade_out );
        mediaPlayer.pause ();
    }

    @Override
    protected void onResume() {
        super.onResume ();
        if(!mediaPlayer.isPlaying ()){
            mediaPlayer = MediaPlayer.create ( getApplicationContext (),R.raw.bgm );
            mediaPlayer.start ();
        }
    }
}
