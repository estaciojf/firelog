package Firelog;

import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public abstract class Firebase implements LogInterface{

    private DatabaseReference mDatabase;


    public Firebase() {
        mDatabase = FirebaseDatabase.getInstance().getReference();

    }


    public void saveData(Object text) {
        mDatabase.child("log").child(getUniqueKey()).setValue(text);

    }


    private String getUniqueKey() {
        return mDatabase.child("log").push().getKey();
    }
}
