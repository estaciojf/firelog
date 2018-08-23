package Firelog;

import android.telephony.TelephonyManager;
import android.content.Context;

import com.example.lesimoes.firelog.MainActivity;

/*
*   Classe que define a estrutura da mensagem de Log
*
* */


public class Message {


    // O Log contém um tipo e uma mensagem
    public String type;
    public String message;

    // Construtor publico necessário para enviar a estrutura e valores do objeto ao inserir no Firebase
    public Message() {

    }

    // Construtor que recebe os valores de type e message
    public Message(String type, String message) {
        this.type = type;
        this.message = message;

    }

    /*
    *   Polimorfismo do método toString presente em todos os objetos do Java.
    *
    *   Obs.: Em java todas as classes herdam (extends), implicitamente, a classe Object.
    *
    * */
    @Override
    public String toString() {
        return this.type + " - " + this.message;
    }
}
