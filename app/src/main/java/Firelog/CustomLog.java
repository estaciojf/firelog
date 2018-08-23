package Firelog;


import android.util.Log;
import android.widget.Toast;

/*
*
*   Classe que implementa o Log interno (usa o Logcat do Android).
* */

public  class CustomLog implements LogInterface {

    private static final String LOG = "Log";


    /*
    *
    *   Chama os métodos do Logcat passado a String de retorno do método toString()
    *
    *   Obs.: Usamos polimorfismo no método toString - Veja os comentários da classe Message.
    * */

    @Override
    public void info(Object text) {
        Log.i(LOG, text.toString());
    }

    // Escrita concisa, facilita a leitura
    @Override
    public void warn(Object text) {
        Log.w(LOG, text.toString());
    }

    // Escrita menos concisa
    @Override
    public void error(Object text) {
        Log.e(LOG, text.toString());

    }
}
