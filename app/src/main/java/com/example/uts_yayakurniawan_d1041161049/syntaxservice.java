package com.example.uts_yayakurniawan_d1041161049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class syntaxservice extends AppCompatActivity {
    private Button mBtn_sbs ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntaxservice);
        mBtn_sbs = (Button) findViewById(R.id.sbs);

        mBtn_sbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),service.class);
                startActivity(iLogin);
            }
        });
    }
}
