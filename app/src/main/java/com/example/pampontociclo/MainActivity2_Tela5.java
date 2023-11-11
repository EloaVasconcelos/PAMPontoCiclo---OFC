package com.example.pampontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2_Tela5 extends AppCompatActivity {
    Button btnvoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela5);

        btnvoltar=(Button) findViewById(R.id.btnvoltar);




        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vo) {
                Intent voltar = new Intent(MainActivity2_Tela5.this,MainActivity2_Tela4.class);
                startActivity(voltar);




            }
        });
    }
}

