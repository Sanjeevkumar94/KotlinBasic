package com.example.kotlinbasic.kotlinprogramms

fun main() {


    var a = OverloadingInheritance()
    a.add(1,2)

    var b = OverLoading2()
    b.add(2,3)
    b.add(4.0,5.0)

    var b2:OverloadingInheritance = OverLoading2()
    b2.add(6,7)


}


open class OverloadingInheritance{
     fun add (a:Int,b:Int)= a.plus(b)
}

class OverLoading2:OverloadingInheritance() {
     fun add(a: Double, b: Double) =a.plus(b)
}