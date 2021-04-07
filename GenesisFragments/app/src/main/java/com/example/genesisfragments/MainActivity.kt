package com.example.genesisfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    buttonred.setOnClickListener {
        var redFrag=RedFragment()
        var myManager= supportFragmentManager
        var myTrans= myManager.beginTransaction()
        myTrans.replace(R.id.fragment_g,redFrag)
        myTrans.commit()

    }
        buttonblue.setOnClickListener {

            var blueFrag=BlueFragment()
            var myManager= supportFragmentManager
            var myTrans= myManager.beginTransaction()
            myTrans.replace(R.id.fragment_g,blueFrag)
            myTrans.commit()
        }
    }
}