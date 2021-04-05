package com.example.assessment

import java.util.*;

fun main(args: Array<String>)
{
    val read = Scanner(System.`in`)
    println("========Result========")
    println("Enter the marks of Maths out of 100:")
    var m=read.nextInt()
    println("Enter the marks of Science out of 100:")
    var s=read.nextInt()
    println("Enter the marks of English out of 100:")
    var e=read.nextInt()
    var p= (m+s+e)/3
    println("Percentage of Student:$p")
}