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
        String status_encomenda = getIntent().getStringExtra("status_encomenda");
        String email = getIntent().getStringExtra("email");
        String nome = getIntent().getStringExtra("nome");
        String cpf = getIntent().getStringExtra("cpf");
        String senha = getIntent().getStringExtra("senha");
        String cep = getIntent().getStringExtra("cep");
        String estado = getIntent().getStringExtra("estado");
        String cidade = getIntent().getStringExtra("cidade");
        String endereco = getIntent().getStringExtra("endereco");
        String complemento = getIntent().getStringExtra("complemento");

        ImageButton botao_perfil = (ImageButton) findViewById(R.id.imageButton4);
        botao_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(encomendas_cheio.this, perfil.class);
                i.putExtra("status_encomenda", status_encomenda);
                i.putExtra("email", email);
                i.putExtra("nome", nome);
                i.putExtra("cpf", cpf);
                i.putExtra("senha", senha);
                i.putExtra("cep", cep);
                i.putExtra("estado", estado);
                i.putExtra("cidade", cidade);
                i.putExtra("endereco", endereco);
                i.putExtra("complemento", complemento);
                startActivity(i);
            }
        });

        ImageButton botao_exemplo_encomenda = (ImageButton) findViewById(R.id.botao_exemplo_encomenda);
        botao_exemplo_encomenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(encomendas_cheio.this, digitar_codigo.class);
                i.putExtra("status_encomenda", status_encomenda);
                i.putExtra("email", email);
                i.putExtra("nome", nome);
                i.putExtra("cpf", cpf);
                i.putExtra("senha", senha);
                i.putExtra("cep", cep);
                i.putExtra("estado", estado);
                i.putExtra("cidade", cidade);
                i.putExtra("endereco", endereco);
                i.putExtra("complemento", complemento);
                startActivity(i);
            }
        });

        Button botao_duvidas = (Button) findViewById(R.id.botao_duvidas);
        botao_duvidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(encomendas_cheio.this, duvidas.class);
                i.putExtra("status_encomenda", status_encomenda);
                i.putExtra("email", email);
                i.putExtra("nome", nome);
                i.putExtra("cpf", cpf);
                i.putExtra("senha", senha);
                i.putExtra("cep", cep);
                i.putExtra("estado", estado);
                i.putExtra("cidade", cidade);
                i.putExtra("endereco", endereco);
                i.putExtra("complemento", complemento);
                startActivity(i);
            }
        });

    }
}