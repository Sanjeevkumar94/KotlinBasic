package com.example.kotlinbasic.kotlinprogramms

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException
import java.util.concurrent.ExecutionException

fun main() {
/*
    var array = arrayOf(1,2,3)
    try {
        println(array[5])
        println("code inside Try")
    } catch (e:Exception){
        println(e.message)
    }
    println("Code Running Still")*/

  /*  var array = arrayOf(1,2,3)
    try {
        println(array[5])
        println("code inside Try")
    } catch (e:Exception){
        println(e.message.toString())
    }
    finally {
        println("i will run always")
    }
    println("Code Running Still")
*/


/*
    var age = 15

    if(age<18){
       throw ArithmeticException("You can not vote")

        println("inside code")
    } else{
        print("i can vote")
    }

    println("other code")*/

   /* var age =12
try {

    if (age < 18) {
//        throw MyException("You can not vote")
        throw MyException2("try next time")
    } else {
        print("You can vote")
    }
} catch (e:Exception){
    println(e.message)
}

    println("code running still")*/



    println(getNumber(""))
}

class MyException(message:String):Exception(message)
class MyException2:Exception{
    constructor(message: String):super(message){
        println("it is basic error $message")
    }
}

/*

Kotlin try block as an Expression
We can use try block as an expression which returns a value. The value returned by try expression is either the last expression of try block or the last expression of catch. Contents of the finally block do not affect the result of the expression.

Kotlin try as an expression example
Let's see an example of try-catch block as an expression which returns a value. In this example String value to Int which does not generate any exception and returns last statement of try block.*/


fun getNumber(number:String):Int{
    return try {
        Integer.parseInt(number)
    } catch (e:Exception){
        0
    }
}
