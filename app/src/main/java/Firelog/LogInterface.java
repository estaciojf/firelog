package Firelog;



/*
*
*   Interface (mais alto nível de abstração) do Log
*
*
*   Obs.: Usamos interface quando queremos delegar (obrigar) que uma classe implemente métodos
*   com uma determinada assinatura (assinatura quantidade e tipos de dados de entrada - parametros).
*
*
* */

public interface LogInterface {

    public void info(Object text);
    public void warn(Object text);
    public void error(Object text);


}