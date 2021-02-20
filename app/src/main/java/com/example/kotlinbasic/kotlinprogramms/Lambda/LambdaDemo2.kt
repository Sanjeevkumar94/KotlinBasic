package com.example.kotlinbasic.kotlinprogramms.Lambda

fun main() {
/*    wish { namaste() } //kotlin.Unit  beacuse wish return type is Unit
      wish2 { namaste() } //Namste beacuse wish2 return type is String
      wish2 { namasteWithParms(10,20,30) } //10 saying Namste*/

//    wish3(10,20,{namasteWithParms(10,20,30)}) // 10 saying Namste
//    wish3(10,20,::namasteWithParms(10,20,30)) //This syntax is reserved for future use; to call a reference, enclose it in parentheses: (foo::bar)(args)

//     wish3(10,20,::namasteWithParms2)  //10 saying Good Morning

    wish4 {            // it is direct body of wish4 lambda wothout variables. it is possible if lamda has one var or 0 var if mabda has more then 2 var then it will generate error.
        namasteWithParms(10,20,30)
    } //10 saying Namste // if wish4 have 1 var or 0 var then it will not generate any error
//    wish5 { namasteWithParms(10,20,30) } //Expected 2 parameters of types Int, Int //if wish5 have 2 var or more var then it will  generate  error
    wish5 { i: Int, i1: Int -> namasteWithParms(i,i1,30) } //12320 saying Namste


}



fun wish(fn:()->Unit){
   println(fn())
}

fun wish2(fn:(a:Int)->String){
   println(fn(20))
}

fun wish3(a: Int,b:Int,fn:(a:Int)->String){
   println(fn(a))
}
fun namaste():String {
    return "Namste"
}
fun namasteWithParms(n:Int,a: Int,b:Int):String {
    return "$n saying Namste "
}

fun namasteWithParms2(n:Int):String {
    return "$n saying Good Morning "
}

fun wish4(fn:(a:Int)->String){
    println(fn(10))
}

fun wish5(fn:(a:Int,b:Int)->String){
    println(fn(12320,20))
}


