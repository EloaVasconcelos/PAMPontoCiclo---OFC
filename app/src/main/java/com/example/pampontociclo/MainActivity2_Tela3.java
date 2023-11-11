package com.example.pampontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2_Tela3 extends AppCompatActivity {
    Button btnproximo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela3);



        btnproximo= (Button) findViewById(R.id.btnproximo);


        btnproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View p) {
                Intent proximo = new Intent(MainActivity2_Tela3.this,MainActivity2_Tela4.class);
                startActivity(proximo);


            }
        });
    }
}


