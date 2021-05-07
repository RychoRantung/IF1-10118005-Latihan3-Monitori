package com.example.if1_10118005_latihan3_monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "com.example.if1_10118005_latihan3_monitori.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void onClickHi(View view) {
        Intent intent = new Intent(BiodataActivity.this, SayHiActivity.class);
        EditText inputNama = (EditText) findViewById(R.id.inputNama);
        String nama = inputNama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, nama);
        startActivity(intent);
    }
}