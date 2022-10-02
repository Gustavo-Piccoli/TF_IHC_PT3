package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class codigo_valido extends AppCompatActivity {
    int status_porta = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_valido);
        Button botao_abrir = (Button) findViewById(R.id.btn);
        Button botao_fechar = (Button) findViewById(R.id.btn2);
        Button botao_encerrar = (Button) findViewById(R.id.btn3);


        botao_abrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                status_porta = 1;
                Toast.makeText(getApplicationContext(), "A porta foi aberta", Toast.LENGTH_SHORT).show();

            }
        });
        botao_fechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                status_porta = 0;
                Toast.makeText(getApplicationContext(), "A porta foi fechada", Toast.LENGTH_SHORT).show();
            }
        });
        botao_encerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(status_porta == 1)
                {
                    Toast.makeText(getApplicationContext(), "A porta está aberta. Feche-a para continuar", Toast.LENGTH_SHORT).show();
                }
                else
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
                    Intent i = new Intent(codigo_valido.this, confirmar_encerrar_operacao.class);
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
    }
}