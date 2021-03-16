package com.app.tanijaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup;
import android.widget.RadioButton;

public class BuyScreen extends AppCompatActivity {

    Button btnBack;

    EditText jumlah, nama_pembeli;
//    TextView test;
//    int val = Integer.parseInt( num.getText().toString() );
//    int finalValue=Integer.parseInt(String.valueOf(jumlah));

    private CheckBox arabica, robustalampung, ulukareng;
    private String menu1, menu2, menu3;
    private Button btnCount;
    private RadioGroup list_opsi;
    private RadioButton kualitasA, kualitasB;

//    private TextView pilihan1, pilihan2, pilihan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_screen);

        btnBack = (Button) findViewById(R.id.btnBack);





        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuyScreen.this, TaniJayaHomepage.class);
                BuyScreen.this.startActivity(intent);
                finish();
            }

        });

        arabica = findViewById(R.id.arabica);
        robustalampung = findViewById(R.id.robustalampung);
        ulukareng = findViewById(R.id.ulukareng);
//        pilihan1 = findViewById(R.id.pilihan_satu);
//        pilihan2 = findViewById(R.id.pilihan_dua);
//        pilihan3 = findViewById(R.id.pilihan_tiga);
        btnCount = findViewById(R.id.btnCount);
        kualitasA = findViewById(R.id.kualitasA);
        kualitasB = findViewById(R.id.kualitasB);

        jumlah = (EditText) findViewById(R.id.jumlah);
        nama_pembeli = (EditText) findViewById(R.id.nama_pembeli);


//        test=(TextView) findViewById(R.id.test);

        // Saat Tombol Diklik Maka Program Akan mengeksekusi Pesanan dari User
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Melihat Status Kondisi Pada Pilihan Menu Ayam Goreng
//                if(arabica.isChecked()){
//                    menu1 = "Arabica Gayo";
//                }else if(!arabica.isChecked()){
//                    menu1 = " ";
//                }
//
//                // Melihat Status Kondisi Pada Pilihan Menu Bakso
//                if(robustalampung.isChecked()){
//                    menu2 = "Robusta Lampung";
//                }else if(!robustalampung.isChecked()){
//                    menu2 = " ";
//                }
//
//                // Melihat Status Kondisi Pada Pilihan Menu Mie Rebus
//                if(ulukareng.isChecked()){
//                    menu3 = "Ulukareng";
//                }else if(!ulukareng.isChecked()){
//                    menu3 = " ";
//                }

                if(arabica.isChecked() && robustalampung.isChecked() && !ulukareng.isChecked() && kualitasA.isChecked()){

                    double discount = 0.07;

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = 180.000+100.000;
                    total=jumlah_pembelian*bil1;
                    totaldiscount=total*discount;
                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(hasil);
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "Arabica Gayo";
                    String nama_barangB = "Robusta Lampung";
                    String nama_barangC = "";
                    String kualitas_barang = "A";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();


                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();
                } else if(arabica.isChecked() && robustalampung.isChecked() && ulukareng.isChecked() && kualitasA.isChecked()){
                    double discount = 0.15;

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (180.000+100.000+200.000);
                    total=jumlah_pembelian*bil1;
                    totaldiscount=total*discount;
                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(hasil);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "Arabica Gayo";
                    String nama_barangB = "Robusta Lampung";
                    String nama_barangC = "Ulukareng";
                    String kualitas_barang = "A";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();


                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();

                } else if(!arabica.isChecked() && robustalampung.isChecked() && ulukareng.isChecked() && kualitasA.isChecked()){
                    double discount = 0.05;

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (100.000+200.000);
                    total=jumlah_pembelian*bil1;
                    totaldiscount=total*discount;
                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(hasil);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "";
                    String nama_barangB = "Robusta Lampung";
                    String nama_barangC = "Ulukareng";
                    String kualitas_barang = "A";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();

                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();


                } else if(arabica.isChecked() && !robustalampung.isChecked() && !ulukareng.isChecked() && kualitasA.isChecked()){
                    double discount = 0.02;

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (180.000);
                    total=jumlah_pembelian*bil1;
                    totaldiscount=total*discount;
                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(hasil);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "Arabica Gayo";
                    String nama_barangB = "";
                    String nama_barangC = "";
                    String kualitas_barang = "A";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();

                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();


                } else if(!arabica.isChecked() && robustalampung.isChecked() && !ulukareng.isChecked() && kualitasA.isChecked()){
                    double discount = 0.02;

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (100.000);
                    total=jumlah_pembelian*bil1;
                    totaldiscount=total*discount;
                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(hasil);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "";
                    String nama_barangB = "Robusta Lampung";
                    String nama_barangC = "";
                    String kualitas_barang = "A";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();

                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();


                } else if(!arabica.isChecked() && !robustalampung.isChecked() && ulukareng.isChecked() && kualitasA.isChecked()){
                    double discount = 0.02;

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (200.000);
                    total=jumlah_pembelian*bil1;
                    totaldiscount=total*discount;
                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(hasil);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "";
                    String nama_barangB = "";
                    String nama_barangC = "Ulukareng";
                    String kualitas_barang = "A";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();

                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();


                } else if(arabica.isChecked() && robustalampung.isChecked() && ulukareng.isChecked() && !kualitasA.isChecked() && kualitasB.isChecked() ){

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (135.000+75.000+150.000);
                    total=jumlah_pembelian*bil1;
//                    totaldiscount=total*discount;
//                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(total);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "Arabica Gayo";
                    String nama_barangB = "Robusta Lampung";
                    String nama_barangC = "Ulukareng";
                    String kualitas_barang = "B";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();

                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();

                } else if(arabica.isChecked() && !robustalampung.isChecked() && !ulukareng.isChecked() && !kualitasA.isChecked() && kualitasB.isChecked() ){

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (135.000);
                    total=jumlah_pembelian*bil1;
//                    totaldiscount=total*discount;
//                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(total);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "Arabica Gayo";
                    String nama_barangB = "";
                    String nama_barangC = "";
                    String kualitas_barang = "B";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();

                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();


                } else if(!arabica.isChecked() && robustalampung.isChecked() && !ulukareng.isChecked() && !kualitasA.isChecked() && kualitasB.isChecked() ){

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (75.000);
                    total=jumlah_pembelian*bil1;
//                    totaldiscount=total*discount;
//                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(total);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "";
                    String nama_barangB = "Robusta Lampung";
                    String nama_barangC = "";
                    String kualitas_barang = "B";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();

                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();

                } else if(!arabica.isChecked() && !robustalampung.isChecked() && ulukareng.isChecked() && !kualitasA.isChecked() && kualitasB.isChecked() ){

//                    Toast.makeText(getApplicationContext(), ""+hasil1, Toast.LENGTH_LONG).show();
                    double bil1,hasil, total,totaldiscount, jumlah_pembelian;
                    bil1=Double.valueOf(jumlah.getText().toString().trim());
                    jumlah_pembelian = (150.000);
                    total=jumlah_pembelian*bil1;
//                    totaldiscount=total*discount;
//                    hasil = total-totaldiscount;
                    String hasil1=String.valueOf(total);
//                    test.setText(hasil1+"00");
                    String hasil2 = (hasil1+"00");
                    String nama_barangA = "";
                    String nama_barangB = "";
                    String nama_barangC = "Ulukareng";
                    String kualitas_barang = "B";
                    String jumlahPesan = String.valueOf(bil1);
                    Pembeli.message = nama_pembeli.getText().toString();
                    NamaBarang.message = nama_barangA.toString();
                    NamaBarangB.message = nama_barangB.toString();
                    NamaBarangC.message = nama_barangC.toString();
                    Kualitas.message = kualitas_barang.toString();
                    Hasil.message = hasil2.toString();
                    JumlahPesan.message = jumlahPesan.toString();

                    Intent intent = new Intent(BuyScreen.this, Invoice.class);
                    BuyScreen.this.startActivity(intent);
                    startActivity(intent);
                    finish();

                }


                // Kondisi Jika Tidak Ada Salah Satupun Menu Makanan Yang Dipilih
//                if(!arabica.isChecked() && !robustalampung.isChecked() && !ulukareng.isChecked()){
//                    Toast.makeText(getApplicationContext(), "Tidak Ada Menu yang Dipesan", Toast.LENGTH_SHORT).show();
//                }else{
//                    // Menampilkan Hasil Pesanan Yang Di Input Dari User
//                    Toast.makeText(getApplicationContext(), "Pesanan Terkirim", Toast.LENGTH_SHORT).show();
////                    pilihan1.setText("Pilihan 1: "+menu1);
////                    pilihan2.setText("Pilihan 2: "+menu2);
////                    pilihan3.setText("Pilihan 3: "+menu3);
//                }
            }
        });

//        list_opsi = findViewById(R.id.pilihankualitas);
//        list_opsi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int id) {
//                switch (id){
//                    case R.id.kualitasA:
//                        Toast.makeText(getApplication(), "Saya Suka Java", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.kualitasB:
//                        Toast.makeText(getApplication(), "Saya Suka Kotlin", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        });
    }
}