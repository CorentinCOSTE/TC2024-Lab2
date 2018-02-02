package com.example.macbookpro.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Child1;
    Button Child2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Child1 = (Button) findViewById(R.id.button1);
        Child2 = (Button) findViewById(R.id.button2);

        Child1.setOnClickListener(this);
        Child2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.button1:
                intent = new Intent(this, Child1.class);
                startActivity(intent);
                break;

            case R.id.button2:
                intent = new Intent(this, Child2.class);
                startActivity(intent);
                break;
        }
    }
}
