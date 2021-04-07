package com.example.genesisfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PassingAcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing_acivity)

        supportFragmentManager.beginTransaction().add(R.id.yellow_layout,BlueFragment()).commit()
    }
}