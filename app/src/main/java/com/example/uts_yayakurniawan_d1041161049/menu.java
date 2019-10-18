package com.example.uts_yayakurniawan_d1041161049;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    private Button mBtn_activity,service,broadcast,conten1,inten,logout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mBtn_activity = (Button) findViewById(R.id.activity);

        mBtn_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),materi.class);
                startActivity(iLogin);
            }
        });

        service = (Button) findViewById(R.id.service);

        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),service.class);
                startActivity(iLogin);
            }
        });
        broadcast = (Button) findViewById(R.id.broadcast);

        broadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),broadcasr.class);
                startActivity(iLogin);
            }
        });
        conten1 = (Button) findViewById(R.id.content1);

        conten1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),content.class);
                startActivity(iLogin);
            }
        });
        inten = (Button) findViewById(R.id.inten);

        inten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),menu.class);
                startActivity(iLogin);
            }
        });
        logout = (Button) findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(iLogin);
            }
        });
    }
}
