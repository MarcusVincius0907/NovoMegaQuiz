package com.example.patricialeite.novomegaquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaInicial extends AppCompatActivity {


    ImageView btnBio;
    ImageView btnQui;
    ImageView btnGeo;
    ImageView btnLit;
    ImageView btnHis;
    ImageView btnIng;
    ImageView btnEsp;
    ImageView btnFisica;
    ImageView btnMatematica;
    ImageView btnFilo;
    ImageView btnComoJogar;
    ImageView btnVoltar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        btnBio = (ImageView) findViewById(R.id.btnBiologia);
        btnGeo = (ImageView) findViewById(R.id.btnGeografia);
        btnHis = (ImageView) findViewById(R.id.btnHistoria);
        btnQui = (ImageView) findViewById(R.id.btnQuimica);
        btnLit = (ImageView) findViewById(R.id.btnLiteratura);
        btnIng = (ImageView) findViewById(R.id.btnIngles);
        btnEsp = (ImageView) findViewById(R.id.btnEspanhol);
        btnFilo = (ImageView) findViewById(R.id.btnFilosofia);
        btnFisica = (ImageView) findViewById(R.id.btnFisica);
        btnMatematica = (ImageView) findViewById(R.id.btnMatematica);
        btnVoltar = (ImageView) findViewById(R.id.btnVoltar);
        btnComoJogar = (ImageView) findViewById(R.id.btnComoJogar);


        Menu.MediaPlayerRelogio.stop();



        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent acao = new Intent(TelaInicial.this, Menu.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerJogando.pause();

                Menu.MediaPlayerBotao.start();

            }
        });

        btnFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Botao.adicionaFisica();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();



            }
        });

        btnMatematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Botao.adicionaMatematica();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();


                Menu.MediaPlayerBotao.start();


            }
        });

        btnBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Botao.adicionaBiologia();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();


                Menu.MediaPlayerBotao.start();


            }
        });

        btnGeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Botao.adicionaGeografia();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();


                Menu.MediaPlayerBotao.start();
            }
        });

        btnLit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Botao.adicionaLiteratura();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();


            }
        });

        btnQui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Botao.adicionaQuimica();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();


            }
        });

        btnHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Botao.adicionaHistoria();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();


            }
        });

        btnIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Botao.adicionaIngles();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();


            }
        });

        btnEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Botao.adicionaEspanhol();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();

            }
        });

        btnFilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Botao.adicionaFilosofia();
                Intent acao = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();


            }
        });

        btnComoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent acao = new Intent(TelaInicial.this, ComoJogar.class);
                startActivity(acao);
                finish();

                Menu.MediaPlayerBotao.start();


            }
        });



    }
}
