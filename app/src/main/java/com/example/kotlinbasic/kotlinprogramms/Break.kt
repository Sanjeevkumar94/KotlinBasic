package com.example.kotlinbasic.kotlinprogramms

fun main() {
    // break<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 /*   for (i in 1..10){
        if(i==3){
            break
        }
        println(i)
    }
    output:1
            2   */

    //continue<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

   /* for (i in 1..10){
        if(i==3){
            continue
        }
        println(i)
    }

    output:1
    2
    4
    5
    6
    7
    8
    9
    10*/



    for(i in 1..10){
        for(i in 1..10){
            println("inside$i")
            if(i==3)
               break
        }
        println("outside$i")
    }
}