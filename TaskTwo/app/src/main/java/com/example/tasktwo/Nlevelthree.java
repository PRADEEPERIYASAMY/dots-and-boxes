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
import android.widget.TextView;
import android.widget.Toast;

public class Nlevelthree extends AppCompatActivity {

    public static int count = 1;
    public int type1 = 0 ;
    public int type2 = 1 ;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public Button button12;
    public Button button13;
    public Button button14;
    public Button button15;
    public Button button16;
    public Button button17;
    public Button button18;
    public Button button19;
    public Button button20;
    public Button button21;
    public Button button22;
    public Button button23;
    public Button button24;
    public Button button25;
    public Button button26;
    public Button button27;
    public Button button28;
    public Button button29;
    public Button button30;
    public Button button31;
    public Button button32;
    public Button button33;
    public Button button34;
    public Button button35;
    public Button button36;
    public Button button37;
    public Button button38;
    public Button button39;
    public Button button40;
    public Button button41;
    public Button button42;
    public Button button43;
    public Button button44;
    public Button button45;
    public Button button46;
    public Button button47;
    public Button button48;
    public Button button49;
    public Button yes;
    public Button no;
    public Button quit;
    public Button no2;
    public Button yes2;
    public ConstraintLayout con1;
    public ConstraintLayout con2;
    public ConstraintLayout con3;
    public ConstraintLayout con4;
    public ConstraintLayout con5;
    public ConstraintLayout con6;
    public ConstraintLayout con7;
    public ConstraintLayout con8;
    public ConstraintLayout con9;
    public ConstraintLayout con10;
    public ConstraintLayout con11;
    public ConstraintLayout con12;
    public ConstraintLayout con13;
    public ConstraintLayout con14;
    public ConstraintLayout con15;
    public ConstraintLayout con16;
    public ConstraintLayout con17;
    public ConstraintLayout con18;
    public ConstraintLayout con19;
    public ConstraintLayout con20;
    public ConstraintLayout conQuit;
    public ConstraintLayout winScreen;
    public ConstraintLayout pointer1;
    public ConstraintLayout pointer2;

    public static int stark = 0;
    public static int steve = 0;
    public int winnerCount = 0;
    public TextView score1;
    public TextView score2;
    public TextView winner;
    public static MediaPlayer mediaPlayer;
    public static MediaPlayer mediaPlayer1;
    public static MediaPlayer mediaPlayer2;
    public static MediaPlayer mediaPlayer3;
    public static MediaPlayer mediaPlayer4;
    public Animation up;
    public Animation down;
    public Animation zoom;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView ( R.layout.activity_nlevelthree );
        mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.secondclick );
        mediaPlayer1 = MediaPlayer.create ( getApplicationContext (), R.raw.undo );
        mediaPlayer3 = MediaPlayer.create ( getApplicationContext (), R.raw.quit );
        mediaPlayer4 = MediaPlayer.create ( getApplicationContext (), R.raw.shutter );
        mediaPlayer2 = MediaPlayer.create ( getApplicationContext (), R.raw.bgm );
        mediaPlayer2.start ();
        mediaPlayer2.setLooping ( true );
        if(!mediaPlayer2.isPlaying ()){
            mediaPlayer2.start ();
            mediaPlayer2.setLooping ( true );
        }
        winnerCount = 0;
        steve = 0;
        stark = 0;

        button1 = findViewById ( R.id.b1 );
        button2 = findViewById ( R.id.b2 );
        button3 = findViewById ( R.id.b3 );
        button4 = findViewById ( R.id.b4 );
        button5 = findViewById ( R.id.b5 );
        button6 = findViewById ( R.id.b6 );
        button7 = findViewById ( R.id.b7 );
        button8 = findViewById ( R.id.b8 );
        button9 = findViewById ( R.id.b9 );
        button10 = findViewById ( R.id.b10);
        button11 = findViewById ( R.id.b11 );
        button12 = findViewById ( R.id.b12 );
        button13 = findViewById ( R.id.b13 );
        button14 = findViewById ( R.id.b14 );
        button15 = findViewById ( R.id.b15 );
        button16 = findViewById ( R.id.b16 );
        button17 = findViewById ( R.id.b17 );
        button18 = findViewById ( R.id.b18 );
        button19 = findViewById ( R.id.b19 );
        button20 = findViewById ( R.id.b20 );
        button21 = findViewById ( R.id.b21 );
        button22 = findViewById ( R.id.b22 );
        button23 = findViewById ( R.id.b23 );
        button24 = findViewById ( R.id.b24 );
        button25 = findViewById ( R.id.b25 );
        button26 = findViewById ( R.id.b26 );
        button27 = findViewById ( R.id.b27 );
        button28 = findViewById ( R.id.b28 );
        button29 = findViewById ( R.id.b29 );
        button30= findViewById ( R.id.b30 );
        button31= findViewById ( R.id.b31 );
        button32 = findViewById ( R.id.b32 );
        button33 = findViewById ( R.id.b33 );
        button34 = findViewById ( R.id.b34 );
        button35 = findViewById ( R.id.b35 );
        button36 = findViewById ( R.id.b36 );
        button37 = findViewById ( R.id.b37 );
        button38 = findViewById ( R.id.b38 );
        button39 = findViewById ( R.id.b39 );
        button40= findViewById ( R.id.b40 );
        button41 = findViewById ( R.id.b41 );
        button42 = findViewById ( R.id.b42 );
        button43 = findViewById ( R.id.b43 );
        button44 = findViewById ( R.id.b44 );
        button45 = findViewById ( R.id.b45 );
        button46 = findViewById ( R.id.b46 );
        button47 = findViewById ( R.id.b47 );
        button48 = findViewById ( R.id.b48 );
        button49 = findViewById ( R.id.b49 );

        quit = findViewById ( R.id.quit );
        yes = findViewById ( R.id.yes );
        no = findViewById ( R.id.no );
        yes2 = findViewById ( R.id.yes2 );
        no2 = findViewById ( R.id.no2 );

        con1 = findViewById ( R.id.con1 );
        con2 = findViewById ( R.id.con2 );
        con3 = findViewById ( R.id.con3 );
        con4 = findViewById ( R.id.con4 );
        con5 = findViewById ( R.id.con5 );
        con6 = findViewById ( R.id.con6 );
        con7 = findViewById ( R.id.con7 );
        con8 = findViewById ( R.id.con8 );
        con9 = findViewById ( R.id.con9 );
        con10 = findViewById ( R.id.con10 );
        con11 = findViewById ( R.id.con11 );
        con12 = findViewById ( R.id.con12 );
        con13 = findViewById ( R.id.con13 );
        con14 = findViewById ( R.id.con14 );
        con15 = findViewById ( R.id.con15 );
        con16 = findViewById ( R.id.con16 );
        con17 = findViewById ( R.id.con17 );
        con18 = findViewById ( R.id.con18 );
        con19 = findViewById ( R.id.con19 );
        con20 = findViewById ( R.id.con20 );
        conQuit = findViewById ( R.id.conquit );
        winScreen = findViewById ( R.id.winScreen );
        winner = findViewById ( R.id.textView );
        pointer1 = findViewById ( R.id.pointer1 );
        pointer2 = findViewById ( R.id.pointer2 );

        score1 = findViewById ( R.id.score1 );
        score2 = findViewById ( R.id.score2 );

        conQuit.setVisibility ( View.INVISIBLE );
        conQuit.setEnabled ( false );
        yes.setEnabled ( false );
        no.setEnabled ( false );
        winScreen.setVisibility ( View.INVISIBLE );
        winScreen.setEnabled ( false );
        yes2.setEnabled ( false );
        no2.setEnabled ( false );

        pointer1.setVisibility ( View.VISIBLE );
        pointer2.setVisibility ( View.INVISIBLE );

        score1.setText ( String.valueOf ( stark ) );
        score2.setText ( String.valueOf ( steve ) );

        button1.setOnClickListener ( single ( button2,button3,button4,con1,type2 ) );
        button2.setOnClickListener ( single ( button1,button3,button4,con1,type1 ) );
        button3.setOnClickListener ( Double ( button1,button2,button4,button5,button6,button7,con1,con2,type2 ) );
        button4.setOnClickListener ( Double ( button1,button2,button3,button14,button15,button16,con1,con5,type1 ) );
        button5.setOnClickListener ( single ( button3,button6,button7,con2,type1 ) );
        button6.setOnClickListener ( Double ( button3,button5,button7,button8,button9,button10,con2,con3,type2 ) );
        button7.setOnClickListener ( Double ( button3,button5,button6,button15,button17,button18,con2,con6,type1 ) );
        button8.setOnClickListener ( single ( button6,button9,button10,con3,type1 ) );
        button9.setOnClickListener ( Double ( button6,button8,button10,button11,button12,button13,con3,con4,type2 ) );
        button10.setOnClickListener ( Double ( button6,button8,button9,button17,button19,button20,con3,con7,type1 ) );
        button11.setOnClickListener ( single ( button9,button12,button13,con4,type1 ) );
        button12.setOnClickListener ( single ( button9,button11,button13,con4,type2 ) );
        button13.setOnClickListener ( Double ( button9,button11,button12,button19,button21,button22,con4,con8,type1 ) );
        button14.setOnClickListener ( single ( button4,button15,button16,con5,type2 ) );
        button15.setOnClickListener ( Double ( button4,button14,button16,button7,button17,button18,con5,con6,type2 ) );
        button16.setOnClickListener ( Double ( button14,button4,button15,button23,button24,button25,con5,con9,type1 ) );
        button17.setOnClickListener ( Double ( button15,button7,button18,button10,button19,button20,con6,con7,type2 ) );
        button18.setOnClickListener ( Double ( button15,button7,button17,button24,button27,button26,con6,con10,type1 ) );
        button19.setOnClickListener ( Double ( button17,button10,button20,button13,button21,button22,con7,con8,type2 ) );
        button20.setOnClickListener ( Double ( button17,button10,button19,button26,button28,button29,con7,con11,type1 ) );
        button21.setOnClickListener ( single ( button19,button13,button22,con8,type2 ) );
        button22.setOnClickListener ( Double ( button19,button13,button21,button28,button30,button31,con8,con12,type1 ) );
        button23.setOnClickListener ( single ( button16,button24,button25,con9,type2 ) );
        button24.setOnClickListener ( Double ( button16,button23,button25,button18,button26,button27,con9,con10,type2 ) );
        button25.setOnClickListener ( Double ( button16,button23,button24,button32,button34,button33,con9,con13,type1 ) );
        button26.setOnClickListener ( Double ( button18,button24,button27,button20,button28,button29,con10,con11,type2 ) );
        button27.setOnClickListener ( Double ( button18,button24,button26,button33,button36,button35,con10,con14,type1 ) );
        button28.setOnClickListener ( Double ( button26,button20,button29,button22,button30,button31,con11,con12,type2 ) );
        button29.setOnClickListener ( Double ( button26,button20,button28,button35,button38,button37,con11,con15,type1 ) );
        button30.setOnClickListener ( single ( button28,button22,button31,con12,type2 ) );
        button31.setOnClickListener ( Double ( button28,button12,button30,button37,button40,button39,con12,con16,type1 ) );
        button32.setOnClickListener ( single ( button25,button33,button34,con13,type2 ) );
        button33.setOnClickListener ( Double ( button32,button25,button34,button27,button35,button36,con13,con14,type2 ) );
        button34.setOnClickListener ( Double ( button32,button25,button33,button41,button43,button42,con13,con17,type1 ) );
        button35.setOnClickListener ( Double ( button33,button27,button36,button29,button37,button38,con14,con15,type2 ) );
        button36.setOnClickListener ( Double ( button33,button27,button35,button42,button45,button44,con14,con18,type1 ) );
        button37.setOnClickListener ( Double ( button29,button35,button38,button31,button39,button40,con15,con16,type2 ) );
        button38.setOnClickListener ( Double ( button35,button29,button37,button44,button47,button46,con15,con19,type1 ) );
        button39.setOnClickListener ( single ( button31,button37,button40,con16,type2 ) );
        button40.setOnClickListener ( Double ( button37,button31,button39,button46,button49,button48,con16,con20,type1 ) );
        button41.setOnClickListener ( single ( button34,button42,button43,con17,type2 ) );
        button42.setOnClickListener ( Double ( button34,button41,button43,button36,button44,button45,con17,con18,type2 ) );
        button43.setOnClickListener ( single ( button34,button42,button41,con17,type1 ) );
        button44.setOnClickListener ( Double ( button36,button42,button45,button38,button46,button47,con18,con19,type2 ) );
        button45.setOnClickListener ( single ( button36,button42,button44,con18,type1 ) );
        button46.setOnClickListener ( Double ( button38,button44,button47,button49,button48,button40,con19,con20,type2 ) );
        button47.setOnClickListener ( single ( button44,button38,button46,con19,type1 ) );
        button48.setOnClickListener ( single ( button49,button46,button40,con20,type2 ) );
        button49.setOnClickListener ( single ( button46,button40,button48,con20,type1 ) );

        quit.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer4.start ();
                mediaPlayer3.start ();
                conQuit.setVisibility ( View.VISIBLE );
                down = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.down );
                down.setDuration ( 600 );
                conQuit.setAnimation ( down );
                conQuit.setEnabled ( true );
                buttonFalse ();
                yes.setEnabled ( true );
                no.setEnabled ( true );
                yes.setOnClickListener ( new View.OnClickListener () {
                    @Override
                    public void onClick( View v ) {
                        Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                        vibrator.vibrate ( 100 );
                        mediaPlayer3.start ();
                        Intent intent = new Intent ( getApplicationContext (), Nlevel.class );
                        startActivity ( intent );
                    }
                } );

                no.setOnClickListener ( new View.OnClickListener () {
                    @Override
                    public void onClick( View v ) {
                        Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                        vibrator.vibrate ( 100 );
                        mediaPlayer4.start ();
                        up = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.up );
                        up.setDuration ( 600 );
                        conQuit.setAnimation ( up );
                        mediaPlayer3.start ();
                        yes.setEnabled ( false );
                        no.setEnabled ( false );
                        conQuit.setVisibility ( View.INVISIBLE );
                        conQuit.setEnabled ( false );
                        buttonTrue ();
                    }
                } );
            }
        } );

        yes2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer3.start ();
                Intent intent = new Intent ( getApplicationContext (), Nlevel.class );
                startActivity ( intent );

            }
        } );
        no2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                up = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.up );
                up.setDuration ( 600 );
                winScreen.setAnimation ( up );
                mediaPlayer3.start ();
                recreate ();
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
            mediaPlayer2 = MediaPlayer.create ( getApplicationContext (),R.raw.bgm );
            mediaPlayer2.start ();
            mediaPlayer2.setLooping ( true );
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed ();
        Intent intent = new Intent ( getApplicationContext (), Nlevel.class );
        startActivity ( intent );
    }

    public View.OnClickListener single( final Button button1, final Button button2, final Button button3, final ConstraintLayout con, final int type ) {
        View.OnClickListener onClickListener = new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                winnerCount++;
                mediaPlayer.start ();
                Button b = (Button) v;
                b.setEnabled ( false );
                zoom = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.zoomin );
                zoom.setDuration ( 60 );
                b.setAnimation ( zoom );
                if (count % 2 != 0) {
                    if (type == 0) {
                        b.setBackgroundResource ( R.drawable.butone );
                    } else {
                        b.setBackgroundResource ( R.drawable.butonea );
                    }
                } else if (count % 2 == 0) {
                    if (type == 0) {
                        b.setBackgroundResource ( R.drawable.buto );
                    } else {
                        b.setBackgroundResource ( R.drawable.butoa );
                    }
                }
                if (!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled ()) {
                    if (count % 2 != 0) {
                        con.setBackgroundResource ( R.drawable.areaone );
                        stark ();
                        count--;
                    } else if (count % 2 == 0) {
                        con.setBackgroundResource ( R.drawable.areatwo );
                        steve ();
                        count--;
                    }
                }
                if(count%2 != 0){
                    pointer2.setVisibility ( View.VISIBLE );
                    pointer1.setVisibility ( View.INVISIBLE );
                }
                else {
                    pointer2.setVisibility ( View.INVISIBLE );
                    pointer1.setVisibility ( View.VISIBLE );
                }
                count++;
                if(winnerCount == 49){
                    mediaPlayer2.stop ();
                }
                check ();
            }
        };

        return onClickListener;
    }

    public View.OnClickListener Double( final Button button1, final Button button2, final Button button3, final Button button5, final Button button6, final Button button7, final ConstraintLayout con1, final ConstraintLayout con2, final int type ) {
        View.OnClickListener onClickListeners = new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                winnerCount++;
                mediaPlayer.start ();
                Button b = (Button) v;
                b.setEnabled ( false );
                zoom = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.zoomin );
                zoom.setDuration ( 60 );
                b.setAnimation ( zoom );
                if (count % 2 != 0) {
                    if (type == 0) {
                        b.setBackgroundResource ( R.drawable.butone );
                    } else {
                        b.setBackgroundResource ( R.drawable.butonea );
                    }
                } else if (count % 2 == 0) {
                    if (type == 0) {
                        b.setBackgroundResource ( R.drawable.buto );
                    } else {
                        b.setBackgroundResource ( R.drawable.butoa );
                    }
                }
                if (!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled () && !button5.isEnabled () && !button6.isEnabled () && !button7.isEnabled ()) {
                    if (count % 2 != 0) {
                        con1.setBackgroundResource ( R.drawable.areaone );
                        con2.setBackgroundResource ( R.drawable.areaone );
                        stark ();
                        stark ();
                        count--;
                    } else if (count % 2 == 0) {
                        con1.setBackgroundResource ( R.drawable.areatwo );
                        con2.setBackgroundResource ( R.drawable.areatwo );
                        steve ();
                        steve ();
                        count--;
                    }
                } else if (!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled ()) {
                    if (count % 2 != 0) {
                        con1.setBackgroundResource ( R.drawable.areaone );
                        stark ();
                        count--;
                    } else if (count % 2 == 0) {
                        con1.setBackgroundResource ( R.drawable.areatwo );
                        steve ();
                        count--;
                    }
                } else if (!b.isEnabled () && !button5.isEnabled () && !button6.isEnabled () && !button7.isEnabled ()) {
                    if (count % 2 != 0) {
                        con2.setBackgroundResource ( R.drawable.areaone );
                        stark ();
                        count--;
                    } else if (count % 2 == 0) {
                        con2.setBackgroundResource ( R.drawable.areatwo );
                        steve ();
                        count--;
                    }
                }
                if(count%2 != 0){
                    pointer2.setVisibility ( View.VISIBLE );
                    pointer1.setVisibility ( View.INVISIBLE );
                }
                else {
                    pointer2.setVisibility ( View.INVISIBLE );
                    pointer1.setVisibility ( View.VISIBLE );
                }
                count++;
                if(winnerCount == 49){
                    mediaPlayer2.stop ();
                }
                check ();
            }
        };

        return onClickListeners;
    }

    public void stark() {
        stark++;
        score1.setText ( String.valueOf ( stark ) );
    }

    public void steve() {
        steve++;
        score2.setText ( String.valueOf ( steve ) );
    }

    public void buttonFalse(){
        button1.setClickable ( false );
        button2.setClickable ( false );
        button3.setClickable ( false );
        button4.setClickable ( false );
        button5.setClickable ( false );
        button6.setClickable ( false );
        button7.setClickable ( false );
        button8.setClickable ( false );
        button9.setClickable ( false );
        button10.setClickable ( false );
        button11.setClickable ( false );
        button12.setClickable ( false );
        button13.setClickable ( false );
        button14.setClickable ( false );
        button15.setClickable ( false );
        button16.setClickable ( false );
        button17.setClickable ( false );
        button18.setClickable ( false );
        button19.setClickable ( false );
        button20.setClickable ( false );
        button21.setClickable ( false );
        button22.setClickable ( false );
        button23.setClickable ( false );
        button24.setClickable ( false );
        button25.setClickable ( false );
        button26.setClickable ( false );
        button27.setClickable ( false );
        button28.setClickable ( false );
        button29.setClickable ( false );
        button30.setClickable ( false );
        button31.setClickable ( false );
        button32.setClickable ( false );
        button33.setClickable ( false );
        button34.setClickable ( false );
        button35.setClickable ( false );
        button36.setClickable ( false );
        button37.setClickable ( false );
        button38.setClickable ( false );
        button39.setClickable ( false );
        button40.setClickable ( false );
        button41.setClickable ( false );
        button42.setClickable ( false );
        button43.setClickable ( false );
        button44.setClickable ( false );
        button45.setClickable ( false );
        button46.setClickable ( false );
        button47.setClickable ( false );
        button48.setClickable ( false );
        button49.setClickable ( false );
    }

    public void buttonTrue(){
        button1.setClickable ( true );
        button2.setClickable ( true );
        button3.setClickable ( true );
        button4.setClickable ( true );
        button5.setClickable ( true );
        button6.setClickable ( true );
        button7.setClickable ( true );
        button8.setClickable ( true );
        button9.setClickable ( true );
        button10.setClickable ( true );
        button11.setClickable ( true );
        button12.setClickable ( true );
        button13.setClickable ( true );
        button14.setClickable ( true );
        button15.setClickable ( true );
        button16.setClickable ( true );
        button17.setClickable ( true );
        button18.setClickable ( true );
        button19.setClickable ( true );
        button20.setClickable ( true );
        button21.setClickable ( true );
        button22.setClickable ( true );
        button23.setClickable ( true );
        button24.setClickable ( true );
        button25.setClickable ( true );
        button26.setClickable ( true );
        button27.setClickable ( true );
        button28.setClickable ( true );
        button29.setClickable ( true );
        button30.setClickable ( true );
        button31.setClickable ( true );
        button32.setClickable ( true );
        button33.setClickable ( true );
        button34.setClickable ( true );
        button35.setClickable ( true );
        button36.setClickable ( true );
        button37.setClickable ( true );
        button38.setClickable ( true );
        button39.setClickable ( true );
        button40.setClickable ( true );
        button41.setClickable ( true );
        button42.setClickable ( true );
        button43.setClickable ( true );
        button44.setClickable ( true );
        button45.setClickable ( true );
        button46.setClickable ( true );
        button47.setClickable ( true );
        button48.setClickable ( true );
    }

    public void winner() {
        mediaPlayer4.start ();
        winScreen.setVisibility ( View.VISIBLE );
        down = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.down );
        down.setDuration ( 600 );
        winScreen.setAnimation ( down );
        winScreen.setEnabled ( true);
        yes2.setEnabled ( true );
        no2.setEnabled ( true );
        buttonFalse ();
        if(stark >steve){
            winner.setText ( getString( R.string.starkwon) );
        }
        else if(stark < steve){
            winner.setText ( getString( R.string.stevewon) );
        }
        else {
            winner.setText ( getString( R.string.tie) );
        }
    }

    public void check() {
        if (winnerCount == 49) {
            winner ();
            winnerCount=0;
        }
    }
}
