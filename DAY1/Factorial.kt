package com.example.assessment

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    println("Enter  the Number: ")
    val z = reader.nextInt()
    var f  = 1
    var factorial: (Int) -> Unit ={ z:Int -> for(k in 1..z) { f *= k } }
    factorial(z)
    print("The facorial of $z is $f")
}