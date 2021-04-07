package com.example.genesisfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.blue_frag.view.*

class BlueFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.blue_frag,container,false)

        v.buttonfrag.setOnClickListener {

            var redFrag=RedFragment()
            var myName="JAI"
            var b=Bundle()
            b.putString("key",myName)
            redFrag.arguments=b

            fragmentManager!!.beginTransaction().replace(R.id.yellow_layout,redFrag).commit()
        }

        return v
    }
}