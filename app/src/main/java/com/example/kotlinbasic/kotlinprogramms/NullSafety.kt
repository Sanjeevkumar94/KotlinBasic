package com.example.kotlinbasic.kotlinprogramms

import android.text.TextUtils

fun main() {
    var gender = "Male"  // not - nullable

    var gender2:String? = "Sanj"
    var gender3:String? = "null"
    var isAdult:Boolean?=null  // nullable

 /*   if (gender2 != null) {
        println(gender2.toUpperCase())
    } else{
        println("it is Null")
    }

    if (gender3 != null) {
        println(gender3.toUpperCase())
    } else{
        println("it is Null")
    }     //

    println(gender2?.toUpperCase())*/

   /* gender2?.let {
        println("Hello")
        println(gender2)
        println(it)
    }*/

    var selectedValue = gender3 ?: "NA"        //   Elvis Operator
    println(selectedValue)

    var value = gender3!!.toUpperCase()  // not null asserted operator

}


//doc

/*
Nullable Types
Nullable types are declared by putting a ? behind the String as:

var str1: String? = "hello"
str1 = null // ok
Kotlin example of nullable types

fun main(args: Array<String>){
    var str: String? = "Hello" // variable is declared as nullable
    str = null
    print(str)
}
Output:

null


Non Nullable Types
Non nullable types are normal strings which are declared as String types as:

val str: String = null // compile error
str = "hello" // compile error Val cannot be reassign
var str2: String = "hello"
str2 = null // compile error
What happens when we assign null value to non nullable string?

fun main(args: Array<String>){
    var str: String = "Hello"
    str = null // compile error
    print(str)
}
Output:

It will generate a compile time error.

Error:(3, 11) Kotlin: Null can not be a value of a non-null type String*/
