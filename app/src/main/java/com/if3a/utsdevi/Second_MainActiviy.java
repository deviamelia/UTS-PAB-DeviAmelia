package com.if3a.utsdevi;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_MainActiviy extends AppCompatActivity {
        TextView tvNama;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.second_activity);

                getSupportActionBar().setTitle("Layout B");

                tvNama = findViewById(R.id.tv_nama);

                Intent terima = getIntent();
                String yNama = terima.getStringExtra("xNama");
                tvNama.setText(yNama);
        }
}
