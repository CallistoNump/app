package com.example.otterllc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ObzorActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obzor_activity);


        String[] countries = { "Терапевт", "Дерматолог", "Зоопсихолог", "Диетолог", "Хирург","Офтальмолог" };

        Spinner spinner = findViewById(R.id.spinner);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);
    }

    public void in_development(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "В разработке", Toast.LENGTH_LONG);
        toast.show();
    }

    public void to_menu(View view){
        Intent intent = new Intent(ObzorActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void to_obzor(View view){
        Intent intent = new Intent(ObzorActivity.this, ObzorActivity.class);
        startActivity(intent);
    }

    public void to_consultation(View view){
        Intent intent = new Intent(ObzorActivity.this, ConsultationActivity.class);
        startActivity(intent);
    }

    public void to_profile(View view){
        Intent intent = new Intent(ObzorActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void to_settings(View view){
        Intent intent = new Intent(ObzorActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    public void zapispis(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Успешно", Toast.LENGTH_LONG);
        toast.show();
    }


}
