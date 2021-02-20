package com.example.kotlinbasic.kotlinprogramms

fun main() {
    println("Hi Sanj".formattedString())
}

fun String.formattedString() = "-------------------------\n$this\n---------------------"