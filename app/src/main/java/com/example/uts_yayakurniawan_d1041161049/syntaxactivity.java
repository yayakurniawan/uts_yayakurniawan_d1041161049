package com.example.uts_yayakurniawan_d1041161049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class syntaxactivity extends AppCompatActivity {
    private Button mBtn_syb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntaxactivity);
        mBtn_syb = (Button) findViewById(R.id,mBtn_syb);

        mBtn_syb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),materi.class);
                startActivity(iLogin);
            }
        });
    }
}
