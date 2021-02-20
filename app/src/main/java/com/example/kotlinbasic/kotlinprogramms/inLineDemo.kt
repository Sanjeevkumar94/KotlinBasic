package com.example.kotlinbasic.kotlinprogramms

fun main() {

    calculateTimeAndRun{
        loop(1000)}
}

inline fun calculateTimeAndRun(fn:()->Unit){   // is ke liye class banti hai fir instance banata hai uske baad use kr pate hai

    val start = System.currentTimeMillis();
    fn()
    val end = System.currentTimeMillis()
    println("Time taken ${end - start} ms")
}

fun loop(n:Long){
    for (i in 1..n){
        //
    }
}


/*
//doc
Inline Function
An inline function is declare with a keyword inline. The use of inline function enhances the performance of higher order function. The inline function tells the compiler to copy parameters and functions to the call site.

The virtual function or local function cannot be declared as inline. Following are some expressions and declarations which are not supported anywhere inside the inline functions:

Declaration of local classes
Declaration of inner nested classes
Function expressions
Declarations of local function
Default value for optional parameters*/
