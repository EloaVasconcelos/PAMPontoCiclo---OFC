package com.example.pampontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtlogin;
    EditText txtnome;
    EditText txtemail;
    EditText txtsenha1;
    EditText txtsenha2;
    Button btnenviar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtlogin = findViewById(R.id.txtlogin);
        txtemail = findViewById(R.id.txtemail);
        txtnome = findViewById(R.id.txtnome);
        txtsenha1 = findViewById(R.id.txtsenha1);
        txtsenha2 = findViewById(R.id.txtsenha2);
        btnenviar = findViewById(R.id.btnenviar);


        btnenviar.setOnClickListener(view -> {
            String NOME = txtnome.getText().toString();

            if (!NOME.isEmpty()) {
                // Passar o nome de usuário para a próxima tela
                Intent passar = new Intent(MainActivity.this, MainActivity2_Tela2.class);
                passar.putExtra("NOME_EXTRA", NOME);
                startActivity(passar);
            }
        });

    }
}



    
