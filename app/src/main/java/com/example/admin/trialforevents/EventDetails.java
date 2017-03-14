package com.example.admin.trialforevents;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;


public class EventDetails extends AppCompatActivity {

    ImageView eventImage;
    TextView desc1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        eventImage = (ImageView) findViewById(R.id.eventImage_detailsPage);
        desc1 = (TextView) findViewById(R.id.request_desc);

        Intent in = getIntent();
        final String desc = in.getStringExtra("desc");
        final String imageUrl = in.getStringExtra("imageUrl");

        desc1.setText(desc);

        Picasso.with(getApplicationContext()).load(imageUrl).into(eventImage);
    }
}

