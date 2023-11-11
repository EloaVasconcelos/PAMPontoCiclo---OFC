package com.example.pampontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2_Tela4 extends AppCompatActivity {
    Button btnsus;
    Button btnreci;
    Button btnpontos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela4);



        btnsus=(Button) findViewById(R.id.btnsus);
        btnsus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View s) {
                Intent susten = new Intent(MainActivity2_Tela4.this, MainActivity2_Tela5.class);
                startActivity(susten);


            }
        });




        btnreci=(Button) findViewById(R.id.btnreci);


        btnreci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View n) {
                Intent recicla = new Intent(MainActivity2_Tela4.this, MainActivity2_Tela6.class);
                startActivity(recicla);


            }
        });

        btnpontos=(Button) findViewById(R.id.btnpontos);
        btnpontos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                Intent pontos = new Intent(MainActivity2_Tela4.this, MainActivity2_Tela7.class);
                startActivity(pontos);




            }
        });


    }
}
