package com.example.kotlinbasic.kotlinprogramms

fun main() {
/*    var lambda1 = {x:Int,y:Int->x+y}
    println(lambda1(10,20))*/

/*    var multiLinedLambda = {
        println("Hello")
        2 //last line is return type
    }
    println(multiLinedLambda())*/

/*    var singleParamLambda ={x:Int->x*x}
    println(singleParamLambda(2))*/


/*    var singleParamLambdaWithDefineType:(Int)->Int = {x->x*x}
    println(singleParamLambdaWithDefineType(2))*/

 /*   var simplySingleParamLambda:(Int)->Int = {it*it}
    println(simplySingleParamLambda(2))*/


    /*  val sayHi = {msg:String-> println(msg)}
      sayHi("Hi Sanj")*/

 /*   val sayHi2:(String)->Unit = {msg-> println(msg)}
    sayHi2("Hi Sanj")
*/

    calculator2(10,20,{x,y->x+y}) // with lambda
    calculator2(20,40,::sum2) // withFunction Type
    val fn: (a: Int, b: Int) -> Int = ::sum2 // assign function in variable
    calculator2(20,40,fn) // withFunction Type
}
fun sum2 (a:Int,b:Int):Int{
    return a+b
}

fun calculator2(a:Int,b:Int,fn:(Int,Int)->Int){
    println(fn(a,b))
}