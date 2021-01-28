package com.example.kotlinbasic.kotlinprogramms

fun main() {
    var student = Students("Sanj",20)
}


open class Persons (var a:String){

   init {
       println("Run First$a")
   }
}


class Students: Persons {
    constructor(name:String,age:Int):this(name){
    println("Run Third")
    }

    constructor(s:String):super(s){
        println("Run Second")
    }
}