package com.example.broadcastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver reciever = new Reciever();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.load);
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.example.VISHWA_BROADCAST");
        getApplicationContext().registerReceiver(reciever,filter, Context.RECEIVER_EXPORTED);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                broadcastIntent();
            }
        });


    }
    public void broadcastIntent(){
        Log.d("Vishwa", "Sending broadcast");
        Toast.makeText(this, "Send broadcast", Toast.LENGTH_SHORT).show();
        Intent intent  = new Intent();
       // intent.setPackage("com.example.broadcastapp");
        intent.setAction("com.example.VISHWA_BROADCAST_next");
        intent.putExtra("rahula","Bellulli kabab");
        sendBroadcast(intent);
    }

    protected void onStart() {

        super.onStart();
        Toast.makeText(this, "on Start", Toast.LENGTH_SHORT).show();
    }
}