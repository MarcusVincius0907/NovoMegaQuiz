package com.example.patricialeite.novomegaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ComoJogar extends AppCompatActivity {

    ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_jogar);


        btnVoltar = (ImageView) findViewById(R.id.btnVoltarComo);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent acao = new Intent(ComoJogar.this, TelaInicial.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();


            }
        });


    }
}
