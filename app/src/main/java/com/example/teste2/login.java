package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//import android.content.Intent;



public class login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Button botao_registrar = (Button) findViewById(R.id.btnRegistrar);
        Button botao_entrar = (Button) findViewById(R.id.btnEntrar);
        botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(login.this, usuario_invalido.class);
                startActivity(i);
            }
        });
        botao_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(login.this, registrar1.class);
                startActivity(i);
            }
        });

    }
}
