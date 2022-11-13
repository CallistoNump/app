package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GlavnayActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glavnay_activity);
    }

    public void forward(View view){
        Intent intent = new Intent(GlavnayActivity.this, ViborActivity.class);
        startActivity(intent);
    }
}
