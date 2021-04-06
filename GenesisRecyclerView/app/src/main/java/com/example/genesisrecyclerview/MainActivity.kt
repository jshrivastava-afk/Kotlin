package com.example.genesisrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv= findViewById<RecyclerView>(R.id.myrecycler)

        myrv.layoutManager= LinearLayoutManager(this,RecyclerView.VERTICAL, false)

        var myDalaList=ArrayList<UsersData>()
        myDalaList.add(UsersData("Jai","j@gmail.com","7987066528"))
        myDalaList.add(UsersData("Akshara","a@gmail.com","7987066567"))
        myDalaList.add(UsersData("Yash","y@gmail.com","7987066589"))
        myDalaList.add(UsersData("Jai","j@gmail.com","7987066528"))
        myDalaList.add(UsersData("Akshara","a@gmail.com","7987066567"))
        myDalaList.add(UsersData("Yash","y@gmail.com","7987066589"))
        myDalaList.add(UsersData("Jai","j@gmail.com","7987066528"))
        myDalaList.add(UsersData("Akshara","a@gmail.com","7987066567"))
        myDalaList.add(UsersData("Yash","y@gmail.com","7987066589"))

        myrv.adapter=MyAdaptor(myDalaList)



    }
}