package com.example.kotlinbasic.kotlinprogramms

fun main(){
    val banga = Banga()
    println(banga.a)
//    banga.c       // can not access because protected

    println(banga.add())

    val bang2 = Banga2()
//    bang2.b            // can not access because private

    val banga3 = Banga3()
    println(banga3.a)
    println(banga3.showValue())
//    println(banga3.d)    // can not access because it is protected.

}