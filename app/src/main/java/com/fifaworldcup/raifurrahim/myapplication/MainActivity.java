package com.fifaworldcup.raifurrahim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String Text;
    EditText ET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void run(View view) {

        ET =(EditText)findViewById(R.id.EditTv);

        Text = ET.getText().toString();

        Intent intent = new Intent(view.getContext(),Main2Activity.class);
        intent.putExtra("mytext",Text);
        startActivity(intent);
    }
}
