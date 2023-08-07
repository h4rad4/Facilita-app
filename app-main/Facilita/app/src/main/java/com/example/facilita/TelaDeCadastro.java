package com.example.facilita;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaDeCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);
    }

    public void realizarCadastro(View view) {
        EditText txtNome = findViewById(R.id.txtnome);
        EditText txtEmail = findViewById(R.id.txtemail);
        EditText txtSenha = findViewById(R.id.txtsenha);

        String nome = txtNome.getText().toString().trim();
        String email = txtEmail.getText().toString().trim();
        String senha = txtSenha.getText().toString().trim();

        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Cadastro realizado com sucesso! \nPor favor, faça o login", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(TelaDeCadastro.this, MainActivity.class);
            startActivity(intent);
        }
    }

}