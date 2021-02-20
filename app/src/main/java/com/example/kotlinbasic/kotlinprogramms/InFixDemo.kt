package com.example.kotlinbasic.kotlinprogramms

fun main() {

    val bus = Buses("Pun Bus")
//    bus.addMoreBus("PRTC")
    bus addMoreBus "PRTC"
}

infix fun Buses.addMoreBus(busType:String){
    busTypes.add(busType)
    busTypes.forEach { println(it) }
}

class Buses(firstBus:String){
     var busTypes = mutableListOf<String>()
    init {
        busTypes.add(firstBus)
    }
}


/*
//doc
In this article, we will learn infix notation used in Kotlin functions. In Kotlin, a functions marked with infix keyword can also be called using infix notation means calling without using parenthesis and dot.

There are two types of infix function notation in Kotlin-

Standard library infix function notation
User defined infix function notation

First of all, we defined the infix the infix notation function within a class math because it must be member function.
2. infix keyword used to mark the function.
3. It contains only one parameter and having no default value and function return type is also Integer.*/
