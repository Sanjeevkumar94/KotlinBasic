package com.example.kotlinbasic.kotlinprogramms

fun main() {

  var student2 = Student2("sanj kumar")
    println(student2.userName)
}


class Student2(name:String){
    var userName:String=name
    get() {
        return field.toUpperCase()
    }

}