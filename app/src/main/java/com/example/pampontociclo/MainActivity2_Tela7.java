package com.example.pampontociclo;

import static android.content.Intent.ACTION_VIEW;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2_Tela7 extends AppCompatActivity {
    Button btnvoltar3;
    Button btnverificar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela7);


        btnverificar2=(Button)findViewById(R.id.btnverificar2);
        btnverificar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location= Uri.parse("geo:0,0?q=Rua+Marina+Ciufuli+Zanfelice+289");
                Intent mapa = new Intent(ACTION_VIEW, location);
                startActivity(mapa);


            }

        });




        btnvoltar3=(Button)findViewById(R.id.btnvoltar3);

        btnvoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View volta) {
                Intent voltar3 = new Intent(MainActivity2_Tela7.this, MainActivity2_Tela4.class);
                startActivity(voltar3);


            }
        });
    }
}


