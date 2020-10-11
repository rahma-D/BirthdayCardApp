package com.linko.learning.birthdaycardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    TextView profileone,profiletwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        profileone = findViewById(R.id.profileone);
        profiletwo = findViewById(R.id.profiletwo);


        profileone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });


        profiletwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListActivity.this,ProfileOneActivity.class);
                startActivity(intent);
            }
        });
    }
}
