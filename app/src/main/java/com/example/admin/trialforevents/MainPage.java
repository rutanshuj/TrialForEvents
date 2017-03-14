package com.example.admin.trialforevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainPage extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        b1 = (Button) findViewById(R.id.archBttn);
        b2 = (Button) findViewById(R.id.artBttn);
        b3 = (Button) findViewById(R.id.scienceBttn);
        b4 = (Button) findViewById(R.id.financeBttn);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    public void onClick(View view){
        Toast.makeText(this, "Button Selected !", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(), EventView.class);

        switch(view.getId()){
            case R.id.archBttn:
                String arch = "Architecture";
                i.putExtra("Category", arch);
                break;

            case R.id.artBttn:
                String art = "Art";
                i.putExtra("Category", art);
                break;

            case R.id.scienceBttn:
                String science = "Science";
                i.putExtra("Category", science);
                break;

            case R.id.financeBttn:
                String fin = "Finance";
                i.putExtra("Category", fin);
                break;
        }
        startActivity(i);
    }
}
