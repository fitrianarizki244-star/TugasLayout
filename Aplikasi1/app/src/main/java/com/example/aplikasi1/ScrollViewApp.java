package com.example.scrollviewapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etEmail, etHp;
    Button btnKirim;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.scrollviewapp);

        etNama = findViewById(id.etNama);
        etEmail = findViewById(id.etEmail);
        etHp = findViewById(id.etHp);
        btnKirim = findViewById(.id.btnKirim);
        tvHasil = findViewById(.id.tvHasil);

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = etNama.getText().toString();
                String email = etEmail.getText().toString();
                String hp = etHp.getText().toString();

                tvHasil.setText(
                        "Nama: " + nama +
                                "\nEmail: " + email +
                                "\nNo HP: " + hp
                );
            }
        });
    }
}