package com.example.broadcastapp;

    import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Reciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Vishwa","vishwa is here",null);
        Toast.makeText(context, "test reciever", Toast.LENGTH_SHORT).show();
    }
}
