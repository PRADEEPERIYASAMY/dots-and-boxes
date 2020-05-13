package com.example.tasktwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Nlevel extends AppCompatActivity {

    public Button previous;
    public Button next;
    public Button easy;
    public Button medium;
    public Button hard;
    public static int prevCount = 3;
    public static int nextCount = 2;
    public int level ;
    public static MediaPlayer mediaPlayer2 = null;
    public ConstraintLayout butHolder;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView ( R.layout.activity_nlevel );

        butHolder = findViewById ( R.id.butholder );
        previous = findViewById ( R.id.previous );
        next = findViewById ( R.id.next );
        easy = findViewById ( R.id.easy );
        medium = findViewById ( R.id.medium );
        hard = findViewById ( R.id.hard );
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
        final Animation zoomin = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.zoomin );
        final Animation fadein = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.fadein );
        final Animation fadeout = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.fadeout );
        butHolder.setAnimation ( zoomin );
        previous.setAnimation ( fadein );
        next.setAnimation ( fadeout );

        easy.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer1.start ();
                level = 1;
                splashSetter (level);
            }
        } );
        medium.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer1.start ();
                level = 2;
                splashSetter (2);
            }
        } );
        hard.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer1.start ();
                level = 3;
                splashSetter (level);
            }
        } );
        previous.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer.start ();
                if(prevCount == 1){
                    easy.setEnabled ( true );
                    easy.setVisibility ( View.VISIBLE );
                    medium.setEnabled ( false );
                    medium.setVisibility ( View.INVISIBLE );
                    hard.setEnabled ( false );
                    hard.setVisibility ( View.INVISIBLE );
                    prevCount = 3;
                    nextCount = 2;
                }
                else if(prevCount == 2){
                    easy.setEnabled ( false );
                    easy.setVisibility ( View.INVISIBLE );
                    medium.setEnabled ( true );
                    medium.setVisibility ( View.VISIBLE );
                    hard.setEnabled ( false );
                    hard.setVisibility ( View.INVISIBLE );
                    prevCount=1;
                    nextCount = 1;
                }
                else if(prevCount == 3){
                    easy.setEnabled ( false );
                    easy.setVisibility ( View.INVISIBLE );
                    medium.setEnabled ( false );
                    medium.setVisibility ( View.INVISIBLE );
                    hard.setEnabled ( true );
                    hard.setVisibility ( View.VISIBLE );
                    prevCount=2;
                    nextCount=3;
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
                    easy.setEnabled ( true );
                    easy.setVisibility ( View.VISIBLE );
                    medium.setEnabled ( false );
                    medium.setVisibility ( View.INVISIBLE );
                    hard.setEnabled ( false );
                    hard.setVisibility ( View.INVISIBLE );
                    prevCount=3;
                    nextCount=2;
                }
                else if(nextCount == 2){
                    easy.setEnabled ( false );
                    easy.setVisibility ( View.INVISIBLE );
                    medium.setEnabled ( true );
                    medium.setVisibility ( View.VISIBLE );
                    hard.setEnabled ( false );
                    hard.setVisibility ( View.INVISIBLE );
                    prevCount=1;
                    nextCount=1;
                }
                else if(nextCount == 1){
                    easy.setEnabled ( false );
                    easy.setVisibility ( View.INVISIBLE );
                    medium.setEnabled ( false );
                    medium.setVisibility ( View.INVISIBLE );
                    hard.setEnabled ( true );
                    hard.setVisibility ( View.VISIBLE );
                    prevCount=2;
                    nextCount=3;
                }
            }
        } );
    }

    @Override
    protected void onPause() {
        super.onPause ();
        overridePendingTransition ( android.R.anim.fade_in,android.R.anim.fade_out );
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
        Intent intent = new Intent ( getApplicationContext (),Index.class );
        startActivity ( intent );
    }

    public void splashSetter( int level){
        int integer = (int) (Math.random ()*8)+1;
        if(integer == 1){
            Intent intent = new Intent ( getApplicationContext () , Nsplashone.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
        else if(integer == 2){
            Intent intent = new Intent ( getApplicationContext () , Nsplashtwo.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
        else if(integer == 3){
            Intent intent = new Intent ( getApplicationContext () , Nsplashthree.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
        else if(integer == 4){
            Intent intent = new Intent ( getApplicationContext () , Hsplashone.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
        else if(integer == 5){
            Intent intent = new Intent ( getApplicationContext () , Hsplashtwo.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
        else if(integer == 6){
            Intent intent = new Intent ( getApplicationContext () , Hsplashthree.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
        else if(integer == 7){
            Intent intent = new Intent ( getApplicationContext () , HPsplashone.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
        else if(integer == 8){
            Intent intent = new Intent ( getApplicationContext () , HPsplashtwo.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
        else if(integer == 9){
            Intent intent = new Intent ( getApplicationContext () , HPsplashthree.class );
            intent.putExtra ( "level",level );
            startActivity ( intent );
        }
    }

}
