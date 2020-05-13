package com.example.tasktwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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

public class Hlevelone extends AppCompatActivity {

    public static int count = 0;
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
    public Button yes;
    public Button no;
    public Button no2;
    public Button yes2;
    public static Button undo;
    public Button quit;
    public static Button undoa;
    public Button quita;
    public static Button undob;
    public Button quitb;

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
    public ConstraintLayout conQuit;
    public ConstraintLayout winScreen;
    public ConstraintLayout two;
    public ConstraintLayout three;
    public ConstraintLayout four;
    public ConstraintLayout pointer1;
    public ConstraintLayout pointer2;
    public ConstraintLayout pointera1;
    public ConstraintLayout pointera2;
    public ConstraintLayout pointera3;
    public ConstraintLayout pointerb1;
    public ConstraintLayout pointerb2;
    public ConstraintLayout pointerb3;
    public ConstraintLayout pointerb4;

    public static int stark = 0;
    public static int steve = 0;
    public static int bruce = 0;
    public static int thor = 0;
    public int winnerCount = 0;
    public TextView score1;
    public TextView score2;
    public TextView score1a;
    public TextView score2a;
    public TextView score3a;
    public TextView score1b;
    public TextView score2b;
    public TextView score3b;
    public TextView score4b;
    public TextView winner;
    public static int butId;
    public static int NoPlayers;
    public static MediaPlayer mediaPlayer;
    public static MediaPlayer mediaPlayer1;
    public static MediaPlayer mediaPlayer2;
    public static MediaPlayer mediaPlayer3;
    public static MediaPlayer mediaPlayer4;
    public Animation up;
    public Animation down;
    public Animation zoom;
    public static int[] fourArray = new int[]{1,2,3,4};
    public static int[] threeArray = new int[]{1,2,3};
    public static int fourI = 0;
    public static int threeI = 0;
    public static int lastCall=0;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView ( R.layout.activity_hlevelone );
        Intent intent = getIntent ();
        NoPlayers = intent.getExtras ().getInt ( "players" );
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
        bruce = 0;
        thor = 0;
        count = 0;
        fourI = 0;
        threeI = 0;

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
        conQuit = findViewById ( R.id.conquit );
        winScreen = findViewById ( R.id.winScreen );
        winner = findViewById ( R.id.textView );
        two = findViewById ( R.id.two );
        three = findViewById ( R.id.three );
        four = findViewById ( R.id.four );
        pointer1 = findViewById ( R.id.pointer1 );
        pointer2 = findViewById ( R.id.pointer2 );
        pointera1 = findViewById ( R.id.pointera1 );
        pointera2 = findViewById ( R.id.pointera2 );
        pointera3 = findViewById ( R.id.pointera3 );
        pointerb1 = findViewById ( R.id.pointerb1 );
        pointerb2 = findViewById ( R.id.pointerb2 );
        pointerb3 = findViewById ( R.id.pointerb3 );
        pointerb4 = findViewById ( R.id.pointerb4 );

        score1 = findViewById ( R.id.score );
        score2 = findViewById ( R.id.score3 );
        score1a = findViewById ( R.id.scorea1 );
        score2a = findViewById ( R.id.scorea2 );
        score3a = findViewById ( R.id.scorea3 );
        score1b = findViewById ( R.id.scoreb1 );
        score2b = findViewById ( R.id.scoreb2 );
        score3b = findViewById ( R.id.scoreb3 );
        score4b = findViewById ( R.id.scoreb4 );

        undo = findViewById ( R.id.undo );
        undoa = findViewById ( R.id.undoa );
        undob = findViewById ( R.id.undob );

        quit = findViewById ( R.id.quit );
        quita = findViewById ( R.id.quita );
        quitb = findViewById ( R.id.quitb );

        conQuit.setVisibility ( View.INVISIBLE );
        conQuit.setEnabled ( false );
        yes.setEnabled ( false );
        no.setEnabled ( false );
        winScreen.setVisibility ( View.INVISIBLE );
        winScreen.setEnabled ( false );
        yes2.setEnabled ( false );
        no2.setEnabled ( false );

        pointer1.setVisibility ( View.VISIBLE );
        pointera1.setVisibility ( View.VISIBLE );
        pointerb1.setVisibility ( View.VISIBLE );
        pointer2.setVisibility ( View.INVISIBLE );
        pointera2.setVisibility ( View.INVISIBLE );
        pointerb2.setVisibility ( View.INVISIBLE );
        pointera3.setVisibility ( View.INVISIBLE );
        pointerb3.setVisibility ( View.INVISIBLE );
        pointerb4.setVisibility ( View.INVISIBLE );

        two.setVisibility ( View.INVISIBLE );
        three.setVisibility ( View.INVISIBLE );
        four.setVisibility ( View.INVISIBLE );
        if(NoPlayers == 2){
            two.setVisibility ( View.VISIBLE );
            undo.setEnabled ( true );
            quit.setEnabled ( true );
            score1.setText ( String.valueOf ( stark ) );
            score2.setText ( String.valueOf ( steve ) );
        }
        else if(NoPlayers == 3){
            three.setVisibility ( View.VISIBLE );
            undoa.setEnabled ( true );
            quita.setEnabled ( true );
            score1a.setText ( String.valueOf ( stark ) );
            score2a.setText ( String.valueOf ( steve ) );
            score3a.setText ( String.valueOf ( bruce ) );
        }
        else if(NoPlayers == 4){
            four.setVisibility ( View.VISIBLE );
            undob.setEnabled ( true );
            quitb.setEnabled ( true );
            score1b.setText ( String.valueOf ( stark ) );
            score2b.setText ( String.valueOf ( steve ) );
            score3b.setText ( String.valueOf ( bruce ) );
            score4b.setText ( String.valueOf ( thor ) );
        }

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
        button25.setOnClickListener ( single ( button16,button23,button24,con9,type1 ) );
        button26.setOnClickListener ( Double ( button18,button24,button27,button20,button28,button29,con10,con11,type2 ) );
        button27.setOnClickListener ( single ( button18,button24,button26,con10,type1 ) );
        button28.setOnClickListener ( Double ( button26,button20,button29,button22,button30,button31,con11,con12,type2 ) );
        button29.setOnClickListener ( single ( button26,button20,button28,con11,type1 ) );
        button30.setOnClickListener ( single ( button28,button22,button31,con12,type2 ) );
        button31.setOnClickListener ( single ( button28,button12,button30,con12,type1 ) );

        undo.setEnabled ( false );
        undoa.setEnabled ( false );
        undob.setEnabled ( false );

        undo.setOnClickListener ( undooo () );
        undoa.setOnClickListener ( undooo () );
        undob.setOnClickListener ( undooo () );
        View.OnClickListener onClickListener = new View.OnClickListener () {
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
                        Intent intent = new Intent ( getApplicationContext (), Hlevel.class );
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
        };

        quit.setOnClickListener ( onClickListener );
        quita.setOnClickListener ( onClickListener );
        quitb.setOnClickListener ( onClickListener );

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
        Intent intent = new Intent ( getApplicationContext (), Hlevel.class );
        startActivity ( intent );
    }

    public View.OnClickListener single( final Button button1, final Button button2, final Button button3, final ConstraintLayout con , final int type){
        View.OnClickListener onClickListener = new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                undo.setEnabled ( true );
                undoa.setEnabled ( true );
                undob.setEnabled ( true );
                winnerCount++;
                mediaPlayer.start ();
                Button b = (Button) v;
                butId = b.getId () ;
                b.setEnabled ( false );
                zoom = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.zoomin );
                zoom.setDuration ( 60 );
                b.setAnimation ( zoom );
                if(NoPlayers == 2){
                    if(count%2 != 0){
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butone );
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butonea );
                        }
                    }
                    else if(count%2 ==0){
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.buto);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butoa);
                        }
                    }
                }
                else if(NoPlayers == 3){
                    if(threeArray[threeI] == 1){
                        threeI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butone );
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butonea );
                        }
                    }
                    else if(threeArray[threeI] == 2){
                        threeI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.buto);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butoa);
                        }
                    }
                    else if(threeArray[threeI] == 3){
                        threeI=0;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butthree);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butthreea);
                        }
                    }
                }
                else if(NoPlayers == 4){
                    if(fourArray[fourI] == 1){
                        fourI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butone );
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butonea );
                        }
                    }
                    else if(fourArray[fourI] == 2){
                        fourI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.buto);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butoa);
                        }
                    }
                    else if(fourArray[fourI] == 3){
                        fourI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butthree);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butthreea);
                        }
                    }
                    else if(fourArray[fourI] == 4){
                        fourI = 0;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butfour);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butfoura);
                        }
                    }
                }
                if(!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled ()){
                    if(NoPlayers == 2){
                        if(count%2 != 0){
                            con.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                            count--;
                        }
                        else if(count%2 ==0) {
                            con.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                            count--;
                        }
                    }
                    else if(NoPlayers == 3){
                        if(threeI == 0){
                            threeI = 2;
                        }
                        else {
                            threeI--;
                        }
                        if(threeArray[threeI] == 1){
                            con.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                        }
                        else if(threeArray[threeI] == 2) {
                            con.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                        }
                        else if(threeArray[threeI] == 3) {
                            con.setBackgroundResource ( R.drawable.areathree );
                            bruce ();
                        }
                    }
                    else if(NoPlayers == 4){
                        if(fourI == 0){
                            fourI = 3;
                        }
                        else {
                            fourI--;
                        }
                        if(fourArray[fourI] == 1){
                            con.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                        }
                        else if(fourArray[fourI] == 2) {
                            con.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                        }
                        else if(fourArray[fourI] == 3) {
                            con.setBackgroundResource ( R.drawable.areathree );
                             bruce ();
                        }
                        else if(fourArray[fourI] == 4) {
                            con.setBackgroundResource ( R.drawable.areafour );
                            thor ();
                        }
                    }
                }
                if(NoPlayers == 2){
                    if(count%2 != 0){
                        pointer2.setVisibility ( View.VISIBLE );
                        pointer1.setVisibility ( View.INVISIBLE );
                    }
                    else {
                        pointer2.setVisibility ( View.INVISIBLE );
                        pointer1.setVisibility ( View.VISIBLE );
                    }
                }
                else if(NoPlayers == 3){
                    if(threeArray[threeI] == 1){
                        pointera1.setVisibility ( View.VISIBLE );
                        pointera2.setVisibility ( View.INVISIBLE );
                        pointera3.setVisibility ( View.INVISIBLE );
                    }
                    else if(threeArray[threeI] == 2){
                        pointera1.setVisibility ( View.INVISIBLE );
                        pointera2.setVisibility ( View.VISIBLE );
                        pointera3.setVisibility ( View.INVISIBLE );
                    }
                    else if(threeArray[threeI] == 3){
                        pointera1.setVisibility ( View.INVISIBLE );
                        pointera2.setVisibility ( View.INVISIBLE );
                        pointera3.setVisibility ( View.VISIBLE );
                    }
                }
                else if(NoPlayers == 4){
                    if(fourArray[fourI] == 1){
                        pointerb1.setVisibility ( View.VISIBLE );
                        pointerb2.setVisibility ( View.INVISIBLE );
                        pointerb3.setVisibility ( View.INVISIBLE );
                        pointerb4.setVisibility ( View.INVISIBLE );
                    }
                    else if(fourArray[fourI] == 2){
                        pointerb1.setVisibility ( View.INVISIBLE );
                        pointerb2.setVisibility ( View.VISIBLE );
                        pointerb3.setVisibility ( View.INVISIBLE );
                        pointerb4.setVisibility ( View.INVISIBLE );
                    }
                    else if(fourArray[fourI] == 3){
                        pointerb1.setVisibility ( View.INVISIBLE );
                        pointerb2.setVisibility ( View.INVISIBLE );
                        pointerb3.setVisibility ( View.VISIBLE );
                        pointerb4.setVisibility ( View.INVISIBLE );
                    }
                    else if(fourArray[fourI] == 4){
                        pointerb1.setVisibility ( View.INVISIBLE );
                        pointerb2.setVisibility ( View.INVISIBLE );
                        pointerb3.setVisibility ( View.INVISIBLE );
                        pointerb4.setVisibility ( View.VISIBLE );
                    }
                }
                count++;
                if(winnerCount == 31){
                    mediaPlayer2.stop ();
                }
                check ();
            }
        };

        return onClickListener;
    }

    public View.OnClickListener Double( final Button button1, final Button button2, final Button button3, final Button button5, final Button button6, final Button button7, final ConstraintLayout con1, final ConstraintLayout con2, final int type){
        View.OnClickListener onClickListeners = new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                undo.setEnabled ( true );
                undoa.setEnabled ( true );
                undob.setEnabled ( true );
                winnerCount++;
                mediaPlayer.start ();
                Button b = (Button) v;
                butId = b.getId () ;
                b.setEnabled ( false );
                zoom = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.zoomin );
                zoom.setDuration ( 60 );
                b.setAnimation ( zoom );
                if(NoPlayers == 2){
                    if(count%2 != 0){
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butone );
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butonea );
                        }
                    }
                    else if(count%2 ==0){
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.buto);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butoa);
                        }
                    }
                }
                else if(NoPlayers == 3){
                    if(threeArray[threeI] == 1){
                        threeI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butone );
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butonea );
                        }
                    }
                    else if(threeArray[threeI] == 2){
                        threeI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.buto);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butoa);
                        }
                    }
                    else if(threeArray[threeI] == 3){
                        threeI = 0;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butthree);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butthreea);
                        }
                    }
                }
                else if(NoPlayers == 4){
                    if(fourArray[fourI] == 1){
                        fourI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butone );
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butonea );
                        }
                    }
                    else if(fourArray[fourI] == 2){
                        fourI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.buto);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butoa);
                        }
                    }
                    else if(fourArray[fourI] == 3){
                        fourI++;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butthree);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butthreea);
                        }
                    }
                    else if(fourArray[fourI] == 4){
                        fourI = 0;
                        if(type == 0){
                            b.setBackgroundResource ( R.drawable.butfour);
                        }
                        else {
                            b.setBackgroundResource ( R.drawable.butfoura);
                        }
                    }
                }
                if(!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled () && !button5.isEnabled () && !button6.isEnabled () && !button7.isEnabled ()){
                    if(NoPlayers == 2){
                        if(count%2 != 0){
                            con1.setBackgroundResource ( R.drawable.areaone );
                            con2.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                            stark ();
                            count--;
                        }
                        else if(count%2 ==0) {
                            con1.setBackgroundResource ( R.drawable.areatwo );
                            con2.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                            steve ();
                            count--;
                        }
                    }
                    else if(NoPlayers == 3){
                        if(threeI == 0){
                            threeI = 2;
                        }
                        else {
                            threeI--;
                        }
                        if(threeArray[threeI] == 1){
                            con1.setBackgroundResource ( R.drawable.areaone );
                            con2.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                            stark ();
                        }
                        else if(threeArray[threeI] == 2) {
                            con1.setBackgroundResource ( R.drawable.areatwo );
                            con2.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                            steve ();
                        }
                        else if(threeArray[threeI] == 3) {
                            con1.setBackgroundResource ( R.drawable.areathree );
                            con2.setBackgroundResource ( R.drawable.areathree );
                            bruce ();
                            bruce ();
                        }
                    }
                    else if(NoPlayers == 4){
                        if(fourI == 0){
                            fourI = 3;
                        }
                        else {
                            fourI--;
                        }
                        if(fourArray[fourI] == 1){
                            con1.setBackgroundResource ( R.drawable.areaone );
                            con2.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                            stark ();
                        }
                        else if(fourArray[fourI] == 2) {
                            con1.setBackgroundResource ( R.drawable.areatwo );
                            con2.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                            steve ();
                        }
                        else if(fourArray[fourI] == 3) {
                            con1.setBackgroundResource ( R.drawable.areathree );
                            con2.setBackgroundResource ( R.drawable.areathree );
                            bruce ();
                            bruce ();
                        }
                        else if(fourArray[fourI] == 4) {
                            con1.setBackgroundResource ( R.drawable.areafour );
                            con2.setBackgroundResource ( R.drawable.areafour );
                            thor ();
                            thor ();
                        }
                    }
                }
                else if(!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled ()){
                    if(NoPlayers == 2){
                        if(count%2 != 0){
                            con1.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                            count--;
                        }
                        else if(count%2 ==0) {
                            con1.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                            count--;
                        }
                    }
                    else if(NoPlayers == 3){
                        if(threeI == 0){
                            threeI = 2;
                        }
                        else {
                            threeI--;
                        }
                        if(threeArray[threeI] == 1){
                            con1.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                        }
                        else if(threeArray[threeI] == 2) {
                            con1.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                        }
                        else if(threeArray[threeI] == 3) {
                            con1.setBackgroundResource ( R.drawable.areathree );
                            bruce ();
                        }
                    }
                    else if(NoPlayers == 4){
                        if(fourI == 0){
                            fourI = 3;
                        }
                        else {
                            fourI--;
                        }
                        if(fourArray[fourI] == 1){
                            con1.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                        }
                        else if(fourArray[fourI] == 2) {
                            con1.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                        }
                        else if(fourArray[fourI] == 3) {
                            con1.setBackgroundResource ( R.drawable.areathree );
                            bruce ();
                        }
                        else if(fourArray[fourI] == 4) {
                            con1.setBackgroundResource ( R.drawable.areafour );
                            thor ();
                        }
                    }
                }
                else if(!b.isEnabled () && !button5.isEnabled () && !button6.isEnabled () && !button7.isEnabled ()){
                    if(NoPlayers == 2){
                        if(count%2 != 0){
                            con2.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                            count--;
                        }
                        else if(count%2 ==0){
                            con2.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                            count--;
                        }
                    }
                    else if(NoPlayers == 3){
                        if(threeI == 0){
                            threeI = 2;
                        }
                        else {
                            threeI--;
                        }
                        if(threeArray[threeI] == 1){
                            con2.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                        }
                        else if(threeArray[threeI] == 2){
                            con2.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                        }
                        else if(threeArray[threeI] == 3){
                            con2.setBackgroundResource ( R.drawable.areathree );
                            bruce ();
                        }
                    }
                    else if(NoPlayers == 4){
                        if(fourI == 0){
                            fourI = 3;
                        }
                        else {
                            fourI--;
                        }
                        if(fourArray[fourI] == 1){
                            con2.setBackgroundResource ( R.drawable.areaone );
                            stark ();
                        }
                        else if(fourArray[fourI] == 2){
                            con2.setBackgroundResource ( R.drawable.areatwo );
                            steve ();
                        }
                        else if(fourArray[fourI] == 3){
                            con2.setBackgroundResource ( R.drawable.areathree );
                            bruce ();
                        }
                        else if(fourArray[fourI] == 4){
                            con2.setBackgroundResource ( R.drawable.areafour );
                            thor ();
                        }
                    }
                }
                if(NoPlayers == 2){
                    if(count%2 != 0){
                        pointer2.setVisibility ( View.VISIBLE );
                        pointer1.setVisibility ( View.INVISIBLE );
                    }
                    else {
                        pointer2.setVisibility ( View.INVISIBLE );
                        pointer1.setVisibility ( View.VISIBLE );
                    }
                }
                else if(NoPlayers == 3){
                    if(threeArray[threeI] == 1){
                        pointera1.setVisibility ( View.VISIBLE );
                        pointera2.setVisibility ( View.INVISIBLE );
                        pointera3.setVisibility ( View.INVISIBLE );
                    }
                    else if(threeArray[threeI] == 2){
                        pointera1.setVisibility ( View.INVISIBLE );
                        pointera2.setVisibility ( View.VISIBLE );
                        pointera3.setVisibility ( View.INVISIBLE );
                    }
                    else if(threeArray[threeI] == 3){
                        pointera1.setVisibility ( View.INVISIBLE );
                        pointera2.setVisibility ( View.INVISIBLE );
                        pointera3.setVisibility ( View.VISIBLE );
                    }
                }
                else if(NoPlayers == 4){
                    if(fourArray[fourI] == 1){
                        pointerb1.setVisibility ( View.VISIBLE );
                        pointerb2.setVisibility ( View.INVISIBLE );
                        pointerb3.setVisibility ( View.INVISIBLE );
                        pointerb4.setVisibility ( View.INVISIBLE );
                    }
                    else if(fourArray[fourI] == 2){
                        pointerb1.setVisibility ( View.INVISIBLE );
                        pointerb2.setVisibility ( View.VISIBLE );
                        pointerb3.setVisibility ( View.INVISIBLE );
                        pointerb4.setVisibility ( View.INVISIBLE );
                    }
                    else if(fourArray[fourI] == 3){
                        pointerb1.setVisibility ( View.INVISIBLE );
                        pointerb2.setVisibility ( View.INVISIBLE );
                        pointerb3.setVisibility ( View.VISIBLE );
                        pointerb4.setVisibility ( View.INVISIBLE );
                    }
                    else if(fourArray[fourI] == 4){
                        pointerb1.setVisibility ( View.INVISIBLE );
                        pointerb2.setVisibility ( View.INVISIBLE );
                        pointerb3.setVisibility ( View.INVISIBLE );
                        pointerb4.setVisibility ( View.VISIBLE );
                    }
                }

                count++;
                if(winnerCount == 31){
                    mediaPlayer2.stop ();
                }
                check ();
            }
        };

        return onClickListeners;
    }

    public void stark(){
        stark++;
        score1.setText ( String.valueOf ( stark ) );
        score1a.setText ( String.valueOf ( stark ) );
        score1b.setText ( String.valueOf ( stark ) );
        lastCall = 1;
    }
    public void steve(){
        steve++;
        score2.setText ( String.valueOf ( steve ) );
        score2a.setText ( String.valueOf ( steve ) );
        score2b.setText ( String.valueOf ( steve ) );
        lastCall = 2;
    }
    public void bruce(){
        bruce++;
        score3a.setText ( String.valueOf ( bruce ) );
        score3b.setText ( String.valueOf ( bruce ) );
        lastCall = 3;
    }
    public void thor(){
        thor++;
        score4b.setText ( String.valueOf ( thor ) );
        lastCall = 4;
    }
    public View.OnClickListener undooo(){
        View.OnClickListener undooo = new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                undo.setEnabled ( false );
                undoa.setEnabled ( false );
                undob.setEnabled ( false );
                mediaPlayer1.start ();
                if(threeI == 0){
                    threeI = 2;
                }
                else {
                    threeI--;
                }
                if(fourI == 0){
                    fourI = 3;
                }
                else {
                    fourI--;
                }
                if(butId == button1.getId ()){
                    singleUndo (button1, button2,button3,button4,con1,type2 );
                }
                else if(butId == button2.getId ()){
                    singleUndo (button2, button1,button3,button4,con1,type1 );
                }
                else if(butId == button3.getId ()){
                    doubleUndo (button3, button1,button2,button4,button5,button6,button7,con1,con2,type2 );
                }
                else if(butId == button4.getId ()){
                    doubleUndo (button4, button1,button2,button3,button14,button15,button16,con1,con5,type1 );
                }
                else if(butId == button5.getId ()){
                    singleUndo (button5, button3,button6,button7,con2,type1 );
                }
                else if(butId == button6.getId ()){
                    doubleUndo (button6, button3,button5,button7,button8,button9,button10,con2,con3,type2 );
                }
                else if(butId == button7.getId ()){
                    doubleUndo (button7, button3,button5,button6,button15,button17,button18,con2,con6,type1 );
                }
                else if(butId == button8.getId ()){
                    singleUndo (button8, button6,button9,button10,con3,type1 );
                }
                else if(butId == button9.getId ()){
                    doubleUndo (button9, button6,button8,button10,button11,button12,button13,con3,con4,type2 );
                }
                else if(butId == button10.getId ()){
                    doubleUndo (button10, button6,button8,button9,button17,button19,button20,con3,con7,type1 );
                }
                else if(butId == button11.getId ()){
                    singleUndo (button11, button9,button12,button13,con4,type1 );
                }
                else if(butId == button12.getId ()){
                    singleUndo (button12, button9,button11,button13,con4,type2 );
                }
                else if(butId == button13.getId ()){
                    doubleUndo (button13, button9,button11,button12,button19,button21,button22,con4,con8,type1 );
                }
                else if(butId == button14.getId ()){
                    singleUndo (button14, button4,button15,button16,con5,type2 );
                }
                else if(butId == button15.getId ()){
                    doubleUndo (button15, button4,button14,button16,button7,button17,button18,con5,con6,type2 );
                }
                else if(butId == button16.getId ()){
                    doubleUndo (button16, button14,button4,button15,button23,button24,button25,con5,con9,type1 );
                }
                else if(butId == button17.getId ()){
                    doubleUndo (button17, button15,button7,button18,button16,button19,button20,con6,con7,type2 );
                }
                else if(butId == button18.getId ()){
                    doubleUndo (button18, button15,button7,button17,button24,button27,button26,con6,con10,type1 );
                }
                else if(butId == button19.getId ()){
                    doubleUndo (button19, button17,button10,button20,button13,button21,button22,con7,con8,type2 );
                }
                else if(butId == button20.getId ()){
                    doubleUndo (button20, button17,button10,button19,button26,button28,button29,con7,con11,type1 );
                }
                else if(butId == button21.getId ()){
                    singleUndo (button21, button19,button13,button22,con8,type2 );
                }
                else if(butId == button22.getId ()){
                    doubleUndo (button22, button19,button13,button21,button28,button30,button31,con8,con12,type1 );
                }
                else if(butId == button23.getId ()){
                    singleUndo (button23, button16,button24,button25,con9,type2 );
                }
                else if(butId == button24.getId ()){
                    doubleUndo (button24, button16,button23,button25,button18,button26,button27,con9,con10,type2 );
                }
                else if(butId == button25.getId ()){
                    singleUndo (button25, button16,button23,button24,con9,type1 );
                }
                else if(butId == button26.getId ()){
                    doubleUndo (button26, button18,button24,button27,button20,button28,button29,con10,con11,type2 );
                }
                else if(butId == button27.getId ()){
                    singleUndo (button27, button18,button24,button26,con10,type1 );
                }
                else if(butId == button28.getId ()){
                    doubleUndo (button28, button26,button20,button29,button22,button30,button31,con11,con12,type2 );
                }
                else if(butId == button29.getId ()){
                    singleUndo (button29, button26,button20,button28,con11,type1 );
                }
                else if(butId == button30.getId ()){
                    singleUndo (button30, button28,button22,button31,con12,type2 );
                }
                else if(butId == button31.getId ()){
                    singleUndo (button31, button28,button12,button30,con12,type1 );
                }
            }
        };
        count--;
        return undooo;
    }

    public void singleUndo(final Button b, final Button button1, final Button button2, final Button button3, final ConstraintLayout con , final int type){
        if(!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled ()){
            con.setBackgroundColor ( Color.TRANSPARENT );
            if(threeI == 2){
                threeI = 0;
            }
            else {
                threeI++;
            }
            if(fourI == 3){
                fourI = 0;
            }
            else {
                fourI++;
            }
            count--;
            callChecker ();
        }
        b.setEnabled ( true );
        if(type == 0){
            b.setBackgroundResource ( R.drawable.butzero );
            winnerCount--;
            butId = 0;
            count++;
        }
        else {
            b.setBackgroundResource ( R.drawable.butzeroa );
            winnerCount--;
            butId = 0;
            count++;
        }

    }
    public void doubleUndo(final Button b ,final Button button1, final Button button2, final Button button3, final Button button5, final Button button6, final Button button7, final ConstraintLayout con1, final ConstraintLayout con2, final int type){
        if(!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled () && !button5.isEnabled () && !button6.isEnabled () && !button7.isEnabled ()) {
            con1.setBackgroundColor ( Color.TRANSPARENT );
            con2.setBackgroundColor ( Color.TRANSPARENT );
            if(threeI == 2){
                threeI = 0;
            }
            else {
                threeI++;
            }
            if(fourI == 3){
                fourI = 0;
            }
            else {
                fourI++;
            }
            count--;
            DoubleCallChecker ();
        }
        else if(!button1.isEnabled () && !button2.isEnabled () && !button3.isEnabled () && !b.isEnabled ()){
            con1.setBackgroundColor ( Color.TRANSPARENT );
            if(threeI == 2){
                threeI = 0;
            }
            else {
                threeI++;
            }
            if(fourI == 3){
                fourI = 0;
            }
            else {
                fourI++;
            }
            count--;
            callChecker ();
        }
        else if(!b.isEnabled () && !button5.isEnabled () && !button6.isEnabled () && !button7.isEnabled ()){
            con2.setBackgroundColor ( Color.TRANSPARENT );
            count--;
            if(threeI == 2){
                threeI = 0;
            }
            else {
                threeI++;
            }
            if(fourI == 3){
                fourI = 0;
            }
            else {
                fourI++;
            }
            callChecker ();
        }
        b.setEnabled ( true );
        if(type == 0){
            b.setBackgroundResource ( R.drawable.butzero );
            winnerCount--;
            butId = 0;
            count++;
        }
        else {
            b.setBackgroundResource ( R.drawable.butzeroa );
            winnerCount--;
            butId = 0;
            count++;
        }

    }

    public void buttonFalse() {
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
    }

    public void buttonTrue() {
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
    }
    public void winner() {
        quit.setEnabled ( false );
        quitb.setEnabled ( false );
        quita.setEnabled ( false );
        undo.setEnabled ( false );
        undoa.setEnabled ( false );
        undob.setEnabled ( false );
        mediaPlayer4.start ();
        winScreen.setVisibility ( View.VISIBLE );
        down = AnimationUtils.loadAnimation ( getApplicationContext (),R.anim.down );
        down.setDuration ( 600 );
        winScreen.setAnimation ( down );
        winScreen.setEnabled ( true);
        yes2.setEnabled ( true );
        no2.setEnabled ( true );
        buttonFalse ();
        if(stark >steve && stark >bruce && stark>thor){
            winner.setText ( getString( R.string.starkwon) );
        }
        else if(steve >stark && steve >bruce && steve>thor){
            winner.setText ( getString( R.string.stevewon) );
        }
        else if(bruce >steve && bruce >stark && bruce>thor){
            winner.setText ( getString( R.string.brucewon));
        }
        else if(thor >steve && thor >bruce && thor>stark){
            winner.setText ( getString( R.string.thorwon) );
        }
        else {
            winner.setText ( getString( R.string.tie) );
        }
    }

    public void check() {
        if (winnerCount == 31) {
            winner ();
            winnerCount=0;
        }
    }
    public void callChecker(){
        if(lastCall == 1){
            stark--;
            score1.setText ( String.valueOf ( stark ) );
            score1a.setText ( String.valueOf ( stark ) );
            score1b.setText ( String.valueOf ( stark ) );
        }
        else if(lastCall ==2){
            steve--;
            score2.setText ( String.valueOf ( steve ) );
            score2a.setText ( String.valueOf ( steve ) );
            score2b.setText ( String.valueOf ( steve ) );
        }
        else if(lastCall ==3){
            bruce--;
            score3a.setText ( String.valueOf ( bruce ) );
            score3b.setText ( String.valueOf ( bruce ) );
        }
        else if(lastCall ==4){
            thor--;
            score4b.setText ( String.valueOf ( thor ) );
        }
        else {
            return;
        }
    }
    public void DoubleCallChecker(){
        if(lastCall == 1){
            stark--;
            stark--;
            score1.setText ( String.valueOf ( stark ) );
            score1a.setText ( String.valueOf ( stark ) );
            score1b.setText ( String.valueOf ( stark ) );
        }
        else if(lastCall ==2){
            steve--;
            steve--;
            score2.setText ( String.valueOf ( steve ) );
            score2a.setText ( String.valueOf ( steve ) );
            score2b.setText ( String.valueOf ( steve ) );
        }
        else if(lastCall ==3){
            bruce--;
            bruce--;
            score3a.setText ( String.valueOf ( bruce ) );
            score3b.setText ( String.valueOf ( bruce ) );
        }
        else if(lastCall ==4){
            thor--;
            thor--;
            score4b.setText ( String.valueOf ( thor ) );
        }
        else {
            return;
        }
    }
}
