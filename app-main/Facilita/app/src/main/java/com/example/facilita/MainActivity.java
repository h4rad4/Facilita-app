package com.example.facilita;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void telacadastro(View view) {
        Intent in = new Intent(MainActivity.this, TelaDeCadastro.class);
        startActivity(in);

    }
    public void telalogin(View view) {
        Intent in = new Intent(MainActivity.this, TelaDeLogin.class);
        startActivity(in);
    }
}

