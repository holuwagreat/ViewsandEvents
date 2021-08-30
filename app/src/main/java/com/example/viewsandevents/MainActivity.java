package com.example.viewsandevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= findViewById(R.id.t1);
        b1=findViewById(R.id.b1);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        t1.setText("You clicked button 1");
    }

    public void doSomething(View view) {
        t1.setText("You clicked button 2");
    }
}