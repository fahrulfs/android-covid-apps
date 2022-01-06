package com.rajendra.covid19ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout confirmed;
    CardView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

detail=findViewById(R.id.cardView2);
detail.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent detail=new Intent(MainActivity.this,Details.class);
        startActivity(detail);
    }
});



    }


    // Hi all today we are going to make covid 19 app UI
    // So lets get started
    //lets import assets and font

    //lets import font

    // lets run it
    // tutorial complited
    // see you in the next tutorial.
}
