package com.example.teste2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
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
                Intent i = new Intent(MainActivity.this, registrar2.class);
                startActivity(i);
            }
        }.start();
    }
}