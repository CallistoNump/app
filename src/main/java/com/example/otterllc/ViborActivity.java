package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ViborActivity  extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vidor_activity);
    }

    public void to_uchetka(View view){
        Intent intent = new Intent(ViborActivity.this, UchetkaActivity.class);
        startActivity(intent);
    }

    public void to_poroda(View view){
        Intent intent = new Intent(ViborActivity.this, PorodaActivity.class);
        startActivity(intent);
    }
}