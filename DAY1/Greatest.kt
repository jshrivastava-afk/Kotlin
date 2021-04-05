package com.example.assessment

import java .util.*;
fun main(args:Array<String>)
{
    val reader = Scanner(System.`in`)
    println("Enter the Size of Array: ")
    val a = reader.nextInt()
    var num = Array(a){0}
    for (i in 0..a-1)
    {
        println("Enter the ${i+1} element in array")
        var b: Int = reader.nextInt()
        num[i]=b
    }

    println("Elements in the array are:")
    for (i in num) {
        println(i)
    }
    var n = num.size
    var large =  num[0]
    var l : (Int) -> Unit = { l: Int ->
        for (i in 1..n - 1) {
            if (num[i] > large)
            {
                large = num[i]
            }
        }
    }
    l(num[0])
    println("Largest number in array is $large")
    var small =  num[0]
    var s : (Int) -> Unit = { s: Int ->
        for (i in 1..n - 1) {
            if (num[i] < small)
            {
                small = num[i]
            }
        }
    }
    s(num[0])
    println("Smallest number in array is $small")
}