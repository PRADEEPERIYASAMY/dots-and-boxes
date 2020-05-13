package com.example.tasktwo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.Toast;

public class HPsplashone extends AppCompatActivity {

    public int level;
    public static int SPLASH_TIME_OUT = 5000;
    public ConstraintLayout progress;
    public Handler handler;
    public Runnable runnable;
    public MediaPlayer mediaPlayer;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView ( R.layout.activity_h_psplashone );
        mediaPlayer = MediaPlayer.create ( getApplicationContext (),R.raw.loading );
        mediaPlayer.start ();
        if(!mediaPlayer.isPlaying ()){
            mediaPlayer.start ();
        }
        Intent i = getIntent ();
        level = i.getExtras ().getInt ( "level" );
        progress = findViewById ( R.id.progress );
        Animation animation = AnimationUtils.loadAnimation ( this,R.anim.progress );
        animation.setDuration ( 5000 );
        progress.setAnimation ( animation );


        if(level ==1){
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), Nlevelone.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );}

        else if (level == 2) {
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), Nleveltwo.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );

        }
        else if (level == 3) {
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), Nlevelthree.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );
        }
        else if (level == 4) {
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), NoPlayers.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );
        }
        else if (level == 5) {
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), NoPlayers2.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );
        }
        else if (level == 6) {
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), NoPlayers3.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );
        }
        else if (level == 7) {
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), HPlevelone.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );
        }
        else if (level == 8) {
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), HPleveltwo.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );
        }
        else if (level == 9) {
            handler = new Handler ( );
            runnable =  new Runnable () {
                @Override
                public void run() {
                    Intent intent = new Intent ( getApplicationContext (), HPlevelthree.class );
                    startActivity ( intent );
                    finish ();
                }
            };
            handler.postDelayed (runnable, SPLASH_TIME_OUT );
        }


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed ();
        mediaPlayer.stop ();
        handler.removeCallbacks ( runnable );
        if(level == 1 || level == 2 || level == 3){
            Intent intent = new Intent ( getApplicationContext (),Nlevel.class );
            startActivity ( intent );
        }
        else if(level == 4 || level == 5 || level == 6){
            Intent intent = new Intent ( getApplicationContext (),Hlevel.class );
            startActivity ( intent );
            finishAffinity ();
        }
        else if(level == 7 || level == 8 || level == 9){
            Intent intent = new Intent ( getApplicationContext (),HPlevel.class );
            startActivity ( intent );

        }
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
