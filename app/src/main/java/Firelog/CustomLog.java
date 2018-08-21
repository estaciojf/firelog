package Firelog;


import android.util.Log;
import android.widget.Toast;

public  class CustomLog implements LogInterface {

    private static final String LOG = "Log";



    @Override
    public void info(Object text) {
        Log.i(LOG, text.toString());
    }

    @Override
    public void warn(Object text) {
        Log.w(LOG, text.toString());
    }

    @Override
    public void error(Object text) {
        Log.e(LOG, text.toString());

    }
}
