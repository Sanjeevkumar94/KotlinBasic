package com.example.kotlinbasic.kotlinprogramms

fun main() {

    val fn: (a: Double, b: Double) -> Double = ::sum // assign function in variable
//    println(fn(10.0,20.0))
    calculator(10.0,20.0,fn)
    calculator(10.0,20.0,::sum)

}

fun sum (a:Double,b:Double):Double{
    return a+b
}

fun calculator(a:Double,b:Double,gn:(Double,Double)->Double){
    val result = gn(a,b)
    println(result)
}