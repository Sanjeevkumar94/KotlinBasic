package com.example.kotlinbasic.kotlinprogramms

fun main() {
    var nestedObj = OuterClass.NestedClass()
    nestedObj.show()
//    nestedObj.a // can not access outerclass  properties

    var innerObj = OuterClass().InnerClass()
    innerObj.display()
//    innerObj.a  // can not access outerclass  properties
}


class OuterClass{
    var a:Int = 0
    class NestedClass{
        fun show(){
            println("Hi Nested Class")
//            println(a) // can not access Nested class can not access var of outer class.
        }
    }

    inner class InnerClass{
        var i:Int = 0
        fun display(){
            println("Hi Inner Class")
            println(i)
        }
    }
}