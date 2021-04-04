package com.example.assessment

import java.util.*;
import kotlin.math.PI

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    println("========PERIMETER AND AREA========")
            println("Enter the radius:")
            val r: Int = read.nextInt()
            println("Enter the shape: \n1.Perimeter \n2.Area")
            val m = read.nextInt()
            if (m==1) {
                val p = 2 * PI * r
                println("Perimeter=$p")
            }
            else if(m==2)
            {
                val a= PI *r *r
                println("Area=$a")
            }
           val side: Double = (2* PI*r)/4
           println("Side of square=$side")




}