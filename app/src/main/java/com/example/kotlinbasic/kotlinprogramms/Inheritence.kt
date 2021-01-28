package com.example.kotlinbasic.kotlinprogramms

fun main() {

    var b = B()
    println(b.name)
    println(b.fname)
}



open class A {
    var name:String="Sanjeev Kumar"
}

class B:A(){
    var fname:String="Arjun Singh"
}