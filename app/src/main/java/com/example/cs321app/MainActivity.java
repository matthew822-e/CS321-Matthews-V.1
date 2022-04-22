package com.example.cs321app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonRatings;
    private Button buttonLeaving;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
            Button set up for Displaying the ratings
         */
        setContentView(R.layout.activity_main);
        buttonRatings = (Button) findViewById(R.id.button_ratings);
        buttonRatings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openRatings();
            }
        });

        /*
            Button set up for leaving the ratings
         */
        buttonLeaving = (Button) findViewById(R.id.button_leaving);
        buttonLeaving.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openLeaving();
            }
        });

    }

    /**
     * takes to the new activity when clicking the button
     */
    public void openRatings(){
        Intent intent = new Intent(this, DisplayRatings.class);
        startActivity(intent);
    }
    public void openLeaving(){
        Intent intent = new Intent(this, leaveRating.class);
        startActivity(intent);
    }
}