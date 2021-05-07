package com.example.if1_10118005_latihan3_monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickBiodata(View view) {
        Intent intent = new Intent(LoginActivity.this, BiodataActivity.class);
        startActivity(intent);
    }
}