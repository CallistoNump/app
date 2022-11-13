package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PetsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets_activity);
    }

    public void in_development(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "В разработке", Toast.LENGTH_LONG);
        toast.show();
    }

    public void to_menu(View view){
        Intent intent = new Intent(PetsActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void to_obzor(View view){
        Intent intent = new Intent(PetsActivity.this, ObzorActivity.class);
        startActivity(intent);
    }

    public void to_consultation(View view){
        Intent intent = new Intent(PetsActivity.this, ConsultationActivity.class);
        startActivity(intent);
    }

    public void to_profile(View view){
        Intent intent = new Intent(PetsActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void to_settings(View view){
        Intent intent = new Intent(PetsActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
}
