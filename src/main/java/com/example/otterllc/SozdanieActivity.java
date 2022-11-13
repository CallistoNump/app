package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SozdanieActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sozdanie_activity);
    }

    public void forward(View view){
        Intent intent = new Intent(SozdanieActivity.this, ViborActivity.class);
        startActivity(intent);
    }

    public void to_uchetka(View view){
        Intent intent = new Intent(SozdanieActivity.this, UchetkaActivity.class);
        startActivity(intent);
    }
    public void to_menu(View view){
        Intent intent = new Intent(SozdanieActivity.this, MenuActivity.class);
        startActivity(intent);
    }

}
