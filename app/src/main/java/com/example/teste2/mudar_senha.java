package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
//import android.content.Intent;

public class mudar_senha extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudar_senha);

        Button botao_mudar_senha = (Button) findViewById(R.id.btnEntrar);
        botao_mudar_senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText t1 = (EditText)findViewById(R.id.senha2);
                EditText t2 = (EditText)findViewById(R.id.confirmar_senha2);
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                if (s1.equals(s2))
                {
                    if (s1.length() >= 6)
                    {
                        String status_encomenda = getIntent().getStringExtra("status_encomenda");
                        String email = getIntent().getStringExtra("email");
                        String nome = getIntent().getStringExtra("nome");
                        String cpf = getIntent().getStringExtra("cpf");
                        String cep = getIntent().getStringExtra("cep");
                        String estado = getIntent().getStringExtra("estado");
                        String cidade = getIntent().getStringExtra("cidade");
                        String endereco = getIntent().getStringExtra("endereco");
                        String complemento = getIntent().getStringExtra("complemento");
                        Intent i = new Intent(mudar_senha.this, perfil.class);
                        i.putExtra("status_encomenda", status_encomenda);
                        i.putExtra("email", email);
                        i.putExtra("nome", nome);
                        i.putExtra("cpf", cpf);
                        i.putExtra("senha", s1);
                        i.putExtra("cep", cep);
                        i.putExtra("estado", estado);
                        i.putExtra("cidade", cidade);
                        i.putExtra("endereco", endereco);
                        i.putExtra("complemento", complemento);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "senha muito curta", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "senhas diferentes", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button botao_voltar = (Button) findViewById(R.id.btnEntrar5);
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
                Intent i = new Intent(mudar_senha.this, perfil.class);
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