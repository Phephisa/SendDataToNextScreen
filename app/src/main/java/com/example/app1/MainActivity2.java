package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    //new variable names
    Button backk;
    TextView display_tvv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    //linking variables to xml code
        backk = findViewById(R.id.back);
        display_tvv = findViewById(R.id.display_tv);
        //object of getTntent receives the value in String type variable
        // by getStringExtra method using message_key
        Intent intent = getIntent();
        String input= intent.getStringExtra("message_key");
        //setting value of string on TextView
        display_tvv.setText(input);




        //go back button
        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling the previous ACTIVITY
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
                /*
                * !!!!FOR THE APP NOT TO CRASH REMEMBER TO CREATIVE A MANIFEST ACTIVITY FOR NEW ACTIVITY
                * <activity android:name=".MainActivity"2>
                *
                * */
            }
        });
    }
}