package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class dados_pessoais extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_pessoais);

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
        TextView texto1 = (TextView) findViewById(R.id.textView1);
        texto1.setText(email);
        TextView texto2 = (TextView) findViewById(R.id.textView13);
        texto2.setText(nome);
        TextView texto3 = (TextView) findViewById(R.id.textView2);
        texto3.setText(cpf);
        TextView texto4 = (TextView) findViewById(R.id.textView3);
        texto4.setText(cep);
        TextView texto5 = (TextView) findViewById(R.id.textView6);
        texto5.setText(estado);
        TextView texto6 = (TextView) findViewById(R.id.textView8);
        texto6.setText(cidade);
        TextView texto7 = (TextView) findViewById(R.id.textView16);
        texto7.setText(endereco);
        TextView texto8 = (TextView) findViewById(R.id.textView15);
        texto8.setText(complemento);

        ImageButton botao_encomendas = (ImageButton) findViewById(R.id.imageButton3);
        botao_encomendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (status_encomenda.equals("1"))
                {
                    Intent i = new Intent(dados_pessoais.this, encomendas_cheio.class);
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
                    Intent i = new Intent(dados_pessoais.this, encomendas_vazio.class);
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
        });

        ImageButton botao_perfil = (ImageButton) findViewById(R.id.imageButton4);
        botao_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(dados_pessoais.this, perfil.class);
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