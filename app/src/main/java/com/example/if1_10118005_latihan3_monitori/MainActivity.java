package com.example.if1_10118005_latihan3_monitori;

/*
 * NIM: 10118005
 * Nama: Rycho Rantung
 * Kelas: IF-1
 * Tanggal Pengerjaan: 6 Mei 2021
 * Deskripsi Pekerjaan: Membuat project aplikasi monitori.

 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnclickLogin(View view) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}