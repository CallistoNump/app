package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GenderActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender_activity);
    }

    public void forward(View view){
        Intent intent = new Intent(GenderActivity.this, NameActivity.class);
        startActivity(intent);
    }
}
