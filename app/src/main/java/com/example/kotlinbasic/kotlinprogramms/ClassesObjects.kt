package com.example.kotlinbasic.kotlinprogramms

fun main() {

    val marauti = Car()
    marauti.name = ""
    marauti.Year = 2000
   print(if(marauti.name!=null && marauti.name!="") "name not null" else ("name null"))
}

class Car {
    var name:String?=null
    var Year:Int?=null
    fun carName() = name
}