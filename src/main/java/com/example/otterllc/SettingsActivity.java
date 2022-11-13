package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
    }

    public void in_development(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "В разработке", Toast.LENGTH_LONG);
        toast.show();
    }

    public void to_menu(View view){
        Intent intent = new Intent(SettingsActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void to_obzor(View view){
        Intent intent = new Intent(SettingsActivity.this, ObzorActivity.class);
        startActivity(intent);
    }

    public void to_consultation(View view){
        Intent intent = new Intent(SettingsActivity.this, ConsultationActivity.class);
        startActivity(intent);
    }

    public void to_profile(View view){
        Intent intent = new Intent(SettingsActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void to_settings(View view){
        Intent intent = new Intent(SettingsActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
}
