package com.example.assessment

import java.util.*

fun main(args: Array<String>)
{
    println("==============Leap Year=============")
    val read = Scanner(System.`in`)
    println("Enter the numbner: ")
    val h=read.nextInt()
    if (h%4==0 && h%400==0)
    {
        println("$h is LEAP YEAR")
    }
    else if (h%100!==0)
    {
        println("$h is LEAP YEAR")
    }
    else
    {
        println("$h is not a LEAP YEAR")

    }
}