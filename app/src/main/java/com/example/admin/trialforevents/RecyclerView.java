package com.example.admin.trialforevents;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class RecyclerView extends AppCompatActivity {


    DatabaseReference databaseReference;

    android.support.v7.widget.RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_view);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("ApprovedEvents");


        recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.request_EventList);

        //Avoid unnecessary layout passes by setting setHasFixedSize to true
        recyclerView.setHasFixedSize(true);

        //Select the type of layout manager you would use for your recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Event, EventView.RequestViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Event, EventView.RequestViewHolder>(
                Event.class,
                R.layout.event_list_row,
                EventView.RequestViewHolder.class,
                databaseReference
        ) {
            @Override
            protected void populateViewHolder(EventView.RequestViewHolder viewHolder, Event model, int position) {
                viewHolder.setTitle(model.getTitle());
                viewHolder.setCategory(model.getCategory());
                viewHolder.setLocation(model.getLocation());
                viewHolder.setPrice(model.getPrice());
                viewHolder.setImageUrl(getApplicationContext(), model.getImageUrl());

                final String desc = model.getDesc();
                final String imageurl = model.getImageUrl();
                final String start_date = model.getStart_date();
                final String end_date = model.getEnd_date();
                final String start_time = model.getStart_time();
                final String end_time = model.getEnd_time();
                final String club = model.getClub();
                final String category = model.getCategory();
                final String price = model.getPrice();
                final String title = model.getTitle();
                final String location = model.getLocation();
                final String fblink = model.getFblink();
                final String weblink = model.getWeblink();
                final String contact = model.getContact();

                viewHolder.imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(RecyclerView.this, EventDetails.class);
                        intent.putExtra("title", title);
                        intent.putExtra("desc", desc);
                        intent.putExtra("imageUrl", imageurl);
                        intent.putExtra("start_date", start_date);
                        intent.putExtra("end_date", end_date);
                        intent.putExtra("start_time", start_time);
                        intent.putExtra("end_time", end_time);
                        intent.putExtra("club", club);
                        intent.putExtra("category", category);
                        intent.putExtra("price", price);
                        intent.putExtra("location", location);
                        intent.putExtra("fblink", fblink);
                        intent.putExtra("weblink", weblink);
                        intent.putExtra("contact", contact);
                        startActivity(intent);
                    }
                });
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    public static class RequestViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        View mView;
        ImageView imageButton;


        public RequestViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            imageButton = (ImageView) mView.findViewById(R.id.request_image);
        }

        public void setTitle(String title) {
            TextView a_title = (TextView) mView.findViewById(R.id.request_title);
            a_title.setText(title);
        }

        public void setLocation(String location) {
            TextView a_desc = (TextView) mView.findViewById(R.id.request_location);
            a_desc.setText(location);
        }


        public void setCategory(String category) {
            TextView a_category = (TextView) mView.findViewById(R.id.request_category);
            a_category.setText(category);
        }

        public void setPrice(String price) {
            TextView a_price = (TextView) mView.findViewById(R.id.request_price);
            a_price.setText(price);
        }

        public void setImageUrl(Context ctx, String imageUrl) {
            ImageView a_image = (ImageView) mView.findViewById(R.id.request_image);
            Picasso.with(ctx).load(imageUrl).into(a_image);
        }
    }
}