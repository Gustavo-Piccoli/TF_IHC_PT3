package com.example.teste2;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class registrar1 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar1);
        Button botao_entrar = (Button) findViewById(R.id.btnEntrar);
        botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText t1 = (EditText)findViewById(R.id.email);
                EditText t2 = (EditText)findViewById(R.id.nome);
                EditText t3 = (EditText)findViewById(R.id.cpf);
                EditText t4 = (EditText)findViewById(R.id.senha);
                EditText t5 = (EditText)findViewById(R.id.confirmar_senha);
                String email = t1.getText().toString();
                String nome = t2.getText().toString();
                String cpf = t3.getText().toString();
                String senha = t4.getText().toString();
                String confirmar_senha = t5.getText().toString();
                int l1 = email.length();
                int l2 = nome.length();
                int l3 = cpf.length();
                int l4 = senha.length();
                int l5 = confirmar_senha.length();
                if ((l1 > 0) && (l2 > 0) && (l3 >= 11) && (l4 >= 6) && (l5 >= 6))
                {
                    if (senha.equals(confirmar_senha))
                    {
                        Intent i = new Intent(registrar1.this, registrar2.class);
                        i.putExtra("email", email);
                        i.putExtra("nome", nome);
                        i.putExtra("cpf", cpf);
                        i.putExtra("senha", senha);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "senhas diferentes", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "preencher todas as caixas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
