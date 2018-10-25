package com.example.patricialeite.novomegaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.media.MediaPlayer;

public class Menu extends AppCompatActivity {

    ImageView btnjogar;
    ImageView btnTutorial;
   static MediaPlayer MediaPlayerJogando;
    static MediaPlayer MediaPlayerBotao;
    static MediaPlayer MediaPlayerAcerto;
    static MediaPlayer MediaPlayerErro;
    static MediaPlayer MediaPlayerRelogio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        MediaPlayerJogando = MediaPlayer.create(Menu.this, R.raw.somjogando);
        MediaPlayerBotao = MediaPlayer.create(Menu.this, R.raw.sombotao);
        MediaPlayerAcerto = MediaPlayer.create(Menu.this, R.raw.somacerto);
        MediaPlayerErro = MediaPlayer.create(Menu.this, R.raw.somerro);
        MediaPlayerRelogio = MediaPlayer.create(Menu.this, R.raw.somrelogio);



        MediaPlayerJogando.start();
        MediaPlayerJogando.setLooping(true);


        btnjogar = (ImageView) findViewById(R.id.btnJogar);
        btnTutorial = (ImageView) findViewById(R.id.btnTutorial);


        btnjogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent acao = new Intent(Menu.this, TelaInicial.class);
                startActivity(acao);
                finish();

                MediaPlayerBotao.start();




            }
        });

        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent acao = new Intent(Menu.this, Tutorial.class);
                startActivity(acao);
                finish();

                MediaPlayerBotao.start();

            }
        });






    }
}
