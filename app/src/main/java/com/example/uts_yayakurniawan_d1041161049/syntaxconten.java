package com.example.uts_yayakurniawan_d1041161049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class syntaxconten extends AppCompatActivity {
    private Button mBtn_sbs3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntaxconten);
        mBtn_sbs3 = (Button) findViewById(R.id,mBtn_sbs3);
        mBtn_sbs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),content.class);
                startActivity(iLogin);
            }
        });
    }
}
