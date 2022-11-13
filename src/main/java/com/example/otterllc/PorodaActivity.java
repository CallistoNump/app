package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PorodaActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poroda_activity);
    }

    public void forward(View view){
        Intent intent = new Intent(PorodaActivity.this, GenderActivity.class);
        startActivity(intent);
    }
}
