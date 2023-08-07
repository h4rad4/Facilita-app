package com.example.facilita;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaDeMenu extends AppCompatActivity {

    private Button btnQuestoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_menu);

        btnQuestoes = findViewById(R.id.btnquestoes);

        btnQuestoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaDeMenu.this, TelaVest.class);
                startActivity(intent);
            }
        });
    }
}
