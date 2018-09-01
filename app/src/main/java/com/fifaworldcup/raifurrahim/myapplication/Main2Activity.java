package com.fifaworldcup.raifurrahim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    tv = (TextView)findViewById(R.id.TextTv);
    Intent myIntent = getIntent();
    Bundle b = myIntent.getExtras();

        if (b != null) {

        String j = (String)b.get("mytext");
        tv.setText(j);
    }
}
}
