package com.example.kotlinbasic.kotlinprogramms

fun main() {
//    println("Hi Sanj".formattedString())
    println(MyClass().display())
    println(MyClass.show2())
}

fun String.formattedString() = "-------------------------\n$this\n---------------------"

fun MyClass.display() = "Display"
fun MyClass.Companion.show2() = "j&k"

//doc


/*
Kotlin Extension Function
Kotlin extension function provides a facility to "add" methods to class without inheriting a class or using any type of design pattern. The created extension functions are used as a regular function inside that class.

The extension function is declared with a prefix receiver type with method name.

fun <class_name>.<method_name>()
In the above declaration, <class_name> is a receiver type and the <method_name>() is an extension function.*/
