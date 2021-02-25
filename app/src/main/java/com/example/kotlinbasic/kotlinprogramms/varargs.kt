package com.example.kotlinbasic.kotlinprogramms

fun main() {
adds(10,20,30)
}


fun adds(vararg values:Int){
    for (elements in values){
        println(elements)
    }
}