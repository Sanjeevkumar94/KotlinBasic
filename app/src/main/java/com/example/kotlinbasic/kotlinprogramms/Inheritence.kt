package com.example.kotlinbasic.kotlinprogramms

fun main() {

    var b = B()
    var a = A()
    println(b.name)
    println(b.fname)
}



open class A {
    var name:String="Sanjeev Kumar"
}

class B:A(){
    var fname:String="Arjun Singh"
}