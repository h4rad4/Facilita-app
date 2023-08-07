package com.example.facilita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.facilita.TelaDeMenu;
import com.example.facilita.R;

public class TelaDeLogin extends AppCompatActivity {

    private EditText emailEditText;
    private EditText senhaEditText;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_login);

        emailEditText = findViewById(R.id.editTextTextPersonName);
        senhaEditText = findViewById(R.id.editTextTextPersonName2);
        okButton = findViewById(R.id.buttonOk);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String senha = senhaEditText.getText().toString().trim();

                if (email.isEmpty() || senha.isEmpty()) {
                    Toast.makeText(TelaDeLogin.this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(TelaDeLogin.this, TelaDeMenu.class);
                    startActivity(intent);
                }
            }
        });
    }
}
