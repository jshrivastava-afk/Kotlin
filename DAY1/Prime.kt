package com.example.assessment

import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    println("Enter the number")
    var h = reader.nextInt()
    var q=2;
    while(h>0){
        if(Prime(q)) {
            println(q)
            h--;
            q++
        }
        else {
            q++
        }
    }
}
fun Prime(s:Int):Boolean
{
    var c=0;

    for(k in 1..s){
        if(s%k==0){
            c++
        }
    }
    if(c>2)
    {
        return false
    }
    else
    {
        return true
    }
}