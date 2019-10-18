package com.example.uts_yayakurniawan_d1041161049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class materi extends AppCompatActivity {
    private Button mBtn_syntax,Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        mBtn_syntax = (Button) findViewById(R.id.syntaxs);

        mBtn_syntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),syntaxactivity.class);
                startActivity(iLogin);
            }
        });
       Back = (Button) findViewById(R.id.backs);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),menu.class);
                startActivity(iLogin);
            }
        });
    }
}
