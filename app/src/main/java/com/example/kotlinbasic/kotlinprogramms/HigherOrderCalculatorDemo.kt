package com.example.kotlinbasic.kotlinprogramms

fun main() {
calculator(20,10,"minus",::sum)
    calculator(30,30,"Add") { x,y,operation->
        if(operation=="Add")
            x+y
        else
            x-y
    }
}

fun sum(a:Int,b:Int,operation:String):Int{
    return if(operation=="Add") a.plus(b) else a.minus(b)
}

fun calculator(a:Int,b:Int,operation:String,fn:(Int,Int,String)->Int){
    println(fn(a,b,operation))
}


