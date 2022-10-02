package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
//import android.content.Intent;

public class encomendas_cheio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encomendas_cheio);
        ImageButton botao_encomenda = (ImageButton) findViewById(R.id.botao_encomenda);
        ImageButton botao_perfil = (ImageButton) findViewById(R.id.botao_perfil);
        ImageButton botao_exemplo_encomenda = (ImageButton) findViewById(R.id.botao_exemplo_encomenda);
        Button botao_duvidas = (Button) findViewById(R.id.botao_duvidas);

        botao_encomenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.activity_encomendas_cheio);
                //Intent i = new Intent(encomendas_cheio.this, usuario_invalido.class);
                //startActivity(i);
            }
        });


        botao_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.activity_perfil);
                //Intent i = new Intent(encomendas_cheio.this, registrar1.class);
                //startActivity(i);
            }
        });

        botao_exemplo_encomenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.activity_digitar_codigo);
                //Intent i = new Intent(encomendas_cheio.this, registrar1.class);
                //startActivity(i);
            }
        });
        botao_duvidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.activity_duvidas);
                //Intent i = new Intent(encomendas_cheio.this, registrar1.class);
                //startActivity(i);
            }
        });

    }
}