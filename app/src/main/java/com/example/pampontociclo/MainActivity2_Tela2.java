package com.example.pampontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2_Tela2 extends AppCompatActivity {
    Button btnentrar;
    TextView txtrecebenome;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela2);

        btnentrar = (Button) findViewById(R.id.btnentrar);
        txtrecebenome = findViewById(R.id.txtrecebenome);


        String NOME = getIntent().getStringExtra("NOME_EXTRA");

        if (NOME != null && !NOME.isEmpty()) {
            txtrecebenome.setText("Bem-Vindo(a) ao Ponto Ciclo, " +
                    NOME);
        }

        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent Entrar = new Intent(MainActivity2_Tela2.this, MainActivity2_Tela3.class);
                startActivity(Entrar);
            }
        });

    }
}
