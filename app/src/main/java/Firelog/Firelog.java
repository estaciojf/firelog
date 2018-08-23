package Firelog;


/*
*
*   Classe que implementa o Log Firease
*
* */


public class Firelog extends Firebase{


    //  Propriedade que receberá a instancia da classe
    private Message message;

    /*
    *
    *   Os métodos de cada tipo de log cria um objeto message com os valores do Log
    *   e chama o método saveData da classe pai (Firebase)
    * */

    @Override
    public void info(Object text) {
        message = new Message("info", "Bom");
        super.saveData(message);
    }

    @Override
    public void warn(Object text) {
        message = new Message("warn", "Olhe isso");
        super.saveData(message);
    }

    @Override
    public void error(Object text) {
        message = new Message("error", "Zica");
        super.saveData(message);
    }
}
