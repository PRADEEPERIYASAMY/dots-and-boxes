package com.example.tasktwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NoPlayers extends AppCompatActivity {

    public EditText editText ;
    public Button button;
    public int NoPlayers;
    public static MediaPlayer mediaPlayer3;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView ( R.layout.activity_no_players );
        mediaPlayer3 = MediaPlayer.create ( getApplicationContext (),R.raw.quit );
        editText = findViewById ( R.id.editText );
        button = findViewById ( R.id.button );

        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Vibrator vibrator = (Vibrator) getSystemService ( Context.VIBRATOR_SERVICE );
                vibrator.vibrate ( 100 );
                mediaPlayer3.start ();
                try {

                NoPlayers = Integer.parseInt (editText.getText ().toString ());
                if(NoPlayers >=2 && NoPlayers <= 4){
                    Intent intent = new Intent ( getApplicationContext (),Hlevelone.class );
                    intent.putExtra ( "players",Integer.parseInt ( editText.getText ().toString () ) );
                    startActivity ( intent );
                }

                else {
                    editText.setText ( "" );
                    Toast.makeText ( getApplicationContext (),"2 to 4 only",Toast.LENGTH_LONG ).show ();
                }
            } catch (Exception e) {
                    e.printStackTrace ();
                    editText.setText ( "" );
                    Toast.makeText ( getApplicationContext (),"Valid number only",Toast.LENGTH_LONG ).show ();
                }
            }
        } );

    }

    @Override
    protected void onPause() {
        super.onPause ();
        overridePendingTransition ( android.R.anim.fade_in,android.R.anim.fade_out );
    }
}
