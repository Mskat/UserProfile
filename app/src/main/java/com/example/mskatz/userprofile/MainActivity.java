package com.example.mskatz.userprofile;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profilePicture = findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.picture);

        TextView name = findViewById(R.id.name);
        name.setText("Kate");
        name.setTextSize(35);
        name.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);
        name.setTextColor(Color.parseColor("#cc3300"));

        TextView birthday = findViewById(R.id.birthday);
        birthday.setText("19/04/1991");
        birthday.setTextSize(20);
        name.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);
        birthday.setTextColor(Color.parseColor("#cc3300"));

        TextView country = findViewById(R.id.country);
        country.setText("Poland");
        country.setTextSize(20);
        name.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);
        country.setTextColor(Color.parseColor("#cc3300"));
    }
}