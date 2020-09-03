package com.example.simpleaudioplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button missu,pata,Rupee,bongo;
    ImageButton p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        missu=(Button)findViewById( R.id.missu );
        final MediaPlayer mp=MediaPlayer.create( this,R.raw.sound );
        missu.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        } );
        pata=(Button)findViewById( R.id.pata );
        final MediaPlayer mp2=MediaPlayer.create( this,R.raw.sound2 );
        pata.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        } );
        //Rupee
        Rupee=(Button)findViewById( R.id.Rupee );
        final MediaPlayer mp3=MediaPlayer.create( this,R.raw.sound3 );
        Rupee.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        } );
        //Bongo DSM
        bongo=(Button)findViewById( R.id.bongo );
        final MediaPlayer mp4=MediaPlayer.create( this,R.raw.sound4 );
        bongo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        } );


        p=(ImageButton) findViewById( R.id.p );
        p.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                mp2.pause();
                mp3.pause();
                mp4.pause();
            }
        } );

    }

}