package com.example.kotlinbasic.kotlinprogramms

fun main() {
  /* var a = InterfaceDemo()
    a.show()      // Hello
    a.show2()     //Class Show2*/

    funCall(InterfaceDemo())
    funCall(InterfaceDemo2())
}


fun funCall(objects:i1 ){
    objects.show()
}

interface i1 {
    var s:String
    val name:String
    get()  ="Hello"
    fun show()
    fun show2() = println("Interface1 Show")
}

interface i2 {
    fun show2() = println("Interface2 Show")
}

class InterfaceDemo:i1,i2{
    override fun show() = println("InterfaceDemo Show")
    override var s: String = "Hi"
    override fun show2() {
        super<i2>.show2()
        println("Class Show2")
    }
}

class InterfaceDemo2() :i1{
    override var s: String = "Hi"
    override fun show() {
        println("InterfaceDemo2 Show")
    }
}