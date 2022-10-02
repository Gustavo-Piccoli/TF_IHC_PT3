package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class encomendas_vazio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encomendas_vazio);
        ImageButton botao_perfil = (ImageButton) findViewById(R.id.imageButton4);
        botao_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                Intent i = new Intent(encomendas_vazio.this, perfil.class);
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