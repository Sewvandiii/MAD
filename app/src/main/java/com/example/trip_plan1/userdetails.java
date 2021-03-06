package com.example.trip_plan1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class userdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Button viewbooking = (Button) findViewById(R.id.viewBooking);
        viewbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userdetails.this,HotelDetails.class);
                startActivity(intent);
            }
        });
        final Button viewplaces = (Button) findViewById(R.id.viewplaces);
        viewplaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userdetails.this,placesDetails.class);
                startActivity(intent);
            }
        });
    }
}
