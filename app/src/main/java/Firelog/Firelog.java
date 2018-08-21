package Firelog;


public class Firelog extends Firebase{

    private Message message;


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
