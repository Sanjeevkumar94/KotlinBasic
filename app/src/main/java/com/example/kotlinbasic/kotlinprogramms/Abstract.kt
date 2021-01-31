package com.example.kotlinbasic.kotlinprogramms

fun main() {

//    var a = AbstractEx()  // error Cannot create an instance of an abstract class
    var b = AbstractEx2()
    println(b.display())
    println(b.show())
    println(b.addAccount())
    println(b.a)

//
    var c:AbstractEx = AbstractEx2()
    println(c.show())
//    println(c.addAccount())   // giving error

    println(c.a)


}

abstract class AbstractEx {
  abstract fun display():String
  open fun show() = "AbstractEx Show called"
  abstract var a:String

}

class AbstractEx2:AbstractEx() {
    override fun display() = "AbstractEx2 display called"
    override fun show() = "AbstractEx2 Show called"
    fun addAccount () = "Add account"
    override var a: String = "Hello"

}