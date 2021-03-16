package com.app.tanijaya;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class SquareProgram extends AppCompatActivity {

    EditText jumlah;
    Button btnSubmit, btnBack;
    TextView hasil, hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_program);

        jumlah = (EditText) findViewById(R.id.jumlah);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        hasil = (TextView) findViewById(R.id.hasil);

        btnBack = (Button) findViewById(R.id.btnBack);





        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SquareProgram.this, HomePage.class);
                SquareProgram.this.startActivity(intent);
                finish();
            }

        });
//        hasil2 = (TextView) findViewById(R.id.hasil2);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Integer no = Integer.parseInt(jumlah.getText().toString());
               StringBuilder ans = new StringBuilder();
//                StringBuilder anss = new StringBuilder();

               for(int i = 0; i<no; i++){
                   for(int j = 0; j<no; j++){
                       ans.append("@");
                   }
                   ans.append("\n");
               }
               hasil.setText(ans);
//               hasil2.setText(anss);
            }

        });


    }
}