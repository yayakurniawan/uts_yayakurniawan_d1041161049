package com.example.uts_yayakurniawan_d1041161049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intent extends AppCompatActivity {
    private Button mBtn_syntaxi,Backi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        mBtn_syntaxi = (Button) findViewById(R.id,mBtn_syntaxi);

        mBtn_syntaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),syntaxinten.class);
                startActivity(iLogin);
            }
        });
        Backi = (Button) findViewById(R.id.backi);

        Backi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),menu.class);
                startActivity(iLogin);
            }
        });
    }
}
