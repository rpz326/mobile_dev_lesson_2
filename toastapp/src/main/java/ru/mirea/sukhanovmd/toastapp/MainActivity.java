package ru.mirea.sukhanovmd.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countCharacters(View view) {
        EditText editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        int characterCount = text.length();
        String message = "Студент 21, Группа БСБО-09-21, Количество символов - " + characterCount;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}