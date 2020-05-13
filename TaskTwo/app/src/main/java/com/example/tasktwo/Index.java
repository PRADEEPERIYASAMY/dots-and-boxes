package com.example.tasktwo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Index extends AppCompatActivity {

    public Button previous;
    public Button next;
    public Button normal;
    public Button hacker;
    public Button hackerPlus;
    public ConstraintLayout butHolder;
    public static int prevCount = 3;
    public static int nextCount = 2;
    public static MediaPlayer mediaPlayer2;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView ( R.layout.activity_index );
        previous = findViewById ( R.id.previous );
        next = findViewById ( R.id.next );
        normal = findViewById ( R.id.easy );
        hacker = findViewById ( R.id.medium );
        hackerPlus = findViewById ( R.id.hard );
        butHolder = findViewById ( R.id.butholder );
        final Animation zoomin = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.zoomin );
        final Animation fadein = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.fadein );
        final Animation fadeout = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.fadeout );
        butHolder.setAnimation ( zoomin );
        previous.setAnimation ( fadein );
        next.setAnimation ( fadeout );
        final MediaPlayer mediaPlayer ;
        mediaPlayer = MediaPlayer.create ( getApplicationContext (),R.raw.click );
        final MediaPlayer mediaPlayer1 ;
        mediaPlayer1 = MediaPlayer.create ( getApplicationContext (),R.raw.unknown );
        mediaPlayer2 = MediaPlayer.create ( getApplicationContext (),R.raw.beat );
        mediaPlayer2.start ();
        mediaPlayer2.setLooping ( true );
        if(!mediaPlayer2.isPlaying ()){
            mediaPlayer2.start ();
            mediaPlayer2.setLooping ( true );
        }

        normal.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer1.start ();
                Intent intent = new Intent ( getApplicationContext () , Nlevel.class );
                startActivity ( intent );
            }
        } );
        hacker.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer1.start ();
                Intent intent = new Intent ( getApplicationContext () , Hlevel.class );
                startActivity ( intent );
            }
        } );
        hackerPlus.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer1.start ();
                Intent intent = new Intent ( getApplicationContext () , HPlevel.class );
                startActivity ( intent );
            }
        } );
        previous.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer.start ();
                if(prevCount == 1){
                    normal.setEnabled ( true );
                    normal.setVisibility ( View.VISIBLE );
                    hacker.setEnabled ( false );
                    hacker.setVisibility ( View.INVISIBLE );
                    hackerPlus.setEnabled ( false );
                    hackerPlus.setVisibility ( View.INVISIBLE );
                    prevCount = 3;
                    nextCount = 2;
                }
                else if(prevCount == 2){
                    normal.setEnabled ( false );
                    normal.setVisibility ( View.INVISIBLE );
                    hacker.setEnabled ( true );
                    hacker.setVisibility ( View.VISIBLE );
                    hackerPlus.setEnabled ( false );
                    hackerPlus.setVisibility ( View.INVISIBLE );
                    prevCount = 1;
                    nextCount = 1;
                }
                else if(prevCount == 3){
                    normal.setEnabled ( false );
                    normal.setVisibility ( View.INVISIBLE );
                    hacker.setEnabled ( false );
                    hacker.setVisibility ( View.INVISIBLE );
                    hackerPlus.setEnabled ( true );
                    hackerPlus.setVisibility ( View.VISIBLE );
                    nextCount = 3;
                    prevCount = 2;
                }
            }
        } );
        next.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer.start ();
                if(nextCount == 3){
                    normal.setEnabled ( true );
                    normal.setVisibility ( View.VISIBLE );
                    hacker.setEnabled ( false );
                    hacker.setVisibility ( View.INVISIBLE );
                    hackerPlus.setEnabled ( false );
                    hackerPlus.setVisibility ( View.INVISIBLE );
                    prevCount = 3;
                    nextCount = 2;
                }
                else if(nextCount == 2){
                    normal.setEnabled ( false );
                    normal.setVisibility ( View.INVISIBLE );
                    hacker.setEnabled ( true );
                    hacker.setVisibility ( View.VISIBLE );
                    hackerPlus.setEnabled ( false );
                    hackerPlus.setVisibility ( View.INVISIBLE );
                    prevCount = 1;
                    nextCount = 1;
                }
                else if(nextCount == 1){
                    normal.setEnabled ( false );
                    normal.setVisibility ( View.INVISIBLE );
                    hacker.setEnabled ( false );
                    hacker.setVisibility ( View.INVISIBLE );
                    hackerPlus.setEnabled ( true );
                    hackerPlus.setVisibility ( View.VISIBLE );
                    nextCount = 3;
                    prevCount = 2;
                }
            }
        } );
    }

    @Override
    protected void onPause() {
        super.onPause ();
        mediaPlayer2.stop ();
        overridePendingTransition ( android.R.anim.fade_in,android.R.anim.fade_out );
    }

    @Override
    protected void onStop() {
        super.onStop ();
        mediaPlayer2.stop ();
    }

    @Override
    protected void onResume() {
        super.onResume ();
        if(!mediaPlayer2.isPlaying ()){
            mediaPlayer2 = MediaPlayer.create ( getApplicationContext (),R.raw.beat );
            mediaPlayer2.start ();
            mediaPlayer2.setLooping ( true );
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed ();
        finishAffinity ();
        System.exit ( 0 );
    }
}
