package com.example.assessment

import java.util.*
fun main(args: Array<String>){

    println("=========BILL AMOUNT AND DISCOUNT==============")
    val read = Scanner(System.`in`)
    println("Enter the total numbner of items: ")
    val h=read.nextInt()
    var h1=1
    var s=0
    while (h1<=h) {
        println("Enter the price of item:")
        val p = read.nextInt()
        s = s + p
        h1++
    }
    println("Total amount ot be paid is $s")
    var d= s * 0.15
    println("Amount of 15% discount is $d")
    var f= s - d
    println("Amount after discount is $f")

}