package com.example.genesisrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdaptor(var userlist:ArrayList<UsersData>) : RecyclerView.Adapter<MyAdaptor.MyViewHolder>() {

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun holdingViews(users:UsersData){

            var myName = itemView.findViewById<TextView>(R.id.textViewname)
            var myEmail = itemView.findViewById<TextView>(R.id.textViewemail)
            var myPhone = itemView.findViewById<TextView>(R.id.textViewmobile)

            myName.setText(users.name)
            myEmail.setText(users.email)
            myPhone.setText(users.phone)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var v= LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {

        return userlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.holdingViews(userlist[position])
    }

}