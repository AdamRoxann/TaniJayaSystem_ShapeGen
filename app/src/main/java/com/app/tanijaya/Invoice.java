package com.app.tanijaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Invoice extends AppCompatActivity {

    TextView nama_pembeli, jumlah, jenis1, jenis2, jenis3, kualitasTotal, totalHarga;

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        nama_pembeli = (TextView)findViewById(R.id.nama_pembeli);
        jumlah = (TextView)findViewById(R.id.jumlah);
        jenis1 = (TextView)findViewById(R.id.jenis1);
        jenis2 = (TextView)findViewById(R.id.jenis2);
        jenis3 = (TextView)findViewById(R.id.jenis3);
        kualitasTotal = (TextView)findViewById(R.id.kualitasTotal);
        totalHarga = (TextView)findViewById(R.id.totalHarga);

        nama_pembeli.setText("Nama Pembeli: "+Pembeli.message);
        jumlah.setText("Jumlah kopi yang dibeli: "+JumlahPesan.message);
        jenis1.setText(NamaBarang.message);
        jenis2.setText(NamaBarangB.message);
        jenis3.setText(NamaBarangC.message);
        kualitasTotal.setText("Kualitas: "+Kualitas.message);
        totalHarga.setText("Total Harga Rp."+Hasil.message);

        btnBack = (Button) findViewById(R.id.btnBack);



        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Invoice.this, BuyScreen.class);
                Invoice.this.startActivity(intent);
                finish();
            }

        });
    }
}