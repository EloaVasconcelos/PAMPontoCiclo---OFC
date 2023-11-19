

package com.example.pampontociclo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Random; // Sugestão do Android

public class MainActivity2_Tela5 extends AppCompatActivity implements SensorEventListener {

    // instanciando elementos de tela
    Button btnvoltar;
    ImageView imgmetas;

    // instanciando/ criando variáveis que receberam os sensores
    SensorManager sensorManager;
    Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_tela5);

        // instânciando os elementos de tela pelo ID declarado
        btnvoltar = findViewById(R.id.btnvoltar);
        imgmetas = findViewById(R.id.Imgmetas);


        // Inicializar o SensorManager e o Sensor
        // a classe sensorManager está recebendo a classe que fornece o acesso aos sensores do android
        //Context.SENSOR_SERVICE = identifica o serviço de sensores
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);


        // Definindo o sensor que será utilizado
        // getDefaultSensor = serve para instânciar o sensor padrão do dispositivo
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);


        // registerListener criando um ouvinte do sensor para atualizações dos dados
        //this = esta instânciando o ouvinte
        //SENSOR_DELAY_NORMAL = atualização dos dados do sensor, definida como "normal"
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);



        // Programando o Botão voltar
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vo) {
                Intent voltar = new Intent(MainActivity2_Tela5.this, MainActivity2_Tela4.class);
                startActivity(voltar);
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        // Criando variáveis para receberem os valores das coordenadas de x e y

        // Event.values = array dos dados fornecidos pelo sensor
        float x = event.values[0];  // eixo x
        float y = event.values[1];  // eixo y


        // Verificando o valor necessário para a imagem aparecer (x e y)
        // Math.abs() =  método em que retorna o valor absoluto de um número

        if (Math.abs(x) > 14 && Math.abs(y) > -14) {
            /* (Quando o usuário balançar o celular)
            se x foi maior que 14 e y maior que -14 as funçoes serão chamadas
             e a imagem ira mudar */

            metas_Random(); // chamando as imagens
            Aviso_sensor(); // Irá ativar o tost (avisando o usuário)
        }
        }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
        //// Este método utilizado  quando a precisão do sensor é alterada.
        // Implementado por sugestão do android Studio
    }


    private void metas_Random() { //// Criando  um array  com as imagens utilizadas,
        int[] metas = { // cada imagem será representado por um número inteiro (int)
                R.drawable.primeta, // Chamando as imagens pela pasta de imagens e seus nomes
                R.drawable.secondmeta,
                R.drawable.tercmeta,
                R.drawable.quarmeta,
                R.drawable.quinmeta,
        };



        // Gera um objeto Random (aleatori) para que as imagens passem aleatóriamente
        Random aleatori = new Random();
        int random_metas = aleatori.nextInt(metas.length);

        // Colando para aparecer as imagens (atraves dos números) na ImageView posicionada na tela.
        imgmetas.setImageResource(metas[random_metas]);
    }




    /* Função Tost irá exibir  uma mensagem para o usuário informando o
     usuário para balançar o celular para mudar a meta */

    // Mensagem rápida para o usuário

    private void Aviso_sensor() {
        Toast.makeText(this, "Balance o celular para mudar a Meta", Toast.LENGTH_SHORT).show();
    }
}

