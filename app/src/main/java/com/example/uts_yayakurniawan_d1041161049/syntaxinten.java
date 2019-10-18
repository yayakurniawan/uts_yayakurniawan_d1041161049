package com.example.uts_yayakurniawan_d1041161049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class syntaxinten extends AppCompatActivity {
    private Button mBtn_sbs4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntaxinten);
        mBtn_sbs4= (Button) findViewById(R.id.sbs4);

        mBtn_sbs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),menu.class);
                startActivity(iLogin);
            }
        });
    }
}
