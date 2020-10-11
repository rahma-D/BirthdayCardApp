package com.linko.learning.birthdaycardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        PulsatorLayout pulsator = (PulsatorLayout) findViewById(R.id.pulsator);
        pulsator.start();
    }
}
