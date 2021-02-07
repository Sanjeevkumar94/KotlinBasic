package com.example.kotlinbasic.kotlinprogramms

fun main() {
     var testObj = object {
        private var a:Int = 10
        fun Show() = "Hello i am object experssion"
    }
    println(testObj.Show())

var testObj2 = object :Cloneable {
    override fun showData() {
        println("show Data")
    }
}
    testObj2.showData()

}
interface Cloneable {
fun showData()
}