package com.example.tugassatu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bangunDatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangun_datar);

        // Persegi
        EditText inputSisiPersegi = findViewById(R.id.inputSisiPersegi);
        Button buttonHitungPersegi = findViewById(R.id.buttonHitungPersegi);
        TextView outputPersegi = findViewById(R.id.outputPersegi);

        buttonHitungPersegi.setOnClickListener(v -> {
            try {
                double sisi = Double.parseDouble(inputSisiPersegi.getText().toString());
                double luas = sisi * sisi;
                outputPersegi.setText("Hasil: " + luas);
            } catch (NumberFormatException e) {
                Toast.makeText(bangunDatar.this, "Masukkan angka yang valid!", Toast.LENGTH_SHORT).show();
            }
        });

        // Persegi Panjang
        EditText inputPanjang = findViewById(R.id.inputPanjang);
        EditText inputLebar = findViewById(R.id.inputLebar);
        Button buttonHitungPersegiPanjang = findViewById(R.id.buttonHitungPersegiPanjang);
        TextView outputPersegiPanjang = findViewById(R.id.outputPersegiPanjang);

        buttonHitungPersegiPanjang.setOnClickListener(v -> {
            try {
                double panjang = Double.parseDouble(inputPanjang.getText().toString());
                double lebar = Double.parseDouble(inputLebar.getText().toString());
                double luas = panjang * lebar;
                outputPersegiPanjang.setText("Hasil: " + luas);
            } catch (NumberFormatException e) {
                Toast.makeText(bangunDatar.this, "Masukkan angka yang valid!", Toast.LENGTH_SHORT).show();
            }
        });

        // Segitiga
        EditText inputAlas = findViewById(R.id.inputAlas);
        EditText inputTinggi = findViewById(R.id.inputTinggi);
        Button buttonHitungSegitiga = findViewById(R.id.buttonHitungSegitiga);
        TextView outputSegitiga = findViewById(R.id.outputSegitiga);

        buttonHitungSegitiga.setOnClickListener(v -> {
            try {
                double alas = Double.parseDouble(inputAlas.getText().toString());
                double tinggi = Double.parseDouble(inputTinggi.getText().toString());
                double luas = 0.5 * alas * tinggi;
                outputSegitiga.setText("Hasil: " + luas);
            } catch (NumberFormatException e) {
                Toast.makeText(bangunDatar.this, "Masukkan angka yang valid!", Toast.LENGTH_SHORT).show();
            }
        });

        // Lingkaran
        EditText inputJariJari = findViewById(R.id.inputJariJari);
        Button buttonHitungLingkaran = findViewById(R.id.buttonHitungLingkaran);
        TextView outputLingkaran = findViewById(R.id.outputLingkaran);

        buttonHitungLingkaran.setOnClickListener(v -> {
            try {
                double jariJari = Double.parseDouble(inputJariJari.getText().toString());
                double luas = Math.PI * jariJari * jariJari;
                outputLingkaran.setText("Hasil: " + luas);
            } catch (NumberFormatException e) {
                Toast.makeText(bangunDatar.this, "Masukkan angka yang valid!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

