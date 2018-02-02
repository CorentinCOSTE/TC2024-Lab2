package com.example.macbookpro.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class Child1 extends AppCompatActivity {

    Button Backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child1);

        Backbutton = (Button) findViewById(R.id.button);

        Backbutton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent;
                intent = new Intent(Child1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
