package com.example.kotlinbasic.kotlinprogramms

fun main() {


  /*  var a = OverloadingInheritance()
    a.add(1,2)

    var b = OverLoading2()
    b.add(2,3)
    b.add(4.0,5.0)

    var b2:OverloadingInheritance = OverLoading2()
    b2.add(6,7)*/

    var c = ConstructorOverLoading("Arjun")
}


open class OverloadingInheritance{
     fun add (a:Int,b:Int)= a.plus(b)
}

class OverLoading2:OverloadingInheritance() {
     fun add(a: Double, b: Double) =a.plus(b)
}


class ConstructorOverLoading(var name:String="",var fname:String ="",var age:Int= 0){
    constructor(lname:String):this("dk","whw",45){
        println("Helooo")
    }


    constructor(raavan:Int):this("dk","whw",45){
        println("dfggdfhfghfghgfhgf")
    }

    //giving error primary constructor call expected because every secondary constructor need call to primary constructor with defined.
}