package com.example.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.*;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool sp;
    private int soundIDC;
    private int soundIDA;
    private int soundIDB;
    private int soundIDD;
    private int soundIDE;
    private int soundIDF;
    private int soundIDG;
/*
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Deprecated since Api 21
        sp = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        soundIDC = sp.load(getApplicationContext(), R.raw.note1_c, 1);
        soundIDD = sp.load(getApplicationContext(), R.raw.note2_d, 1);
        soundIDE = sp.load(getApplicationContext(), R.raw.note3_e, 1);
        soundIDF = sp.load(getApplicationContext(), R.raw.note4_f, 1);
        soundIDG = sp.load(getApplicationContext(), R.raw.note5_g, 1);
        soundIDA = sp.load(getApplicationContext(), R.raw.note6_a, 1);
        soundIDB = sp.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    // TODO: Add the play methods triggered by the buttons

    public void playC(View v) {
        sp.play(soundIDC, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playB(View v) {
        sp.play(soundIDB, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playA(View v) {
        sp.play(soundIDA, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playD(View v) {
        sp.play(soundIDD, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playE(View v) {
        sp.play(soundIDE, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playF(View v) {
        sp.play(soundIDF, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playG(View v) {
        sp.play(soundIDG, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

}
