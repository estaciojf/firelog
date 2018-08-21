package com.example.lesimoes.firelog;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Firelog.Firelog;
import Firelog.CustomLog;
import Firelog.Message;


public class MainActivity extends AppCompatActivity {


    //Criando propriedades Button (menos verboso)
    private Button mBtnInfo, mBtnWarn, mBtnError;
    private Firelog firelog;
    private CustomLog customLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Faz o link entre o XML e a Classe Java
        bindViews();


        firelog = new Firelog();
        customLog = new CustomLog();

        //Implementa as ações dos botões
        mBtnWarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
        mBtnInfo = findViewById(R.id.btn_info);
        mBtnWarn = findViewById(R.id.btn_warn);
        mBtnError = findViewById(R.id.btn_error);
    }

}
