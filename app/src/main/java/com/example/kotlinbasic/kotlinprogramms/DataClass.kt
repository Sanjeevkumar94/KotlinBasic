package com.example.kotlinbasic.kotlinprogramms

fun main() {
/*val p1 = Persons(1,"Sanj")
val p2 = Persons(2,"Lucky")
    println(p1==p2)      //false
    println(p1)          //com.example.kotlinbasic.kotlinprogramms.Persons@5cad8086
    println(p1.hashCode()) //1554874502*/

    val p3 = DataClass("Ram","Sanj")
    val p4 = DataClass("Ram","Sanj")

    println(p3)               //DataClass(name=Ram, fname=Sanj)
    println(p3.hashCode())    //5108844
    println(p3==p4)           //true

    var p5 = p3.copy()
    println(p5)             //DataClass(name=Ram, fname=Sanj)

    var p6 = p3.copy(name="Sham")
    println(p6)              //DataClass(name=Sham, fname=Sanj)

    val(name,fname) = p3
    println("$name $fname")   //Ram Sanj

    println(p5.component1())
    println(p5.component2())
}


class Persons(val id:Int,val name:String){
}

data class DataClass(var name:String,var fname:String)