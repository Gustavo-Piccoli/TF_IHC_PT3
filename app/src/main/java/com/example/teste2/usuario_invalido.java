package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.teste2.R;

public class usuario_invalido extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_invalido);
        Button botao_login = (Button) findViewById(R.id.btn);
        botao_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(usuario_invalido.this, login.class);
                startActivity(i);
            }
        });
    }
}
