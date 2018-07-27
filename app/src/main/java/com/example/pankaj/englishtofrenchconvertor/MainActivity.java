package com.example.pankaj.englishtofrenchconvertor;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttontapped(View view){
        int id = view.getId();
        String ourid = "";
        ourid = view.getResources().getResourceEntryName(id);
        int resourceid = getResources().getIdentifier(ourid, "raw","com.example.pankaj.myapplication6");
        MediaPlayer mplayer = MediaPlayer.create(this, resourceid);
        mplayer.start();
        Log.i("buttontapped", ourid);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
