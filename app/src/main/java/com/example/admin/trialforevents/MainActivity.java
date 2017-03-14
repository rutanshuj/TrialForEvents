package com.example.admin.trialforevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.forEventView);
        b2 = (Button) findViewById(R.id.forDandT);
        b3 = (Button) findViewById(R.id.forRecyclerView);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Button Selected", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, DandTPickers.class);
        Intent j = new Intent(MainActivity.this, MainPage.class);
        Intent k = new Intent(MainActivity.this, RecyclerView.class);

        switch(v.getId()){
            case R.id.forDandT:

                startActivity(i);
                break;
            case R.id.forEventView:
                startActivity(j);
                break;
            case R.id.forRecyclerView:
                startActivity(k);
                break;
        }
    }
}
