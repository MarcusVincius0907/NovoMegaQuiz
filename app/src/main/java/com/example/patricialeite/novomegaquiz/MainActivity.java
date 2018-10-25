package com.example.patricialeite.novomegaquiz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public int counter = 600;

    TextView crn;
    TextView moedas;
    TextView dica1;
    TextView dica2;
    TextView dica3;
    TextView dica4;
    TextView dica5;
    TextView cat;
    TextView numeroQ;
    ImageView btnDicas;
    ImageView btnValidar;
    ImageView btnAudio;
    ImageView btnVoltarMenu;
    ImageView imgCrn;
    ImageView imgMoeda;
    ImageView imgQuestao;
    ImageView imgCategoria;



    EditText respostas;
    View fundo;

    String wordList[] = new String[100];

    //region respostas
    String resposta1 = "";
    String resposta2 = "";
    String resposta3 = "";
    String resposta4 = "";
    String resposta5 = "";
    String resposta6 = "";
    String resposta7 = "";
    String resposta8 = "";
    String resposta9 = "";
    String resposta10 = "";
    String resposta11 = "";
    String resposta12 = "";
    String resposta13 = "";
    String resposta14 = "";
    String resposta15 = "";
    String resposta16 = "";
    String resposta17 = "";
    String resposta18 = "";
    String resposta19 = "";
    String resposta20 = "";
    //endregion

    //region categorias
    String categoria1 = "";
    String categoria2 = "";
    String categoria3 = "";
    String categoria4 = "";
    String categoria5 = "";
    String categoria6 = "";
    String categoria7 = "";
    String categoria8 = "";
    String categoria9 = "";
    String categoria10 = "";
    String categoria11 = "";
    String categoria12 = "";
    String categoria13 = "";
    String categoria14 = "";
    String categoria15 = "";
    String categoria16 = "";
    String categoria17 = "";
    String categoria18 = "";
    String categoria19 = "";
    String categoria20 = "";
    //endregion








    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DiminuiDicas.numeroDicas = 4;
        DiminuiMoedas.numeroMoedas = 10;
        Botao.acerto = 0;
        DiminuiMoedas.questaos = 0;


        numeroQ = (TextView) findViewById(R.id.numeroQ);
        crn = (TextView) findViewById(R.id.crn);
        dica1 = (TextView) findViewById(R.id.dica1);
        dica2 = (TextView) findViewById(R.id.dica2);
        dica3 = (TextView) findViewById(R.id.dica3);
        dica4 = (TextView) findViewById(R.id.dica4);
        dica5 = (TextView) findViewById(R.id.dica5);
        cat = (TextView) findViewById(R.id.Cat);
        moedas = (TextView) findViewById(R.id.moeda);
        btnDicas = (ImageView) findViewById(R.id.btnDica);
        btnValidar = (ImageView) findViewById(R.id.btnValidar);
        btnAudio = (ImageView) findViewById(R.id.btnAudio);
        btnVoltarMenu = (ImageView) findViewById(R.id.btnVoltarMain);
        imgCategoria = (ImageView) findViewById(R.id.imgCategoria);
        imgCrn = (ImageView) findViewById(R.id.imgCrn);
        imgMoeda = (ImageView) findViewById(R.id.imgMoeda);
        imgQuestao = (ImageView) findViewById(R.id.imgQuestao);

        respostas = (EditText) findViewById(R.id.resposta);
        fundo = (View) findViewById(R.id.fundo);



        dica2.setVisibility(View.INVISIBLE);
        dica3.setVisibility(View.INVISIBLE);
        dica4.setVisibility(View.INVISIBLE);
        dica5.setVisibility(View.INVISIBLE);

        Menu.MediaPlayerRelogio.start();
        Menu.MediaPlayerRelogio.setLooping(true);




        //region wordlist


        wordList[0] = "";
        wordList[1] = "";
        wordList[2] = "";
        wordList[3] = "";
        wordList[4] = "";
        wordList[5] = "";
        wordList[6] = "";
        wordList[7] = "";
        wordList[8] = "";
        wordList[9] = "";
        wordList[10] = "";
        wordList[11] = "";
        wordList[12] = "";
        wordList[13] = "";
        wordList[14] = "";
        wordList[15] = "";
        wordList[16] = "";
        wordList[17] = "";
        wordList[18] = "";
        wordList[19] = "";
        wordList[20] = "";
        wordList[21] = "";
        wordList[22] = "";
        wordList[23] = "";
        wordList[24] = "";
        wordList[25] = "";
        wordList[26] = "";
        wordList[27] = "";
        wordList[28] = "";
        wordList[29] = "";
        wordList[30] = "";
        wordList[31] = "";
        wordList[32] = "";
        wordList[33] = "";
        wordList[34] = "";
        wordList[35] = "";
        wordList[36] = "";
        wordList[37] = "";
        wordList[38] = "";
        wordList[39] = "";
        wordList[40] = "";
        wordList[41] = "";
        wordList[42] = "";
        wordList[43] = "";
        wordList[44] = "";
        wordList[45] = "";
        wordList[46] = "";
        wordList[47] = "";
        wordList[48] = "";
        wordList[49] = "";
        wordList[50] = "";
        wordList[51] = "";
        wordList[52] = "";
        wordList[53] = "";
        wordList[54] = "";
        wordList[55] = "";
        wordList[56] = "";
        wordList[57] = "";
        wordList[58] = "";
        wordList[59] = "";
        wordList[60] = "";
        wordList[61] = "";
        wordList[62] = "";
        wordList[63] = "";
        wordList[64] = "";
        wordList[65] = "";
        wordList[66] = "";
        wordList[67] = "";
        wordList[68] = "";
        wordList[69] = "";
        wordList[70] = "";
        wordList[71] = "";
        wordList[72] = "";
        wordList[73] = "";
        wordList[74] = "";
        wordList[75] = "";
        wordList[76] = "";
        wordList[77] = "";
        wordList[78] = "";
        wordList[79] = "";
        wordList[80] = "";
        wordList[81] = "";
        wordList[82] = "";
        wordList[83] = "";
        wordList[84] = "";
        wordList[85] = "";
        wordList[86] = "";
        wordList[87] = "";
        wordList[88] = "";
        wordList[89] = "";
        wordList[90] = "";
        wordList[91] = "";
        wordList[92] = "";
        wordList[93] = "";
        wordList[94] = "";
        wordList[95] = "";
        wordList[96] = "";
        wordList[97] = "";
        wordList[98] = "";
        wordList[99] = "";

        //endregion





        if (Botao.botaoClasse == 1) {

            //revisado - falta ler todas







            //region respostas biologia

            resposta1 = "Reino Plantae";
            resposta2 = "Briófitas";
            resposta3 = "Pteridófitas";
            resposta4 = "Gimnospermas";
            resposta5 = "Angiospermas";
            resposta6 = "Reino Monera";
            resposta7 = "Bactérias";
            resposta8 = "Cianobactérias";
            resposta9 = "Reino Animália";
            resposta10 = "Mamíferos";
            resposta11 = "Peixes";
            resposta12 = "Anfíbios";
            resposta13 = "Répteis";
            resposta14 = "Aves";
            resposta15 = "Reino Fungi";
            resposta16 = "Cérebro";
            resposta17 = "Estômago";
            resposta18 = "Intestinos";
            resposta19 = "Tímpano";
            resposta20 = "íris";

            //endregion

            //region palavras bio


            //1 de biologia Reino Plantae
            wordList[0] = "Eucariontes";
            wordList[1] = "Autotróficas";
            wordList[2] = "Clorofila";
            wordList[3] = "Pólen";
            wordList[4] = "Plantas";
            //2 de biologia Briofitas
            wordList[5] = "Vegetação";
            wordList[6] = "Musgos";
            wordList[7] = "Avasculares";
            wordList[8] = "Pequenas";
            wordList[9] = "Dioicas";
            //3 de biologia Pteridófitas
            wordList[10] = "Vasculares";
            wordList[11] = "Raiz, caule e folhas";
            wordList[12] = "Traqueófitas";
            wordList[13] = "Criptógamas";
            wordList[14] = "Samambaias";
            //4 de biologia Gimnospermas
            wordList[15] = "Sem frutos";
            wordList[16] = "Espermatófitos";
            wordList[17] = "Pólen";
            wordList[18] = "Resistentes ao frio";
            wordList[19] = "Coníferas";
            //5 de biologia Angiospermas
            wordList[20] = "Flores";
            wordList[21] = "Frutos";
            wordList[22] = "Monotiledôneas";
            wordList[23] = "Dicotiledôneas";
            wordList[24] = "Ipê";
            //6 de biologia Reino monera
            wordList[25] = "Procariontes";
            wordList[26] = "Unicelulares";
            wordList[27] = "Microscópicas";
            wordList[28] = "Autotróficas";
            wordList[29] = "Bactéria";
            //7 de biologia Bactérias
            wordList[30] = "Flagelo";
            wordList[31] = "Diferentes formas";
            wordList[32] = "Resistente";
            wordList[33] = "Cílios";
            wordList[34] = "Bacilos";
            //8 de biologia Cianobactérias
            wordList[35] = "Assexuada";
            wordList[36] = "horgônios";
            wordList[37] = "Sem Cloroplastos";
            wordList[38] = "Unicelulares";
            wordList[39] = "Autotróficas";
            //9 de biologia Reino Animalia
            wordList[40] = "multicelulares";
            wordList[41] = "Invertebrados";
            wordList[42] = "Vertebrados";
            wordList[43] = "Locomove";
            wordList[44] = "Animal";
            //10 de biologia Mamífero
            wordList[45] = "Vertebrados";
            wordList[46] = "Dentes";
            wordList[47] = "Pelos ";
            wordList[48] = "Leite";
            wordList[49] = "Ser humano";
            //11 de biologia Peixes
            wordList[50] = "Vertebrados";
            wordList[51] = "Respiração Branquial";
            wordList[52] = "Escamas";
            wordList[53] = "Pecilotérmicos";
            wordList[54] = "Cardume";
            //12 de biologia Anfíbios
            wordList[55] = "Respiração branquial";
            wordList[56] = "Metamorfose";
            wordList[57] = "Respiração pulmonar";
            wordList[58] = "Girinos";
            wordList[59] = "Sapos";
            //13 de biologia Répteis
            wordList[60] = "Respiração pulmonar";
            wordList[61] = "Carapaça";
            wordList[62] = "Ovíparos";
            wordList[63] = "Ambiente seco ou aquático";
            wordList[64] = "Crocodilos";
            //14 de biologia Aves
            wordList[65] = "Homeotérmicas";
            wordList[66] = "Bico";
            wordList[67] = "Penas";
            wordList[68] = "Asas";
            wordList[69] = "Galinha";
            //15 de biologia Fungi
            wordList[70] = "Eucariontes";
            wordList[71] = "Uni ou pluricelulares";
            wordList[72] = "Heterótrofos";
            wordList[73] = "Decompositores";
            wordList[74] = "Fungos";
            //16 de biologia Cérebro
            wordList[75] = "Cinza-rósea";
            wordList[76] = "Compreensão verbal";
            wordList[77] = "Pulsos elétricos";
            wordList[78] = " Neurônios ";
            wordList[79] = " Córtex cerebral ";
            //17 de biologia Estômago
            wordList[80] = "Digestão";
            wordList[81] = "Bolsa";
            wordList[82] = "Parede musculosa";
            wordList[83] = "Suco gástrico";
            wordList[84] = "Desintegração";
            //18 de biologia Intestinos
            wordList[85] = "Absorção";
            wordList[86] = "Paredes musculares";
            wordList[87] = "Fase final";
            wordList[88] = "Grosso";
            wordList[89] = "Delgado ";
            //19 de biologia Tímpano
            wordList[90] = "Vibra";
            wordList[91] = "Onda sonora";
            wordList[92] = "Audição";
            wordList[93] = "Músculo";
            wordList[94] = "Ouvido";
            //20 de biologia Íris
            wordList[95] = "Circular";
            wordList[96] = "Pupila";
            wordList[97] = "Contrai";
            wordList[98] = "Cor";
            wordList[99] = "Globo ocular ";

//endregion

            //region categoria bio

            categoria1 = "Reino";
            categoria2 = "Espécie";
            categoria3 = "Espécie";
            categoria4 = "Espécie";
            categoria5 = "Espécie";
            categoria6 = "Reino";
            categoria7 = "Espécie";
            categoria8 = "Espécie";
            categoria9 = "Reino";
            categoria10 = "Espécie";
            categoria11 = "Espécie";
            categoria12 = "Espécie";
            categoria13 = "Espécie";
            categoria14 = "Espécie";
            categoria15 = "Reino";
            categoria16 = "Orgão";
            categoria17 = "Orgão";
            categoria18 = "Orgão";
            categoria19 = "Orgão";
            categoria20 = "Orgão";

            //endregion

            cat.setText(String.valueOf(categoria1));

            dica1.setText(wordList[0]);


        } else if (Botao.botaoClasse == 2) {





            //region categoria quimica
            categoria1 = "teste";
            categoria2 = "Pessoa";
            categoria3 = "Pessoa";
            categoria4 = "Pessoa";
            categoria5 ="Pessoa";
            categoria6 = "Pessoa";
            categoria7 = "Pessoa";
            categoria8 = "lemento Quimico";
            categoria9 = "Elemento Quimico";
            categoria10 = "Elemento Quimico";
            categoria11 = "Elemento Quimico";
            categoria12 = "Elemento Quimico";
            categoria13 = "Fenômeno";
            categoria14 = "Fenômeno";
            categoria15 = "Fenômeno";
            categoria16 = "Fenômeno";
            categoria17 = "Fenômeno";
            categoria18 = "Fenômeno";
            categoria19 = "Pessoa";
            categoria20 = "Pessoa";

            //endregion

            //region respostas quimica
            resposta1 = "Dalton";
            resposta2 = "Thomson";
            resposta3 = "Goldstein";
            resposta4 = "Rutherford";
            resposta5 = "Chadwick";
            resposta6 = "Bohr";
            resposta7 = "Mendeleiev";
            resposta8 = "Hidrogênio";
            resposta9 = "Hélio";
            resposta10 = "Carbono";
            resposta11 = "Ferro";
            resposta12 = "Alumínio";
            resposta13 = "Fenômenos químicos";
            resposta14 = "Fotossíntese";
            resposta15 = "Decomposição";
            resposta16 = "Combustão";
            resposta17 = "Ferrugem";
            resposta18 = "Respiração";
            resposta19 = "Lavoisier";
            resposta20 = "Proust";

            //endregion

            //region palavras quimica

            //1 de quimica
            wordList[0] = "Britânico";
            wordList[1] = "Bola de Bilhar";
            wordList[2] = "1808";
            wordList[3] = "Indivisível";
            wordList[4] = "indestrutível";
            //2 de quimica
            wordList[5] = "Britânico";
            wordList[6] = "Elétrons";
            wordList[7] = "1904";
            wordList[8] = "divisíveis";
            wordList[9] = "Pudim de passas";
            //3 de quimica
            wordList[10] = "Alemão";
            wordList[11] = "Prótons";
            wordList[12] = "Neutralidade";
            wordList[13] = "1900";
            wordList[14] = "Raio X";
            //4 de quimica
            wordList[15] = "Neozelandês";
            wordList[16] = "Núcleo";
            wordList[17] = "Eletrosfera";
            wordList[18] = "1911";
            wordList[19] = "Pai da física nuclear";
            //5 de quimica
            wordList[20] = "Britânico";
            wordList[21] = "Nêutrons";
            wordList[22] = "1932";
            wordList[23] = "Projeto Manhattan";
            wordList[24] = "Raios gama";
            //6 de quimica
            wordList[25] = "Dinamarquês";
            wordList[26] = "Estrutura atômico";
            wordList[27] = "1940";
            wordList[28] = "Teoria quântica";
            wordList[29] = "Orbita";
            //7 de quimica
            wordList[30] = "Russo";
            wordList[31] = "Químico";
            wordList[32] = "Elementos";
            wordList[33] = "Propriedades";
            wordList[34] = "Tabela periódica ";
            //8 de quimica
            wordList[35] = "Não metal";
            wordList[36] = "Gás";
            wordList[37] = "Incolor";
            wordList[38] = "Inodoro";
            wordList[39] = "Símbolo H";
            //9 de quimica
            wordList[40] = "Não metal";
            wordList[41] = "Gás nobre";
            wordList[42] = "Inerte";
            wordList[43] = "Incolor";
            wordList[44] = "Símbolo He";
            //10 de quimica
            wordList[45] = "Não metal";
            wordList[46] = "Tetravalente";
            wordList[47] = "Grupo 14";
            wordList[48] = "N° atômico 12";
            wordList[49] = "Símbolo C";
            //11 de quimica
            wordList[50] = "Metal";
            wordList[51] = "Minério";
            wordList[52] = "Grupo 8 ";
            wordList[53] = "Prateado";
            wordList[54] = "Símbolo Fe";
            //12 de quimica
            wordList[55] = "Metal";
            wordList[56] = "Leve";
            wordList[57] = "Impermeável";
            wordList[58] = "Reciclável";
            wordList[59] = "Símbolo Al";
            //13 de quimica
            wordList[60] = "Irreversíveis";
            wordList[61] = "Combustão";
            wordList[62] = "Mudança de coloração";
            wordList[63] = "Novas substancias";
            wordList[64] = "Fenômeno";
            //14 de quimica
            wordList[65] = "Sol";
            wordList[66] = "Energia";
            wordList[67] = "Plantas";
            wordList[68] = "Gás carbono";
            wordList[69] = "Gás oxigênio";
            //15 de quimica
            wordList[70] = "Degradação";
            wordList[71] = "Matéria";
            wordList[72] = "Fungos";
            wordList[73] = "Bactérias";
            wordList[74] = "Ciclo Bioquímico";
            //16 de quimica
            wordList[75] = "Exotérmica";
            wordList[76] = "Combustível";
            wordList[77] = "Oxirredução";
            wordList[78] = "CO2";
            wordList[79] = "Queima";
            //17 de quimica
            wordList[80] = "Oxirredução";
            wordList[81] = "Mudança de cor";
            wordList[82] = "Ferro";
            wordList[83] = "Degradação";
            wordList[84] = "Devido o oxigênio ";
            //18 de quimica
            wordList[85] = "Fundamental";
            wordList[86] = "Oxigênio";
            wordList[87] = "Filtra";
            wordList[88] = "Hematose";
            wordList[89] = "CO2";
            //19 de quimica
            wordList[90] = "Francês";
            wordList[91] = "1785";
            wordList[92] = "Nada se cria";
            wordList[93] = "Conservação da massa";
            wordList[94] = "Lei de Lavoisier";
            //20 de quimica
            wordList[95] = "Francês";
            wordList[96] = "1801";
            wordList[97] = "Leis Ponderais";
            wordList[98] = "Massas das substâncias";
            wordList[99] = "Leis das Proporções constantes";

            //endregion

            cat.setText(String.valueOf(categoria1));

            dica1.setText(wordList[0]);


        } else if (Botao.botaoClasse == 3) {

            //region categoria historia

            categoria1 = "Pessoa";
            categoria2 = "Pessoa";
            categoria3 = "Evento";
            categoria4 = "Evento";
            categoria5 = "Eventos";
            categoria6 = "Religião";
            categoria7 = "Evento";
            categoria8 = "Evento";
            categoria9 = "Movimento Intelectual";
            categoria10 = "Evento";
            categoria11 = "Evento";
            categoria12 = "Território";
            categoria13 = "Mito";
            categoria14 = "Ser Mitológico";
            categoria15 = "Período";
            categoria16 = "Território";
            categoria17 = "Regime político";
            categoria18 = "Período";
            categoria19 = "Período";
            categoria20 = "Período";

            //endregion

            //region palavras historia

            //1 de Hist
            wordList[0] = "Segunda Guerra Mundial";
            wordList[1] = "Holocausto";
            wordList[2] = "Nazista";
            wordList[3] = "Líder";
            wordList[4] = "Austríaco";
            //2 de hist
            wordList[5] = " Líder";
            wordList[6] = "Bloqueio Continental";
            wordList[7] = "Francês";
            wordList[8] = "Guerras Napoleônicas";
            wordList[9] = "Governo dos cem dias";
            //3 de Hist
            wordList[10] = "Potências Militares";
            wordList[11] = "Tríplices";
            wordList[12] = "Armas";
            wordList[13] = "Expansionismo";
            wordList[14] = "Conflito Global";
            //4 de hist
            wordList[15] = "Disputas Estratégicas";
            wordList[16] = "Estados Unidos";
            wordList[17] = "União Soviética";
            wordList[18] = "Conflito";
            wordList[19] = "Fria";
            //5 de Hist
            wordList[20] = "Armas";
            wordList[21] = "Poder Militar";
            wordList[22] = "Estratégia de Dominação";
            wordList[23] = "Proteção";
            wordList[24] = "Fabricação";
            //6 de hist
            wordList[25] = "Arte";
            wordList[26] = "Tradição";
            wordList[27] = "Religiosa";
            wordList[28] = "Árabes";
            wordList[29] = "Espiritual";
            //7 de Hist
            wordList[30] = "Migração Forçada";
            wordList[31] = "Comércio";
            wordList[32] = "Oceano Atlântico";
            wordList[33] = "Escravos";
            wordList[34] = "Africanos";
            //8 de hist
            wordList[35] = "Guerra Civil";
            wordList[36] = "Burguesia";
            wordList[37] = "Parlamento";
            wordList[38] = "Unificação";
            wordList[39] = "Conflito interno";
            //9 de Hist
            wordList[40] = "Movimento Intelectual";
            wordList[41] = "Conhecimento Racional";
            wordList[42] = "Filósofos";
            wordList[43] = "Visão Teocêntrica";
            wordList[44] = "Luzes";
            //10 de hist
            wordList[45] = "Movimento";
            wordList[46] = "Protesto";
            wordList[47] = "Conflitos Políticos";
            wordList[48] = "Revolução Religiosa";
            wordList[49] = "Contrarreforma";
            //11 de Hist
            wordList[50] = " Conflito Armado";
            wordList[51] = "Americanos";
            wordList[52] = "Crise Monárquica";
            wordList[53] = "Treze Colônias";
            wordList[54] = " Atividades Comerciais ";
            //12 de hist
            wordList[55] = "Civilização da Antiguidade";
            wordList[56] = "Papiros";
            wordList[57] = "Dinastias";
            wordList[58] = "Pirâmides";
            wordList[59] = "Rio Nilo";
            //13 de Hist
            wordList[60] = "Teogonia";
            wordList[61] = "Grécia";
            wordList[62] = "Politeísta";
            wordList[63] = "Olimpo";
            wordList[64] = "Deuses";
            //14 de hist
            wordList[65] = "Rei";
            wordList[66] = "Trovão";
            wordList[67] = "Deus";
            wordList[68] = "Criado em Creta";
            wordList[69] = "Monte Olimpo";
            //15 de Hist
            wordList[70] = "Invasões Bárbaras";
            wordList[71] = "Sistema Feudal";
            wordList[72] = "Comércio";
            wordList[73] = "Oito Cruzadas";
            wordList[74] = "Mar Mediterrâneo";
            //16 de hist
            wordList[75] = "Neocolonialismo";
            wordList[76] = "Continente";
            wordList[77] = "Explorada";
            wordList[78] = "Recursos naturais";
            wordList[79] = "Matérias-Primas";
            //17 de Hist
            wordList[70] = "Conduta Política";
            wordList[71] = "Nacionalismo";
            wordList[72] = "Militarização";
            wordList[73] = "Democracia";
            wordList[74] = "Estado Forte";
            //18 de hist
            wordList[85] = "Governo Autoritário";
            wordList[86] = "Poder Político";
            wordList[87] = "Partido Único";
            wordList[88] = "Influência Dominante";
            wordList[89] = "Militares";
            //19 de Hist
            wordList[90] = "Expedição";
            wordList[91] = "Território Brasileiro";
            wordList[92] = "Período Colonial";
            wordList[93] = "Exploração";
            wordList[94] = " Pau-Brasil";
            //20 de hist
            wordList[95] = "Constituição";
            wordList[96] = "Governo";
            wordList[97] = "Revoltas Regionais";
            wordList[98] = "Oposições Políticas ";
            wordList[99] = "Reino";

            //endregion

            //region respostas hist

             resposta1 = "Hitler";
             resposta2 = "Bonaparte";
             resposta3 = "Segunda Guerra Mundial";
             resposta4 = "Guerra Fria";
             resposta5 = "Corrida Armamentista";
             resposta6 = "Islamismo";
             resposta7 = "Tráfico Negreiro";
             resposta8 = "Revolução Inglesa";
             resposta9 = "Iluminismo";
             resposta10 = "Reforma Protestante";
             resposta11 = "Estados Unidos";
             resposta12 = "Egito";
             resposta13 = "Mitologia Grega";
             resposta14 = "Zeus";
             resposta15 = "Baixa Idade Média";
             resposta16 = "áfrica";
             resposta17 = "Fascismo";
             resposta18 = "Regime Militar";
             resposta19 = "Brasil Colônia";
             resposta20 = "Primeiro Reinado";

            //endregion

            dica1.setText(wordList[0]);

            cat.setText(String.valueOf(categoria1));




        } else if (Botao.botaoClasse == 4) {


            //revisado - falta ler todas


            //region categoria geo

            categoria1 = "Objeto";
            categoria2 = "Ciência";
            categoria3 = "Ciência";
            categoria4 = "Ciência";
            categoria5 ="Grupo";
            categoria6 = "Processo";
            categoria7 = "Modernização";
            categoria8 = "Estrela";
            categoria9 = "Atividade";
            categoria10 = "Índice";
            categoria11 = "Fontes";
            categoria12 = "Fontes";
            categoria13 = "Organização";
            categoria14 = "Transporte";
            categoria15 = "Objeto";
            categoria16 = "Organização";
            categoria17 = "Organização";
            categoria18 = "Civilização";
            categoria19 = "Índice";
            categoria20 = "Descrição";

            //endregion

            //region palavras geografia

            //1 de geo
            wordList[0] = "Visual";
            wordList[1] = "Representação";
            wordList[2] = "Projeção";
            wordList[3] = "Espaço";
            wordList[4] = "Superfície plana";
            //2 de geo
            wordList[5] = "Ciência";
            wordList[6] = "Fenômenos";
            wordList[7] = "Céu";
            wordList[8] = "Cósmico";
            wordList[9] = "Corpos Celestes";
            //3 de geo
            wordList[10] = "Superfície";
            wordList[11] = "mantos";
            wordList[12] = "Formação";
            wordList[13] = "Rochosa";
            wordList[14] = "Estudo da crosta ";
            //4 de geo
            wordList[15] = "Oceanos";
            wordList[16] = "Grandes Extensões";
            wordList[17] = "Geleiras";
            wordList[18] = "Bacias";
            wordList[19] = "Estudo das águas";
            //5 de geo
            wordList[20] = "Grupo";
            wordList[21] = "Relacionamento";
            wordList[22] = "Convivência";
            wordList[23] = "Mundial";
            wordList[24] = "Pessoas";
            //6 de geo
            wordList[25] = "Cidades";
            wordList[26] = "Crescimento";
            wordList[27] = "População";
            wordList[28] = "Extensão Territorial";
            wordList[29] = "Êxodo rural.";
            //7 de geo
            wordList[30] = "Revoluções ";
            wordList[31] = "Economia";
            wordList[32] = "Riquezas";
            wordList[33] = "Processo Histórico";
            wordList[34] = "Indústria";
            //8 de geo
            wordList[35] = "Órbita";
            wordList[36] = "Esférico";
            wordList[37] = "Gravidade";
            wordList[38] = "Rochoso";
            wordList[39] = "Corpo Celeste";
            //9 de geo
            wordList[40] = "Propriedade";
            wordList[41] = "Produção";
            wordList[42] = "Solo";
            wordList[43] = "Terras Rurais";
            wordList[44] = "Técnicas Agrícolas";
            //10 de geo
            wordList[45] = "Consumo";
            wordList[46] = "Bens";
            wordList[47] = "Serviços";
            wordList[48] = "Produção";
            wordList[49] = "Riquezas do país";
            //11 de geo
            wordList[50] = "Luz";
            wordList[51] = "Sustentável";
            wordList[52] = "Autonomia";
            wordList[53] = "Sol";
            wordList[54] = "Energia";
            //12 de geo
            wordList[55] = "Vento";
            wordList[56] = "Transformação";
            wordList[57] = "Cinética";
            wordList[58] = "Gerador";
            wordList[59] = "Energia";
            //13 de geo
            wordList[60] = "Pós-Guerra";
            wordList[61] = "Segurança";
            wordList[62] = "Paz";
            wordList[63] = "Países";
            wordList[64] = "Órgão Internacional ";
            //14 de geo
            wordList[65] = "Trêm";
            wordList[66] = "Navio";
            wordList[67] = "Carro";
            wordList[68] = "Caldeira";
            wordList[69] = "Carvão";
            //15 de geo
            wordList[70] = "Pólos";
            wordList[71] = "Navegação";
            wordList[72] = "Orientação";
            wordList[73] = "Instrumento";
            wordList[74] = "Magnético";
            //16 de geo
            wordList[75] = "Agência";
            wordList[76] = "Trabalho";
            wordList[77] = "Nações Unidas";
            wordList[78] = "Normas";
            wordList[79] = "Direitos";
            //17 de geo
            wordList[80] = "Organização";
            wordList[81] = "Sistema";
            wordList[82] = "Conferência";
            wordList[83] = "Global";
            wordList[84] = "Financeiro";
            //18 de geo
            wordList[85] = "Monoteístas";
            wordList[86] = "Coração";
            wordList[87] = "Meca";
            wordList[88] = "Mesquita";
            wordList[89] = "Alláh";
            //19 de geo
            wordList[90] = "Classificação";
            wordList[91] = "Países";
            wordList[92] = "Estatística";
            wordList[93] = "População";
            wordList[94] = "Qualidade de vida";
            //20 de geo
            wordList[95] = "Industrializados";
            wordList[96] = "América do Sul";
            wordList[97] = "ORICS";
            wordList[98] = "Economia";
            wordList[99] = "Em desenvolvimento";

            //endregion

            //region respostas geo

             resposta1 = "Mapa";
             resposta2 = "Astronomia";
             resposta3 = "Geologia";
             resposta4 = "Hidrografia";
             resposta5 = "População";
             resposta6 = "Urbanização";
             resposta7 = "industrialização";
             resposta8 = "Planeta";
             resposta9 = "Agricultura";
             resposta10 = "PIB";
             resposta11 = "Energia Solar";
             resposta12 = "Energia Eólica";
             resposta13 = "ONU";
             resposta14 = "Veículo a vapor";
             resposta15 = "Bússola";
             resposta16 = "OIT";
             resposta17 = "FMI";
             resposta18 = "Egípcios";
             resposta19 = "IDH";
             resposta20 = "Países Emergentes";

            //endregion


            dica1.setText(wordList[0]);

            cat.setText(String.valueOf(categoria1));



        } else if (Botao.botaoClasse == 5) {


            //revisado - falta ler todas

            //region categoria lit

            categoria1 = "Movimento Literário";
            categoria2 = "Movimento Literário";
            categoria3 = "Movimento Literário";
            categoria4 = "Movimento Literário";
            categoria5 = "Movimento Literário";
            categoria6 = "Movimento Literário";
            categoria7 = "Movimento Literário";
            categoria8 = "Movimento Literário";
            categoria9 = "Movimento Literário";
            categoria10 = "Movimento Literário";
            categoria11 = "Pessoa";
            categoria12 = "Pessoa";
            categoria13 = "Pessoa";
            categoria14 = "Movimento Literário";
            categoria15 = "Movimento Literário";
            categoria16 = "Pessoa";
            categoria17 = "Movimento Literário";
            categoria18 = "Movimento Literário";
            categoria19 = "Movimento Literário";
            categoria20 = "Movimento Literário";

            //endregion

            //region respostas lit

             resposta1 = "Trovadorismo";
             resposta2 = "Humanismo";
             resposta3 = "Classicismo";
             resposta4 = "Arcadismo";
             resposta5 = "Barroco";
             resposta6 = "Romantismo";
             resposta7 = "Realismo";
             resposta8 = "Poesia épica";
             resposta9 = "Parnasianismo";
             resposta10 = "Simbolismo";
             resposta11 = "Barreto";
             resposta12 = "Lombato";
             resposta13 = "Aranha";
             resposta14 = "Poesia Palaciana";
             resposta15 = "Neorrealismo";
             resposta16 = "Camões";
             resposta17 = "Futurismo";
             resposta18 = "Cubismo";
             resposta19 = "Modernismo";
             resposta20 = "Dadaísmo";

            //endregion

            //region palavras literatura

            //1 de Literatura Trovadorismo
            wordList[0] = "Idade Média";
            wordList[1] = " Cantigas  ";
            wordList[2] = " Artistas Nobres ";
            wordList[3] = " Instrumentos Musicais ";
            wordList[4] = " Livros Manuscritos ";
            //2 de Literatura Humanismo
            wordList[5] = "Cultos e Farsas";
            wordList[6] = "Período de transição  ";
            wordList[7] = " Antropocentrismo ";
            wordList[8] = " Gil Vicente ";
            wordList[9] = " Racionalidade ";
            //3 de Literatura Classicismo
            wordList[10] = " Arte";
            wordList[11] = "Pureza Formal";
            wordList[12] = " Mundo Antigo ";
            wordList[13] = " Mitologia ";
            wordList[14] = "Sonetos";
            //4 de Literatura Arcadismo
            wordList[15] = "Bucolismo";
            wordList[16] = "Carpe Diem";
            wordList[17] = "Racionalismo";
            wordList[18] = "Sonetos";
            wordList[19] = "Pseudônios";
            //5 de Literatura Barroco
            wordList[20] = "Contrarreforma";
            wordList[21] = "Cristianismo";
            wordList[22] = "Antíteses";
            wordList[23] = " Arte Rebuscada ";
            wordList[24] = " Dualismo ";
            //6 de Literatura Romantismo
            wordList[25] = " Mal do Século ";
            wordList[26] = " Subjetivismo ";
            wordList[27] = "  Iluminismo ";
            wordList[28] = " Nacionalismo";
            wordList[29] = " Sentimentalismo ";
            //7 de Literatura Realismo
            wordList[30] = " Universalismo ";
            wordList[31] = " Objetividade  ";
            wordList[32] = " Mulher não idealizada ";
            wordList[33] = " Adultério  ";
            wordList[34] = " Herói Problemático ";
            //8 de Literatura Poesia Épica
            wordList[35] = " Clássicos ";
            wordList[36] = " Narrativo ";
            wordList[37] = " Afinidades Formais  ";
            wordList[38] = " Exaltação do herói ";
            wordList[39] = "Mitologia";
            //9 de Literatura Parnasianismo
            wordList[40] = " Sonetos ";
            wordList[41] = " Equilíbrio formal ";
            wordList[42] = " Racionalismo ";
            wordList[43] = " Tradição Clássica ";
            wordList[44] = " Vocabulário Rebuscado ";
            //10 de Literatura Simbolismo
            wordList[45] = " Religiosidade ";
            wordList[46] = " Efeitos Sonoros ";
            wordList[47] = "  Transcendentalismo ";
            wordList[48] = " Sinestesias ";
            wordList[49] = "  Misticismo ";
            //11 de Literatura Lima Barreto
            wordList[50] = " Jornalista ";
            wordList[51] = " Escritor ";
            wordList[52] = " Romances  ";
            wordList[53] = " Pré-Modernismo  ";
            wordList[54] = " Humorístico ";
            //12 de Literatura Monteiro Lobato
            wordList[55] = " Escritor";
            wordList[56] = " Literatura infantil";
            wordList[57] = " Nacionalista ";
            wordList[58] = " Pioneiro Literário ";
            wordList[59] = " Pica Pau Amarelo ";
            //13 de Literatura Graça Aranha
            wordList[60] = " Escritor";
            wordList[61] = " Diplomata ";
            wordList[62] = "  Pré-Modernista";
            wordList[63] = " Arte Moderna ";
            wordList[64] = " Obra Canaã";
            //14 de Literatura Poesia Palaciana
            wordList[65] = " Movimento Literário ";
            wordList[66] = "  Idealismo";
            wordList[67] = "  Expressividade";
            wordList[68] = " Sensualidade ";
            wordList[69] = " Satíricos ";
            //15 de Literatura Neorrealismo
            wordList[70] = " Corrente Artística";
            wordList[71] = " Carácter Ideológico";
            wordList[72] = " Objetividade ";
            wordList[73] = " Marxismo  ";
            wordList[74] = " Realismo ";
            //16 de Literatura Luís Vaz de Camões
            wordList[75] = " Poeta";
            wordList[76] = " Nacionalista";
            wordList[77] = " Figura Literária ";
            wordList[78] = "  Português ";
            wordList[79] = " Os Lusíadas  ";
            //17 de Literatura Futurismo
            wordList[80] = "Imagem e movimento ";
            wordList[81] = "Industrialização ";
            wordList[82] = "Tecnologia";
            wordList[83] = "Poesia Concretista";
            wordList[84] = "Velocidade";
            //18 de Literatura Cubismo
            wordList[85] = " Formas Geométricas";
            wordList[86] = " Pablo Picasso";
            wordList[87] = " Pintura ";
            wordList[88] = "Perspectiva   ";
            wordList[89] = "  Formas Geométricas";
            //19 de Literatura Modernismo
            wordList[90] = "Movimento Cultural ";
            wordList[91] = " Linguagem Coloquial";
            wordList[92] = " Burguesia ";
            wordList[93] = " Cenário Artístico  ";
            wordList[94] = "Vanguardas";
            //20 de Literatura Dadaísmo
            wordList[95] = " Movimento Artístico ";
            wordList[96] = "Vanguardas ";
            wordList[97] = " Ruptura Artística ";
            wordList[98] = " Culto ao nada  ";
            wordList[99] = " Poesias ";

            //endregion

            dica1.setText(wordList[0]);

            cat.setText(String.valueOf(categoria1));




        } else if (Botao.botaoClasse == 6){

            //region categoria ingles

            categoria1 = "Animal";
            categoria2 = "Animal";
            categoria3 = "Object";
            categoria4 = "Accessory";
            categoria5 = "Shelter";
            categoria6 = "Object";
            categoria7 = "Acessory";
            categoria8 = "Verb";
            categoria9 = "Animal";
            categoria10 = "Object";
            categoria11 = "Food";
            categoria12 = "Food";
            categoria13 = "Sport";
            categoria14 = "Sport";
            categoria15 = "Sport";
            categoria16 = "Acessory";
            categoria17 = "Food";
            categoria18 = "Verb";
            categoria19 = "Vehicle";
            categoria20 = "Vehicle";

            //endregion

            //region respostas Ingles

            resposta1 = "Dog";
            resposta2 = "Cat";
            resposta3 = "Table";
            resposta4 = "Bagpack";
            resposta5 = "House";
            resposta6 = "Seat";
            resposta7 = "Shoes";
            resposta8 = "To breake";
            resposta9 = "Mouse";
            resposta10 = "Window";
            resposta11 = "Hot dog";
            resposta12 = "Hamburguer";
            resposta13 = "Soccer";
            resposta14 = "Baseball";
            resposta15 = "Basketball";
            resposta16 = "Ring";
            resposta17 = "Pizza";
            resposta18 = "To write";
            resposta19 = "Car";
            resposta20 = "Truck";

            //endregion

            //region palavras ingles

            //1 de ingles
            wordList[0] = "4 legs";
            wordList[1] = " Domestic  ";
            wordList[2] = " Canine";
            wordList[3] = " Best friend ";
            wordList[4] = " Pitbull ";
            //2 de ingles
            wordList[5] = " 4 legs ";
            wordList[6] = "Domestic  ";
            wordList[7] = " Feline ";
            wordList[8] = " Claws ";
            wordList[9] = " Persian ";
            //3 de ingles
            wordList[10] = " Wood";
            wordList[11] = "4 legs";
            wordList[12] = "To write ";
            wordList[13] = "To eat";
            wordList[14] = "Furniture";
            //4 de ingles
            wordList[15] = "To garner";
            wordList[16] = "2 Handles";
            wordList[17] = "Shoulders";
            wordList[18] = "Zipper";
            wordList[19] = "Bag";
            //5 de ingles
            wordList[20] = "Roof";
            wordList[21] = "Walls";
            wordList[22] = "To reside";
            wordList[23] = "To sleep";
            wordList[24] = "Home";
            //6 de ingles
            wordList[25] = "4 legs";
            wordList[26] = "Backboard";
            wordList[27] = "To rest";
            wordList[28] = "Anywhere";
            wordList[29] = "To sit";
            //7 de ingles
            wordList[30] = "Pair";
            wordList[31] = "insole";
            wordList[32] = "Shoelace";
            wordList[33] = "Boot sole";
            wordList[34] = "For foot";
            //8 de ingles
            wordList[35] = "To split";
            wordList[36] = "To crack";
            wordList[37] = "To smash";
            wordList[38] = "To rip";
            wordList[39] = "To stop";
            //9 de ingles
            wordList[40] = "Mammal";
            wordList[41] = "Rodent";
            wordList[42] = "Cheese";
            wordList[43] = "Sewage";
            wordList[44] = "Mickey";
            //10 de ingles
            wordList[45] = "Wall";
            wordList[46] = "Glass";
            wordList[47] = "Trasparent";
            wordList[48] = "Natural light";
            wordList[49] = "Computer";
            //11 de ingles
            wordList[50] = "Bread";
            wordList[51] = "Ketchup";
            wordList[52] = "Mustad";
            wordList[53] = "Mayonnaise";
            wordList[54] = "Humorístico ";
            //12 de ingles
            wordList[55] = "Bread";
            wordList[56] = "Cheese";
            wordList[57] = "Meat";
            wordList[58] = "Pickles";
            wordList[59] = "Burguer King";
            //13 de ingles
            wordList[60] = "Ball";
            wordList[61] = "22 in the field ";
            wordList[62] = "Goal";
            wordList[63] = "MLS";
            wordList[64] = "La Galaxy";
            //14 de ingles
            wordList[65] = "Helmet";
            wordList[66] = "Glove";
            wordList[67] = "Base";
            wordList[68] = "Taco ";
            wordList[69] = "Dodgers ";
            //15 de ingles
            wordList[70] = "Regatta";
            wordList[71] = "Basket";
            wordList[72] = "3 Points";
            wordList[73] = "La Lakers";
            wordList[74] = "NBA";
            //16 de ingles
            wordList[75] = "Metal";
            wordList[76] = "Couple";
            wordList[77] = "Round";
            wordList[78] = "Symbolic";
            wordList[79] = "Finger";
            //17 de ingles
            wordList[80] = "Pasta";
            wordList[81] = "Round";
            wordList[82] = "Sauce";
            wordList[83] = "8 pieces";
            wordList[84] = "Delevery";
            //18 de ingles
            wordList[85] = "Letter";
            wordList[86] = "Pen";
            wordList[87] = "Message";
            wordList[88] = "Typing";
            wordList[89] = "Communication";
            //19 de ingles
            wordList[90] = "Iron";
            wordList[91] = "Fast";
            wordList[92] = "5 people";
            wordList[93] = "4 doors";
            wordList[94] = "4 wheels";
            //20 de ingles
            wordList[95] = "Big";
            wordList[96] = "Slow";
            wordList[97] = "Stong";
            wordList[98] = "Cargo";
            wordList[99] = "Freight";

            //endregion

            dica1.setText(wordList[0]);

            cat.setText(String.valueOf(categoria1));



        }else if (Botao.botaoClasse == 7) {

            //region categoria espanhol

            categoria1 = "Objeto";
            categoria2 = "Objeto";
            categoria3 = "Ropa";
            categoria4 = "Aparato electrónico";
            categoria5 = "Aparato electrónico";
            categoria6 = "Aparato electrónico";
            categoria7 = "Objeto";
            categoria8 = "Ropa";
            categoria9 = "Objeto";
            categoria10 = "Entretenimiento";
            categoria11 = "Entretenimiento";
            categoria12 = "Accesorio";
            categoria13 = "Institución";
            categoria14 = "Deporte";
            categoria15 = "Transporte";
            categoria16 = "Accesorio";
            categoria17 = "Territorio";
            categoria18 = "Comida";
            categoria19 = "Transporte";
            categoria20 = "Transporte";

            //endregion

            //region respostas espanhol

            resposta1 = "Mesa";
            resposta2 = "Silla";
            resposta3 = "Suéter";
            resposta4 = "Celular";
            resposta5 = "Videojuego";
            resposta6 = "Televisíon";
            resposta7 = "Libro";
            resposta8 = "Camisa";
            resposta9 = "Botella";
            resposta10 = "Juego de mesa";
            resposta11 = "Juegos";
            resposta12 = "Puerta";
            resposta13 = "Escuela";
            resposta14 = "Fútbol";
            resposta15 = "Coche";
            resposta16 = "Tenis";
            resposta17 = "País";
            resposta18 = "Lasaña";
            resposta19 = "Avión";
            resposta20 = "Nave";

            //endregion

            //region palavras espanhol

            //1 de espanhol
            wordList[0] = "Madera";
            wordList[1] = "Platos";
            wordList[2] = "Escritório";
            wordList[3] = "Comedor";
            wordList[4] = "Cuatro patas";
            //2 de espanhol
            wordList[5] = "Columna";
            wordList[6] = "Giratoria";
            wordList[7] = "Comodidad";
            wordList[8] = "Cuatro patas";
            wordList[9] = "Sentar";
            //3 de espanhol
            wordList[10] = "Accesorio";
            wordList[11] = "Lana";
            wordList[12] = "Invierno";
            wordList[13] = "Calienta";
            wordList[14] = "Equipo";
            //4 de espanhol
            wordList[15] = "Pantalla";
            wordList[16] = "Datos";
            wordList[17] = "Comunicaíon";
            wordList[18] = "Tecnologia";
            wordList[19] = "Eletrónico";
            //5 de espanhol
            wordList[20] = "Consola";
            wordList[21] = "Eletrónico";
            wordList[22] = "Virtual";
            wordList[23] = "Controles";
            wordList[24] = "Juegos";
            //6 de espanhol
            wordList[25] = "Pantalla";
            wordList[26] = "Colores";
            wordList[27] = "Programas";
            wordList[28] = "Noticias";
            wordList[29] = "Novelas";
            //7 de espanhol
            wordList[30] = "Páginas";
            wordList[31] = "Información";
            wordList[32] = "Historias";
            wordList[33] = "Fábulas";
            wordList[34] = "Portada";
            //8 de espanhol
            wordList[35] = "Equipo";
            wordList[36] = "Estilo";
            wordList[37] = "Modelos";
            wordList[38] = "Tamaños";
            wordList[39] = "Colores";
            //9 de espanhol
            wordList[40] = "Cubierta";
            wordList[41] = "Compartimento";
            wordList[42] = "Capacidad";
            wordList[43] = "Modelos";
            wordList[44] = "Bolores";
            //10 de espanhol
            wordList[45] = "Estrategia";
            wordList[46] = "Objetivo";
            wordList[47] = "Jugadores";
            wordList[48] = "Dado";
            wordList[49] = "Muñecas";
            //11 de espanhol
            wordList[50] = "Virtual";
            wordList[51] = "Acción";
            wordList[52] = "Aventura";
            wordList[53] = "Caracteres";
            wordList[54] = "Online";
            //12 de espanhol
            wordList[55] = "Modelos";
            wordList[56] = "Abre";
            wordList[57] = "Entrada";
            wordList[58] = "Llaves";
            wordList[59] = "Cerradura";
            //13 de espanhol
            wordList[60] = "Habitaciones";
            wordList[61] = "Aprendizje";
            wordList[62] = "Disciplinas";
            wordList[63] = "Estudiantes";
            wordList[64] = "Profesores";
            //14 de espanhol
            wordList[65] = "Equipo";
            wordList[66] = "Selecciones";
            wordList[67] = "Campeonatos";
            wordList[68] = "Estadios";
            wordList[69] = "Árbitro";
            //15 de espanhol
            wordList[70] = "Marchas";
            wordList[71] = "Asientos";
            wordList[72] = "Rueda";
            wordList[73] = "pasajeros";
            wordList[74] = "Gas";
            //16 de espanhol
            wordList[75] = "Goma";
            wordList[76] = "Cordón";
            wordList[77] = "Zapatos";
            wordList[78] = "Calcetines";
            wordList[79] = "Pies";
            //17 de espanhol
            wordList[80] = "Población";
            wordList[81] = "Gobernadores";
            wordList[82] = "Estados";
            wordList[83] = "Ciudades";
            wordList[84] = "Presidente";
            //18 de espanhol
            wordList[85] = "Horno";
            wordList[86] = "Masa";
            wordList[87] = "Carne";
            wordList[88] = "Queso";
            wordList[89] = "Salsa";
            //19 de espanhol
            wordList[90] = "Amplias";
            wordList[91] = "Pasajeros";
            wordList[92] = "Piloto";
            wordList[93] = "Vuelo";
            wordList[94] = "Vehículo";
            //20 de espanhol
            wordList[95] = "Inmensa";
            wordList[96] = "Pasajeros";
            wordList[97] = "Marítimos";
            wordList[98] = "Puertos";
            wordList[99] = "Vehículo";

            //endregion

            dica1.setText(wordList[0]);

            cat.setText(String.valueOf(categoria1));



        }else if (Botao.botaoClasse == 8) {

            //region categoria filosofia

            categoria1 = "Pessoa";
            categoria2 = "Pessoa";
            categoria3 = "Instituição";
            categoria4 = "Pessoa";
            categoria5 = "Pessoa";
            categoria6 = "Pessoa";
            categoria7 = "Pessoa";
            categoria8 = "Pessoa";
            categoria9 = "Doutrina";
            categoria10 = "Ideologia";
            categoria11 = "Pessoa";
            categoria12 = "Evento";
            categoria13 = "Pessoa";
            categoria14 = "Pensamento";
            categoria15 = "Pessoa";
            categoria16 = "Pessoa";
            categoria17 = "Pensamento";
            categoria18 = "Pensamento";
            categoria19 = "Pessoa";
            categoria20 = "Pessoa";

            //endregion

            //region respostas filosofia

            resposta1 = "Platão";
            resposta2 = "Sócrates";
            resposta3 = "Escola";
            resposta4 = "Aristóteles";
            resposta5 = "Confúcio";
            resposta6 = "Hipona";
            resposta7 = "Aquino";
            resposta8 = "Maquiavel";
            resposta9 = "Empirismo";
            resposta10 = "Racionalismo";
            resposta11 = "Descartes";
            resposta12 = "Iluminismo";
            resposta13 = "Kant";
            resposta14 = "Idealismo Alemão";
            resposta15 = "Comte";
            resposta16 = "Durkheim";
            resposta17 = "Existencialismo";
            resposta18 = "Filosofia Analítica";
            resposta19 = "Marx";
            resposta20 = "Weber";

            //endregion

            //region palavras filosofia

            //1 de espanhol
            wordList[0] = "Filósofo";
            wordList[1] = "Matemático";
            wordList[2] = "Ateniense";
            wordList[3] = "Autor";
            wordList[4] = "Fundador";
            //2 de espanhol
            wordList[5] = "Filósofo";
            wordList[6] = "Ateniense";
            wordList[7] = "Fundador";
            wordList[8] = "Antropologia";
            wordList[9] = "Autor";
            //3 de espanhol
            wordList[10] = "Grupos";
            wordList[11] = "Pensadores";
            wordList[12] = "Filósofos";
            wordList[13] = "Ateniense";
            wordList[14] = "Sociedade Tradicional";
            //4 de espanhol
            wordList[15] = "Filósofo";
            wordList[16] = "Discípulo";
            wordList[17] = "Autor";
            wordList[18] = "Influenciador Filosófico";
            wordList[19] = "Causa Material";
            //5 de espanhol
            wordList[20] = "Filósofo";
            wordList[21] = "Pensador";
            wordList[22] = "Confucionismo";
            wordList[23] = "Chinês";
            wordList[24] = "Escritor";
            //6 de espanhol
            wordList[25] = "Filósofo";
            wordList[26] = "Teólogo";
            wordList[27] = "Bispo";
            wordList[28] = "Escritor";
            wordList[29] = "Cristianismo";
            //7 de espanhol
            wordList[30] = "Frade Católico";
            wordList[31] = "Influenciador";
            wordList[32] = "Italiano";
            wordList[33] = "Autor";
            wordList[34] = "Expoente da Filosofia";
            //8 de espanhol
            wordList[35] = "Filósofo";
            wordList[36] = "Historiador";
            wordList[37] = "Poeta";
            wordList[38] = "Diplomata";
            wordList[39] = "Músico";
            //9 de espanhol
            wordList[40] = "Movimento Filosófico";
            wordList[41] = "Experiências Humanas";
            wordList[42] = "Conhecimento Científico";
            wordList[43] = "teoria Epistemológica";
            wordList[44] = "Crítica Metafísica";
            //10 de espanhol
            wordList[45] = "Corrente Filosófica";
            wordList[46] = "Raciocínio";
            wordList[47] = "Razão Humana";
            wordList[48] = "Pensamento";
            wordList[49] = "Doutrina";
            //11 de espanhol
            wordList[50] = "Filósofo";
            wordList[51] = "Físico";
            wordList[52] = "Matemático";
            wordList[53] = "Francês";
            wordList[54] = "Racionalista";
            //12 de espanhol
            wordList[55] = "Movimento Intelectual";
            wordList[56] = "Liberdade Econômica";
            wordList[57] = "Ideais Liberais";
            wordList[58] = "Apoio da Burguesia";
            wordList[59] = "Transaformação ideológicas";
            //13 de espanhol
            wordList[60] = "Filósofo";
            wordList[61] = "Prussicano";
            wordList[62] = "Alemão";
            wordList[63] = "Pensador";
            wordList[64] = "Expoente da Ideia";
            //14 de espanhol
            wordList[65] = "Movimento Filosófico";
            wordList[66] = "Cultura Alemã";
            wordList[67] = "Pós-Kantiano";
            wordList[68] = "Orientações Filosófica";
            wordList[69] = "Estímulo Intelectual";
            //15 de espanhol
            wordList[70] = "Filósofo";
            wordList[71] = "Francês";
            wordList[72] = "Influenciador";
            wordList[73] = "Positivismo";
            wordList[74] = "Criador Filosófico";
            //16 de espanhol
            wordList[75] = "Socioólogo";
            wordList[76] = "Antropólogo";
            wordList[77] = "Filósofo";
            wordList[78] = "Francês";
            wordList[79] = "Psicólogo Social";
            //17 de espanhol
            wordList[80] = "Escola Literária";
            wordList[81] = "Filósofos";
            wordList[82] = "Pensamentos";
            wordList[83] = "Doutrinas";
            wordList[84] = "Realidade Objetiva";
            //18 de espanhol
            wordList[85] = "Filósofo";
            wordList[86] = "Vertente do Pensamento";
            wordList[87] = "Metodologia Filosófica";
            wordList[88] = "Análise de Conceitos";
            wordList[89] = "Método Lógico";
            //19 de espanhol
            wordList[90] = "Filósofo";
            wordList[91] = "Sociólogo";
            wordList[92] = "Jornalista";
            wordList[93] = "Autor";
            wordList[94] = "Revolucionário";
            //20 de espanhol
            wordList[95] = "Intelectual";
            wordList[96] = "Jurista";
            wordList[97] = "Economista";
            wordList[98] = "Alemão";
            wordList[99] = "Fundador Sociólogo";

            //endregion

            dica1.setText(wordList[0]);

            cat.setText(String.valueOf(categoria1));



        }else if (Botao.botaoClasse == 9) {

            //region categoria mat

            categoria1 = "Forma Geométrica";
            categoria2 = "Forma Geométrica";
            categoria3 = "Forma Geométrica";
            categoria4 = "Forma Geométrica";
            categoria5 = "Forma Geométrica";
            categoria6 = "Forma Geométrica";
            categoria7 = "Fundamento";
            categoria8 = "Fórmula";
            categoria9 = "Método de solução";
            categoria10 = "Método de solução";
            categoria11 = "Ciêcia";
            categoria12 = "Definição";
            categoria13 = "Método de solução";
            categoria14 = "Método de solução";
            categoria15 = "Fundamento";
            categoria16 = "Método de solução";
            categoria17 = "Operação";
            categoria18 = "Espaço";
            categoria19 = "Definição";
            categoria20 = "Forma";

            //endregion

            //region respostas mat

            resposta1 = "Quadriláteros";
            resposta2 = "Triângulos;";
            resposta3 = "Hepágonoa";
            resposta4 = "Pentágono";
            resposta5 = "Octógono";
            resposta6 = "Decágono";
            resposta7 = "Tabuada";
            resposta8 = "Função afim";
            resposta9 = "Teoremas de Tales";
            resposta10 = "Trigonometria";
            resposta11 = "Estatística";
            resposta12 = "Números decimais";
            resposta13 = "Teorema de Pitágoras";
            resposta14 = "Plano cartesiano";
            resposta15 = "Função exponencial";
            resposta16 = "Matriz";
            resposta17 = "Fração";
            resposta18 = "Volume";
            resposta19 = "Números primos";
            resposta20 = "Primas";

            //endregion

            //region palavras mat

            //1 de mat
            wordList[0] = "Polígonos";
            wordList[1] = "Duas diagonais";
            wordList[2] = "Losangos";
            wordList[3] = "Trapézios";
            wordList[4] = "4 lados";
            //2 de mat
            wordList[5] = "Polígonos";
            wordList[6] = "180°";
            wordList[7] = "Isósceles";
            wordList[8] = "Escalenos";
            wordList[9] = "3 lados";
            //3 de mat
            wordList[10] = "Polígonos";
            wordList[11] = "14 diagonais";
            wordList[12] = "Convexo";
            wordList[13] = "Cíclico";
            wordList[14] = "7 lados";
            //4 de mat
            wordList[15] = "Polígonos";
            wordList[16] = "540°";
            wordList[17] = "Angulo central";
            wordList[18] = "Equiláteros";
            wordList[19] = "5 lados";
            //5 de mat
            wordList[20] = "Polígonos";
            wordList[21] = "135°";
            wordList[22] = "Angulo central";
            wordList[23] = "Isogonal";
            wordList[24] = "8 Isogonal";
            //6 de mat
            wordList[25] = "Polígonos";
            wordList[26] = "144°";
            wordList[27] = "35 diagonais";
            wordList[28] = "Angulo Central";
            wordList[29] = "10 lados";
            //7 de mat
            wordList[30] = "Multiplicação";
            wordList[31] = "1 ao 10";
            wordList[32] = "Decorar";
            wordList[33] = "Novos métodos";
            wordList[34] = "1 x 5 = 5";
            //8 de mat
            wordList[35] = "Função";
            wordList[36] = "Cotidiano";
            wordList[37] = "F(x) = ax = b";
            wordList[38] = "Números reais";
            wordList[39] = "A  ≠  0";
            //9 de mat
            wordList[40] = "Geometria";
            wordList[41] = "Razão e Proporção";
            wordList[42] = "Sombra";
            wordList[43] = "Calcular distância";
            wordList[44] = "Tales";
            //10 de mat
            wordList[45] = "Triângulo retângulo";
            wordList[46] = "Angulos e lados";
            wordList[47] = "Razão";
            wordList[48] = "Tangente";
            wordList[49] = "Seno e cosseno";
            //11 de mat
            wordList[50] = "Coleta";
            wordList[51] = "Organização";
            wordList[52] = "Análise";
            wordList[53] = "Registro";
            wordList[54] = "Dados";
            //12 de mat
            wordList[55] = "Reais";
            wordList[56] = "Racionais";
            wordList[57] = "Positivos";
            wordList[58] = "Negativos";
            wordList[59] = "Não inteiros";
            //13 de mat
            wordList[60] = "Triangulo Retângulo";
            wordList[61] = "Catetos";
            wordList[62] = "Hipotenusa";
            wordList[63] = " c²= a²+b² ";
            wordList[64] = "Pitágoras";
            //14 de espanhol
            wordList[65] = "Eixos";
            wordList[66] = "Coordenadas";
            wordList[67] = "Quadrantes";
            wordList[68] = "Ordenadas";
            wordList[69] = "Abscissas";
            //15 de mat
            wordList[70] = "Base > 1";
            wordList[71] = "Imagem positiva";
            wordList[72] = "f(x) = 4x ";
            wordList[73] = "Elevado";
            wordList[74] = "Variável no expoente";
            //16 de mat
            wordList[75] = "Coluna";
            wordList[76] = "Linha";
            wordList[77] = "Não comutativos";
            wordList[78] = "Inversas";
            wordList[79] = "Quadrada";
            //17 de mat
            wordList[80] = "Numerador";
            wordList[81] = "Denominador";
            wordList[82] = "Divisão";
            wordList[83] = "Partes iguais";
            wordList[84] = "1/2";
            //18 de mat
            wordList[85] = "Medida";
            wordList[86] = "Área";
            wordList[87] = "Base";
            wordList[88] = "Altura";
            wordList[89] = "Comprimento";
            //19 de matematica Números primos
            wordList [90]=" Naturais";
            wordList [91]="Resto  ≠ 0";
            wordList [92]=" 2 ";
            wordList [93]=" 3";
            wordList [94]=" 5";

//20 de matematica Prima
            wordList [95]=" Altura";
            wordList [96]="Base";
            wordList [97]=" Comprimento";
            wordList [98]=" Sólido";
            wordList [99]=" Poliedro";


            //endregion

            dica1.setText(wordList[0]);

            cat.setText(String.valueOf(categoria1));



        }else if (Botao.botaoClasse == 10) {

            //region categoria fisica

            categoria1 = "Energia";
            categoria2 = "Reação";
            categoria3 = "Reação";
            categoria4 = "Lei";
            categoria5 = "Energia";
            categoria6 = "Pessoal";
            categoria7 = "Transição";
            categoria8 = "Transição";
            categoria9 = "Força";
            categoria10 = "Energia";
            categoria11 = "Velocidade";
            categoria12 = "Medida";
            categoria13 = "Força";
            categoria14 = "Fenômeno";
            categoria15 = "Deslocamento";
            categoria16 = "Pessoa";
            categoria17 = "Objeto";
            categoria18 = "Pessoa";
            categoria19 = "Pessoa";
            categoria20 = "Força";

            //endregion

            //region respostas fisica

            resposta1 = "Energia solar";
            resposta2 = "Endotérmica";
            resposta3 = "Exotérmica";
            resposta4 = "Lei de Hess";
            resposta5 = "Energia eólica";
            resposta6 = "Newton";
            resposta7 = "Fusão";
            resposta8 = "Solidificação";
            resposta9 = "Força elástica";
            resposta10 = "Energia hidrelétrica";
            resposta11 = "Velocidade média";
            resposta12 = "Entropia";
            resposta13 = "Força centrípeta";
            resposta14 = "Refração";
            resposta15 = "Movimento uniforme";
            resposta16 = "Galilei";
            resposta17 = "Espelho esférico";
            resposta18 = "Einstein";
            resposta19 = "Tesla";
            resposta20 = "Gravidade";

            //endregion

            //region palavras fisica

            //1 de física Energia solar
            wordList [0]=" Renovável";
            wordList [1]=" Luz";
            wordList [2]=" Térmica";
            wordList [3]=" Elétrica";
            wordList [4]=" Sol";

            //2 de física Endotérmica
            wordList [5]=" Energia ";
            wordList [6]=" Interior";
            wordList [7]=" Mantida";
            wordList [8]=" Absorvida";
            wordList [9]=" Cozinhar";

            //3 de física Exotérmica
            wordList [10]="Energia";
            wordList [11]="	Menos calor";
            wordList [12]=" Exterior";
            wordList [13]=" Liberação";
            wordList [14]=" Congelar";

            //4 de física Lei de Hess
            wordList [15]="Variação ";
            wordList [16]="Energia";
            wordList [17]="Entalpia";
            wordList [18]=" ΔH = Hf – Hi ";
            wordList [19]=" ΔH3 = ΔH1 + ΔH2 ";

            //5 de física Energia eólica
            wordList [20]="Renovável";
            wordList [21]=" Cinética";
            wordList [22]=" Ar";
            wordList [23]=" Aerogeradores";
            wordList [24]=" Vento ";


            //6 de física Isaac Newton
            wordList [25]=" Cientista";
            wordList [26]="Inglês";
            wordList [27]=" Lei da Gravidade";
            wordList [28]=" Inércia";
            wordList [29]=" Ação e Reação";

            //7 de física Fusão
            wordList [30]="Endotérmico";
            wordList [31]="Rompe Ligação";
            wordList [32]=" Calor";
            wordList [33]=" Gelo -> Água";
            wordList [34]=" Derreter";

            //8 de física Solidificação
            wordList [35]="Exotérmico ";
            wordList [36]="	Agrupamento";
            wordList [37]=" Esfriar";
            wordList [38]=" Água -> Gelo";
            wordList [39]=" Congelar";

            //9 de física Força elástica
            wordList [40]=" Elasticidade";
            wordList [41]=" Deformação";
            wordList [42]=" Estica";
            wordList [43]=" Comprime";
            wordList [44]=" F = K . x ";


            //10 de física Energia hidrelétrica
            wordList [45]=" Renovável";
            wordList [46]=" Hidráulica";
            wordList [47]=" Cinética";
            wordList [48]=" Itaipu";
            wordList [49]=" Rios";

            //11 de física Velocidade média
            wordList [50]=" Deslocamento";
            wordList [51]=" Tempo";
            wordList [52]=" Intervalo";
            wordList [53]="m/s ";
            wordList [54]=" Vm";

            //12 de física Entropia
            wordList [55]=" Grandeza";
            wordList [56]=" Termodinâmica";
            wordList [57]=" Desordem";
            wordList [58]=" Moléculas";
            wordList [59]=" Movimento";

            //13 de física Força centrípeta
            wordList [60]=" Movimento";
            wordList [62]=" Curvilínea";
            wordList [61]=" Circular";
            wordList [63]=" MCU";
            wordList [64]=" Fc = m . a";

            //14 de física Refração
            wordList [65]=" Óptico";
            wordList [66]="Luz";
            wordList [67]=" Propagação";
            wordList [68]=" Desvio";
            wordList [69]=" n = c/v";

            //15 de física Movimento uniforme
            wordList [70]=" Velocidade";
            wordList [71]=" Intervalo igual";
            wordList [72]=" Vm";
            wordList [73]=" Constante";
            wordList [74]=" MU";

            //16 de física Galileu Galilei
            wordList [75]=" Italiano";
            wordList [76]=" Astrofísico";
            wordList [77]=" 1564 - 1642";
            wordList [78]=" Binóculo";
            wordList [79]=" Relógio de pêndulo";

            //17 de fisica Espelho esférico
            wordList [80]="Lisa";
            wordList [81]="Polida";
            wordList [82]="Reflexão";
            wordList [83]=" Curva";
            wordList [84]=" Vidro";


            //18 de física Albert Eistein
            wordList [85]="Alemão";
            wordList [86]="1879 - 1955";
            wordList [87]=" Físico";
            wordList [88]=" Projeto Manhattan";
            wordList [89]=" E = mc2";

            //19 de física Nikola Tesla
            wordList [90]="Austro-húngaro ";
            wordList [91]="Engenheiro";
            wordList [92]=" 1856 - 1943";
           wordList [93]=" Controle remoto";
            wordList [94]=" Correntes continuas";

            //20 de física Gravidade
            wordList [95]=" Isaac Newton";
            wordList [96]=" Albert Einstein";
            wordList [97]=" Atração";
            wordList [98]=" Massa";
            wordList [99]=" Peso = M . G";


            //endregion

            dica1.setText(wordList[0]);

            cat.setText(String.valueOf(categoria1));


        }




        respostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                respostas.setText("");

            }
        });

        btnVoltarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                startActivity(acao);
                finish();

                Botao.botaoClasse = 0;

                Menu.MediaPlayerBotao.start();

            }
        });

        //region estrutura

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //region estrutura

                Menu.MediaPlayerBotao.start();





                if (Botao.acerto == 0) {


                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta1.toUpperCase())) {

                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        cat.setText(String.valueOf(categoria2));

                        DiminuiMoedas.questaos = 2;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;




                        dica1.setText(wordList[5]);
                        btnDicas.setVisibility(View.VISIBLE);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);

                        Botao.acerto = 1;

                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[5]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }

                    }
                } else if (Botao.acerto == 1) {


                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta2.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        cat.setText( String.valueOf(categoria3));

                        DiminuiMoedas.questaos = 3;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[10]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 2;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[10]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 2) {


                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta3.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        cat.setText(String.valueOf(categoria4));

                        DiminuiMoedas.questaos = 4;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[15]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 3;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[15]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 3) {


                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta4.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 5;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText( String.valueOf(categoria5));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[20]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 4;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();


                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[20]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 4) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta5.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiMoedas.questaos = 6;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText("Categoria: " + String.valueOf(categoria6));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[25]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 5;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[25]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 5) {

                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta6.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        cat.setText( String.valueOf(categoria7));

                        DiminuiMoedas.questaos = 7;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[30]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 6;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[30]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 6) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta7.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 8;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText( String.valueOf(categoria8));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[35]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 7;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[35]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 7) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta8.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 9;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText(String.valueOf(categoria9));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[40]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 8;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();
                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[40]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 8) {


                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta9.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        cat.setText( String.valueOf(categoria10));

                        DiminuiMoedas.questaos = 10;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[45]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 9;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();
                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[45]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 9) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta10.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 11;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText(String.valueOf(categoria11));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[50]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 10;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[50]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 10) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta11.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 12;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText(String.valueOf(categoria12));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[55]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 11;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[55]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 11) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta12.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 13;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText( String.valueOf(categoria13));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[60]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 12;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[60]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 12) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta13.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 14;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText( String.valueOf(categoria14));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        DiminuiDicas.numeroDicas = 4;

                        dica1.setText(wordList[65]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 13;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();
                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[65]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 13) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta14.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 15;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText( String.valueOf(categoria15));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[70]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 14;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[70]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 14) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta15.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 16;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText( String.valueOf(categoria16));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[75]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 15;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[75]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 15) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta16.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 17;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText( String.valueOf(categoria17));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[80]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 16;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[80]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 16) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta17.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 18;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText(String.valueOf(categoria18));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[85]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 17;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {
                            dica1.setText(wordList[85]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 17) {
                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta18.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 19;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText(String.valueOf(categoria19));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[90]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 18;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();
                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        if (DiminuiMoedas.numeroMoedas == 0) {

                            dica1.setText(wordList[90]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                } else if (Botao.acerto == 18) {

                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta19.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "Acertou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.questaos = 20;
                        numeroQ.setText(String.valueOf(DiminuiMoedas.questaos));

                        cat.setText( String.valueOf(categoria20));

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        DiminuiDicas.numeroDicas = 4;


                        dica1.setText(wordList[95]);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.VISIBLE);

                        Botao.acerto = 19;
                        Menu.MediaPlayerAcerto.start();


                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas) );

                        if (DiminuiMoedas.numeroMoedas == 0) {

                            dica1.setText(wordList[95]);
                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }

                } else if (Botao.acerto == 19) {

                    if (respostas.getText().toString().trim().toUpperCase().equals(resposta20.toUpperCase())) {


                        Toast.makeText(MainActivity.this, "ganhou", Toast.LENGTH_SHORT).show();

                        respostas.setText("");

                        DiminuiMoedas.numeroMoedas = DiminuiMoedas.numeroMoedas + 4;
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas)) ;

                        DiminuiDicas.numeroDicas = 4;


                        Menu.MediaPlayerAcerto.start();
                        btnDicas.setVisibility(View.VISIBLE);


                        fundo.setBackgroundResource(R.drawable.telafinal);
                        imgCrn.setVisibility(View.INVISIBLE);
                        crn.setVisibility(View.INVISIBLE);
                        imgMoeda.setVisibility(View.INVISIBLE);
                        moedas.setVisibility(View.INVISIBLE);
                        imgQuestao.setVisibility(View.INVISIBLE);
                        numeroQ.setVisibility(View.INVISIBLE);
                        imgCategoria.setVisibility(View.INVISIBLE);
                        cat.setVisibility(View.INVISIBLE);
                        dica1.setVisibility(View.INVISIBLE);
                        dica2.setVisibility(View.INVISIBLE);
                        dica3.setVisibility(View.INVISIBLE);
                        dica4.setVisibility(View.INVISIBLE);
                        dica5.setVisibility(View.INVISIBLE);
                        btnAudio.setVisibility(View.INVISIBLE);
                        btnDicas.setVisibility(View.INVISIBLE);
                        btnValidar.setVisibility(View.INVISIBLE);
                        respostas.setVisibility(View.INVISIBLE);




                    } else {

                        Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_SHORT).show();

                        Menu.MediaPlayerErro.start();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();


                        }
                    }
                }


                //endregion
            }
        });

        //endregion



        //region dicas

        btnDicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Menu.MediaPlayerBotao.start();


                if (Botao.acerto == 0) {

                    if (DiminuiDicas.numeroDicas == 4) {


                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[1]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    } else if (DiminuiDicas.numeroDicas == 3) {

                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[2]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    } else if (DiminuiDicas.numeroDicas == 2) {

                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[3]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    } else if (DiminuiDicas.numeroDicas == 1) {

                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[4]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    }


                } else if (Botao.acerto == 1) {

                    if (DiminuiDicas.numeroDicas == 4) {

                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[6]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    } else if (DiminuiDicas.numeroDicas == 3) {

                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[7]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    } else if (DiminuiDicas.numeroDicas == 2) {

                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[8]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    } else if (DiminuiDicas.numeroDicas == 1) {

                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[9]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }


                } else if (Botao.acerto == 2) {

                    if (DiminuiDicas.numeroDicas == 4) {

                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[11]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[12]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[13]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[14]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 3) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[16]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[17]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[18]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[19]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 4) {

                    if (DiminuiDicas.numeroDicas == 4) {

                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[21]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[22]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[23]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[24]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    }

                } else if (Botao.acerto == 5) {

                    if (DiminuiDicas.numeroDicas == 4) {


                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[26]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[27]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[28]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[29]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 6) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[31]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[32]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[33]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[34]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 7) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[36]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[37]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[38]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[39]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 8) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[41]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[42]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[43]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[44]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 9) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[46]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[47]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[48]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[49]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    }
                } else if (Botao.acerto == 10) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[51]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[52]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[53]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[54]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 11) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[56]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[57]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[58]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[59]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    }
                } else if (Botao.acerto == 12) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[61]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[62]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[63]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[64]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 13) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[66]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[67]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[68]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[69]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 14) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[71]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[72]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[73]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[74]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 15) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[76]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[77]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[78]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[79]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));

                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 16) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[81]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[82]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[83]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[84]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 17) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[86]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[87]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[88]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[89]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 18) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[91]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[92]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[93]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[94]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    }
                } else if (Botao.acerto == 19) {

                    if (DiminuiDicas.numeroDicas == 4) {
                        dica2.setVisibility(View.VISIBLE);
                        dica2.setText(wordList[96]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 3) {
                        dica3.setVisibility(View.VISIBLE);
                        dica3.setText(wordList[97]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 2) {
                        dica4.setVisibility(View.VISIBLE);
                        dica4.setText(wordList[98]);
                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }

                    } else if (DiminuiDicas.numeroDicas == 1) {
                        dica5.setVisibility(View.VISIBLE);
                        dica5.setText(wordList[99]);
                        btnDicas.setVisibility(View.GONE);

                        DiminuiDicas.subtraiDica();

                        DiminuiMoedas.subtraiMoeda();
                        moedas.setText(String.valueOf(DiminuiMoedas.numeroMoedas));


                        if (DiminuiMoedas.numeroMoedas == 0) {

                            DiminuiMoedas.numeroMoedas = 7;
                            Botao.botaoClasse = 0;
                            Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                            startActivity(acao);
                            finish();

                        }


                    }
                }


            }


        });
//endregion



        //region cronometro


        new CountDownTimer(600000, 1000) {
            public void onTick(long millisUntilFinished) {
                crn.setText(String.valueOf(counter));
                counter--;
            }

            public void onFinish() {
                crn.setText("FINISH!!");



                    DiminuiMoedas.numeroMoedas = 7;
                    Botao.botaoClasse = 0;
                    Intent acao = new Intent(MainActivity.this, TelaInicial.class);
                    startActivity(acao);
                    finish();


            }
        }.start();

        //endregion




        //      region audio

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentActionRecognizeSpeech = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);


                intentActionRecognizeSpeech.putExtra(
                        RecognizerIntent.EXTRA_LANGUAGE_MODEL, "pt-BR");
                try {
                    startActivityForResult(intentActionRecognizeSpeech,
                            RECOGNIZE_SPEECH_ACTIVITY);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Tú dispositivo no soporta el reconocimiento por voz",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

//endregion

    }



//region audio2
@Override
protected void onActivityResult(int requestCode,
        int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        switch(requestCode){
        case RECOGNIZE_SPEECH_ACTIVITY:

        if(resultCode==RESULT_OK&&null!=data){

        ArrayList<String>speech=data
        .getStringArrayListExtra(RecognizerIntent.
        EXTRA_RESULTS);
        String strSpeech2Text=speech.get(0);

        respostas.setText(strSpeech2Text);
        }

        break;
default:

        break;
        }
        }


//endregion
        }











