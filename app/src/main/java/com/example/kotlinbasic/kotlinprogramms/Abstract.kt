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



/*
doc

A class which is declared with abstract keyword is known as abstract class.
An abstract class cannot be instantiated. Means, we cannot create object of abstract class.
The method and properties of abstract class are non-abstract unless they are explicitly declared as abstract.
Declaration of abstract class
abstract class A {
    var x = 0
    abstract fun doSomething()
}

Abstract classes are partially defined classes, methods and properties which are no implementation but must be implemented into derived class.
If the derived class does not implement the properties of base class then is also meant to be an abstract class.

Abstract class or abstract function does not need to annotate with open keyword as they are open by default.
Abstract member function does not contain its body.
The member function cannot be declared as abstract if it contains in body in abstract class.*/
