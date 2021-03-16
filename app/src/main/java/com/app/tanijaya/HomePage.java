package com.app.tanijaya;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    Button btnBangunData;
    Button btnTanijaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btnTanijaya = (Button) findViewById(R.id.btnTanijaya);
        btnBangunData = (Button) findViewById(R.id.btnBangunData);


        btnBangunData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, SquareProgram.class);
                HomePage.this.startActivity(intent);
                finish();
            }

         });

        btnTanijaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, TaniJayaHomepage.class);
                HomePage.this.startActivity(intent);
                finish();
            }

        });
    }
}