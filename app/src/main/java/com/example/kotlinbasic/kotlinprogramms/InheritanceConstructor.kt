package com.example.kotlinbasic.kotlinprogramms

fun main() {
    var b = B1("Sanj")


}


open class  A1{

    constructor(s:String){

    }
    init {
        println("first Call")
    }
}

class B1(var sa:String):A1(sa){

    init {
        println("Second call")
    }

}