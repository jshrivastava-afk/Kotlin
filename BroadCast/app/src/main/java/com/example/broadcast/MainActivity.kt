package com.example.broadcast

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myRec= MyReciever()
        var myIntentFilter= IntentFilter("android.intent.action.AIRPLANE_MODE")
        registerReceiver(myRec,myIntentFilter)
    }
}