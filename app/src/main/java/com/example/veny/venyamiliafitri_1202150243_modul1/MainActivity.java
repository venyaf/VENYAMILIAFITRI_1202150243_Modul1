package com.example.veny.venyamiliafitri_1202150243_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edMenu, edPorsi;
    TextView tvTempat, tvMenu, tvPorsi, tvHarga;
    Button btEatbus, btAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edMenu = (EditText) findViewById(R.id.editTextMenu);
        edPorsi = (EditText) findViewById(R.id.editTextPorsi);
        tvTempat = (TextView) findViewById(R.id.textViewTempat);
        tvMenu = (TextView) findViewById(R.id.textViewMenu);
        tvPorsi = (TextView) findViewById(R.id.textViewPorsi);
        tvHarga = (TextView) findViewById(R.id.textViewHarga);
        btEatbus = (Button) findViewById(R.id.buttonEatbus);
        btAbnormal = (Button) findViewById(R.id.buttonAbnormal);
    }

    public void klikEatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        int uang = 65500;
        String uangOsas = String.valueOf(uang);
        intent.putExtra("uangOsas", uangOsas);

        String tempatMakan = "Eatbus";
        intent.putExtra("tempatMakan", tempatMakan);

        String menu = edMenu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = edPorsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);


            }

    public void klikAbnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        int uang = 65500;
        String uangOsas = String.valueOf(uang);
        intent.putExtra("uangOsas", uangOsas);

        String tempatMakan = "Abnormal";
        intent.putExtra("tempatMakan", tempatMakan);;

        String menu = edMenu.getText().toString();
        intent.putExtra("menu", menu);

        String porsi = edPorsi.getText().toString();
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }
}
