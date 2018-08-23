package Firelog;

import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/*
*
*   Classe que faz apenas as ações relacionadas com o Firebase.
*   A classe implementa (implements) a interface LogInterface - Como é uma classe abstract ela "joga"
*   a responsabilidade da implementação dos métodos da interface para a classe que irá herda-la (extends).
*
*
*   Obs.: Não se preocupem com os detalhes de implementação do Firebase...
* */

public abstract class Firebase implements LogInterface{

    // Propriedades para "connectar" ao Realtime Database
    private DatabaseReference mDatabase;


    public Firebase() {
        // "Conectando" no Realtime Database
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    /*
    *   Insere dados no Realtime Database
    *
    *   O parametro é do tipo Object para deixar o método flexivel quanto ao tipo de dado que será inserido
    * */
    public void saveData(Object text) {
        mDatabase.child("log").child(getUniqueKey()).setValue(text);

    }

    /*
    * Gera uma chave unica incremental no Realtime Database.
    *
    * Obs.: O método é simples então é conveniente escreve-lo em uma linha
    * */
    private String getUniqueKey() {
        return mDatabase.child("log").push().getKey();
    }
}
