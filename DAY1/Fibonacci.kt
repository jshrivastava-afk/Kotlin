package com.example.assessment

import java.util.*

fun main(args: Array<String>)
{
    println("==============Fibonacci Series=============")
    val read = Scanner(System.`in`)
    println("Enter the numbner: ")
    val h=read.nextInt()
    var h1= 0
    var h2=1
    var c=0
    while (c<=h)
    {
       println(h1)
        var h3= h1+h2
        h1=h2
        h2=h3
        c=c+1
    }
}