package com.example.kotlinbasic.kotlinprogramms

fun main() {
val ram = Person("Ram Singh")
    print(ram.name)

}


class Person(val name:String){
    //primary constructor .
    // if we use var or val then it become member varriable of Class.
    // if we don't use then it become only parametter variables. for become a class member variable we need to use it on init  block

}