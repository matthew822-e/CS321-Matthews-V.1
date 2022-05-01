package com.example.cs321app;
import static com.example.cs321app.R.layout.activity_detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity
{
    Shape selectedShape;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        //getSelectedShape();
        //setValues();

    }

    private void getSelectedShape()
    {
        Intent previousIntent = getIntent();
        String parsedStringID = previousIntent.getStringExtra("id");
        selectedShape = DisplayRatings.shapeList.get(Integer.valueOf(parsedStringID));
    }

    private void setValues()
    {
        TextView tv = (TextView) findViewById(R.id.shapeName);
        ImageView iv = (ImageView) findViewById(R.id.shapeImage);

        tv.setText(selectedShape.getName());
        iv.setImageResource(selectedShape.getImage());
    }
}