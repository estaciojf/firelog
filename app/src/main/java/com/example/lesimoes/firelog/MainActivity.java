package com.example.lesimoes.firelog;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Firelog.Firelog;
import Firelog.CustomLog;
import Firelog.Message;



/*
*   Classe da tela do app
* */

public class MainActivity extends AppCompatActivity {


/*
*
*   Propriedades da classe (tela). Criamos uma propriedade para cada elemento de interface.
*
* */

    //  Jeito menos verboso (menos código e mais direto) para declarar variaveis
    private Button mBtnInfo, mBtnWarn, mBtnError;
    //  A propriedade que irá instanciar nossa classe de Log no Firebase
    private Firelog firelog;
    // A propriedade que irá instanciar nossa classe de Log interna
    private CustomLog customLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Faz o link entre os elementos de interface (XML) e as propriedades da classe
        bindViews();

        // Criando as instancias (objetos) das classes
        firelog = new Firelog();
        customLog = new CustomLog();

        /*
        *   Implementa as ações dos botões - Adicionamos um "ouvinte" (setOnClickListener) no botão.
        *   Este "ouvinte" irá "escutar" todos os eventos do tipo click nesse botão, quando houver evento deste tipo
        *   neste botão o trecho de código do método onClick será executado.
        * */

        mBtnWarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Chamando os métodos de Log
                firelog.warn("Oiia");
                customLog.warn(new Message("warn", "Olha isso"));

            }
        });
        mBtnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firelog.info("Beleza");
                customLog.warn(new Message("info", "Bom"));

            }
        });
        mBtnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firelog.error("Zica");
                customLog.warn(new Message("error", "Zica"));


            }
        });

    }





    private void bindViews() {
        /*
        *   A classe R retorna as referencias de elementos de interface
        *  nesse caso usamos para capturar o id de cada elemento de interface
        *
        *
        *  Obs.: O id é definido no Layout (app > res > layout > activity_main.xml)
        *  no modo Text em android:id
        * */
        mBtnInfo = findViewById(R.id.btn_info);
        mBtnWarn = findViewById(R.id.btn_warn);
        mBtnError = findViewById(R.id.btn_error);
    }

}
