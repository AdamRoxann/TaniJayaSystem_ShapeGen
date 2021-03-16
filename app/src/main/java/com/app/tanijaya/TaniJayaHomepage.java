package com.app.tanijaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TaniJayaHomepage extends AppCompatActivity {

    Button btnBack;
    Button btnBuynow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tani_jaya_homepage);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBuynow = (Button) findViewById(R.id.btnBuynow);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaniJayaHomepage.this, HomePage.class);
                TaniJayaHomepage.this.startActivity(intent);
                finish();
            }

        });

        btnBuynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaniJayaHomepage.this, BuyScreen.class);
                TaniJayaHomepage.this.startActivity(intent);
                finish();
            }

        });
    }
}