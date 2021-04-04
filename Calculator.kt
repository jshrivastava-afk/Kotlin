package com.example.assessment

import java.util.*;

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)
    println("Enter two Numbers:")
    val n1:Int=read.nextInt()
    val n2:Int=read.nextInt()
    println("Enter the following number for operation: \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division")
    val n3:Int=read.nextInt()
    var n4=0
    if (n3==1)
    {
       n4= n1+n2
    }
   else if (n3==2)
    {
        n4= n1-n2
    } else if (n3==3)
    {
     n4= n1*n2
    }  else if (n3==4)
    {
     n4= n1/n2
    }
    println("Result= $n4")
  }
