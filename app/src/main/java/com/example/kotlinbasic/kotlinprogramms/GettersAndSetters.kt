package com.example.kotlinbasic.kotlinprogramms

fun main() {

  var student2 = Student2("sanj kumar",23)
    println(student2.userName)

    student2.userMarks = 23
}


class Student2(name:String,marks:Int){
    var userName:String=name
        get() {
            return field.toUpperCase()
        }
    var userMarks:Int=marks
    set(value) {
        if(value>33){
            println("You are pass")
        } else{
            println("You are fail")

        }
    }


    //by dafault getter and setter
    var email:String =""
    get() = field
    set(value){
        field = value
    }
}