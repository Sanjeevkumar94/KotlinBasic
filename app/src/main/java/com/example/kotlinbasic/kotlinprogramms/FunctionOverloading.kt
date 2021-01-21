package com.example.kotlinbasic.kotlinprogramms

fun main(){
   /* println(add(10,20))
    println(add(10.0,20.0))*/

/*    //named Argument
    add(b=10,a=20)*/


    //assign function to variable
    var fn =::add
    println(fn(10,20))
}


//Function Overloading<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
/*
fun add(a:Int,b:Int) = a+b
fun add(a:Double,b:Double)=a+b*/

//Named Arguments<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

/*fun add(a:Int,b:Int){
    println("value of a is $a")
    println("value of b is $b")
}*/

fun add(a:Int,b:Int) = a+b
