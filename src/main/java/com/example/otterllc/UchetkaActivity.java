package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class UchetkaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uchetka_activity);
    }

    public void forward(View view){
        Intent intent = new Intent(UchetkaActivity.this, ViborActivity.class);
        startActivity(intent);
    }

    public void to_sozdanie(View view){
        Intent intent = new Intent(UchetkaActivity.this, SozdanieActivity.class);
        startActivity(intent);
    }
    public void to_menu(View view){
        Intent intent = new Intent(UchetkaActivity.this, MenuActivity.class);
        startActivity(intent);
    }

}
