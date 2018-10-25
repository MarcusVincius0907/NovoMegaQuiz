package com.example.patricialeite.novomegaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tutorial extends AppCompatActivity {

    ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);


        btnVoltar = (ImageView) findViewById(R.id.btnVoltarTutorial);


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent acao = new Intent(Tutorial.this, Menu.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerJogando.pause();

                Menu.MediaPlayerBotao.start();

            }
        });

    }
}
