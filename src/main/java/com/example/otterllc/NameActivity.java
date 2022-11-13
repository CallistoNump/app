package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;

public class NameActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_activity);
    }

    public void to_menu(View view){
        Intent intent = new Intent(NameActivity.this, MenuActivity.class);
        startActivity(intent);
    }
}
