package com.example.teste2;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class registrar2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar2);
        Button botao_entrar = (Button) findViewById(R.id.btnEntrar);
        botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText t1 = (EditText)findViewById(R.id.cep);
                EditText t2 = (EditText)findViewById(R.id.estado);
                EditText t3 = (EditText)findViewById(R.id.cidade);
                EditText t4 = (EditText)findViewById(R.id.endereco);
                EditText t5 = (EditText)findViewById(R.id.complemento);
                String cep = t1.getText().toString();
                String estado = t2.getText().toString();
                String cidade = t3.getText().toString();
                String endereco = t4.getText().toString();
                String complemento = t5.getText().toString();

                if ((cep.length() >= 8) && (estado.length() == 2) && (cidade.length() > 0) && (endereco.length() > 0))
                {
                    if (estado.equals("AC") || estado.equals("AL") || estado.equals("AP") ||
                        estado.equals("AM") || estado.equals("BA") || estado.equals("CE") ||
                        estado.equals("DF") || estado.equals("ES") || estado.equals("GO") ||
                        estado.equals("MA") || estado.equals("MT") || estado.equals("MS") ||
                        estado.equals("MG") || estado.equals("PA") || estado.equals("PB") ||
                        estado.equals("PR") || estado.equals("PE") || estado.equals("PI") ||
                        estado.equals("RJ") || estado.equals("RN") || estado.equals("RS") ||
                        estado.equals("RO") || estado.equals("RR") || estado.equals("SC") ||
                        estado.equals("SP") || estado.equals("SE") || estado.equals("TO"))
                    {
                        Intent i = new Intent(registrar2.this, encomendas_cheio.class);

                        String email = getIntent().getStringExtra("email");
                        String nome = getIntent().getStringExtra("nome");
                        String cpf = getIntent().getStringExtra("cpf");
                        String senha = getIntent().getStringExtra("senha");
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
                        Toast.makeText(getApplicationContext(), "estado inválido", Toast.LENGTH_SHORT).show();
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
