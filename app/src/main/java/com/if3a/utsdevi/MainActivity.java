package com.chearly.pendaftranmaba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.if3a.utsdevi.R;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etNomor;
    Button btnDAFTAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_nama);
        etNomor = findViewById(R.id.et_nomor);
        btnDAFTAR = findViewById(R.id.et_daftar);
        btnDAFTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NomorPendaftarn = etNama.getText().toString();
                String Nama = etNomor.getText().toString();

                if (NomorPendaftarn.trim().equals("")){
                    etNama.setError("Nama Lengkap Wajib Diisi");
                }
                else  if (Nama.trim().equals("")){
                    etNomor.setError("Nomor Pendaftaran Wajib Diisi");
                }
                else{
                    Toast.makeText(MainActivity.this, "Selamat Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}