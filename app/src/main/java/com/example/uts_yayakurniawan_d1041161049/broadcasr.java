package com.example.uts_yayakurniawan_d1041161049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class broadcasr extends AppCompatActivity {
    private Button mBtn_syntaxb,Backb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcasr);
        mBtn_syntaxb = (Button) findViewById(R.id.syntaxb);

        mBtn_syntaxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),syntaxbroadcast.class);
                startActivity(iLogin);
            }
        });
        Backb = (Button) findViewById(R.id.backb);

        Backb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),menu.class);
                startActivity(iLogin);
            }
        });
    }
}
