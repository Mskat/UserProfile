package com.example.mskatz.userprofile;

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

        TextView birthday = findViewById(R.id.birthday);
        birthday.setText("19.04.1991");

        TextView country = findViewById(R.id.country);
        country.setText("Poland");
    }
}