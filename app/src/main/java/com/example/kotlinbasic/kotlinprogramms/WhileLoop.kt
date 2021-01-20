package com.example.kotlinbasic.kotlinprogramms

fun main() {
    var i =1
   /* while (i<=10){
        println("Hello")
        i++
    }

    do {
        println("Hello")
        i++
    } while (i<=10)*/


   /* for (i in 1..10){
        println("Hello")
    }*/

   /* for (i in 1..10 step 2){
        println("Hello")
    }*/

   /* for (i in 1 until 5){
        println("Hello")
    }
*/

    /*for (i in 10 downTo 1){
        println(i)
    }*/

    var table =2

    for (i in 1..10){
        println("$table x $i = ${table*i}")
    }

}