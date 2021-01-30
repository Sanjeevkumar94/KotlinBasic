package com.example.kotlinbasic.kotlinprogramms

fun main() {

    var simplePhn = Mobile()
    simplePhn.callingDisplay()
    println(simplePhn.name)

    var smartMobile = Samsung()
    smartMobile.callingDisplay()
    println(smartMobile.name)
    println(smartMobile.toString())

}


open class Mobile() {
   open var name:String ="Mobile"
   open fun callingDisplay() = println("Simple Display")
    fun sim2GType() =println("2 G Sim")

}

class Samsung:Mobile() {
     override var name:String = "Samsung Mobile"
    override fun callingDisplay() {
        super.callingDisplay()
        println("Samsung Display")
        super.sim2GType()
        this.sim4GType()
    }
    fun sim4GType() = println("4 G Sim")

    override fun toString(): String {
        return "Sanjeev kumar"
    }


}