package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;


public class tela_inicial extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        //new CountDownTimer(3000,1000)

        new CountDownTimer(0000,1000)//APAGAR
        {
            @Override
            public void onTick(long millisUntilFinished){}
            @Override
            public void onFinish()
            {
                //String status_encomenda = "1";
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

                Intent i = new Intent(tela_inicial.this, login.class);
                //MUDAR PARA XX PARA LOGIN

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
        }.start();
    }
}