package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button botao_registrar = (Button) findViewById(R.id.btnRegistrar);
        Button botao_entrar = (Button) findViewById(R.id.btnEntrar);
        botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String status_encomenda = "1";
                String email = getIntent().getStringExtra("email");
                String nome = getIntent().getStringExtra("nome");
                String cpf = getIntent().getStringExtra("cpf");
                String senha = getIntent().getStringExtra("senha");
                String cep = getIntent().getStringExtra("cep");
                String estado = getIntent().getStringExtra("estado");
                String cidade = getIntent().getStringExtra("cidade");
                String endereco = getIntent().getStringExtra("endereco");
                String complemento = getIntent().getStringExtra("complemento");

                /*if(senha.length() >0)
                {
                    if (status_encomenda == "1")
                    {
                        Intent i = new Intent(login.this, encomendas_cheio.class);
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
                    else
                    {
                        Intent i = new Intent(login.this, encomendas_vazio.class);
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
                }

                else
                {
                    Intent i = new Intent(login.this, usuario_invalido.class);
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
                }*/
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
