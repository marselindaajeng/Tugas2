package com.example.kalkulatorlogaritma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kalkulatorlogaritma.R;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button btnsin,btncos,btntan,btncsc,btnsec,btncot,btnlogaritma;
    private TextView tvhasil;
    private EditText ettext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsin = findViewById(R.id.sin);
        btncos = findViewById(R.id.cos);
        btntan = findViewById(R.id.tan);
        btncsc = findViewById(R.id.csc);
        btnsec = findViewById(R.id.sec);
        btncot = findViewById(R.id.cot);
        btnlogaritma = findViewById(R.id.logaritma);
        tvhasil = findViewById(R.id.hasil);
        ettext = findViewById(R.id.text);

        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String ssin = ettext.getText().toString();

                    double dsin = Double.parseDouble(ssin);

                    double sin = Math.sin(dsin);

                    String sHasil = String.valueOf(sin);
                    tvhasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String scos = ettext.getText().toString();

                    double dcos = Double.parseDouble(scos);

                    double cos = Math.cos(dcos);

                    String sHasil = String.valueOf(cos);
                    tvhasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String stan = ettext.getText().toString();

                    double dtan = Double.parseDouble(stan);

                    double tan = Math.tan(dtan);

                    String sHasil = String.valueOf(tan);
                    tvhasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btncsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String scsc = ettext.getText().toString();

                    double dcsc = Double.parseDouble(scsc);

                    double csc = 1.0/Math.sin(dcsc);

                    String sHasil = String.valueOf(csc);
                    tvhasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String ssec = ettext.getText().toString();

                    double dsec = Double.parseDouble(ssec);

                    double sec = 1.0/Math.cos(dsec);

                    String sHasil = String.valueOf(sec);
                    tvhasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btncot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String scot = ettext.getText().toString();

                    double dcot = Double.parseDouble(scot);

                    double cot = 1.0/Math.tan(dcot);

                    String sHasil = String.valueOf(cot);
                    tvhasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnlogaritma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String slogaritma = ettext.getText().toString();

                    double dlogaritma = Double.parseDouble(slogaritma);

                    double logaritma = Math.log10(dlogaritma);

                    String sHasil = String.valueOf(logaritma);
                    tvhasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
