package Firelog;

import android.telephony.TelephonyManager;
import android.content.Context;

import com.example.lesimoes.firelog.MainActivity;


public class Message {


    public String type;
    public String message;

    public Message() {

    }

    public Message(String type, String message) {
        this.type = type;
        this.message = message;

    }


    @Override
    public String toString() {
        return this.type + " - " + this.message;
    }
}
