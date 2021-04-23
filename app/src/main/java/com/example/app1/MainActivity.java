package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //creating the button variable
    Button nextt;
    EditText name_edtt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //linking variables to xml code
        nextt = findViewById(R.id.next);
        name_edtt = findViewById(R.id.name_edt);
        nextt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creating a string variable to to store the input text
                String input = name_edtt.getText().toString();
                //intent to fetch current activity
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                // “input” is the string value
                // the key is “message_key” this key will use to getting the str value
                i.putExtra("message_key", input);
                startActivity(i);


                //intent to call another screen
                //mAct changes to MAct2
               /* Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);*/

            }
        });

    }
}