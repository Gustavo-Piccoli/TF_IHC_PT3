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

public class confirmar_encerrar_operacao extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_encerrar_operacao);
        Button botao_voltar = (Button) findViewById(R.id.btn);
        Button botao_encerrar = (Button) findViewById(R.id.btn3);
        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
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
                Intent i = new Intent(confirmar_encerrar_operacao.this, codigo_valido.class);
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
        botao_encerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                    String status_encomenda = "0";
                    String email = getIntent().getStringExtra("email");
                    String nome = getIntent().getStringExtra("nome");
                    String cpf = getIntent().getStringExtra("cpf");
                    String senha = getIntent().getStringExtra("senha");
                    String cep = getIntent().getStringExtra("cep");
                    String estado = getIntent().getStringExtra("estado");
                    String cidade = getIntent().getStringExtra("cidade");
                    String endereco = getIntent().getStringExtra("endereco");
                    String complemento = getIntent().getStringExtra("complemento");
                    Intent i = new Intent(confirmar_encerrar_operacao.this, encomendas_vazio.class);
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