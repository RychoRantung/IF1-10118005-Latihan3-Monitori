package com.example.if1_10118005_latihan3_monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SayHiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hi);

        Intent intent = getIntent();
        String nama = intent.getStringExtra(BiodataActivity.EXTRA_MESSAGE);

        TextView passNama = findViewById(R.id.value_nama);
        passNama.setText(nama);
    }
}