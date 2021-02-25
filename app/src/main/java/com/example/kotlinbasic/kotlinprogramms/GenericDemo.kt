package com.example.kotlinbasic.kotlinprogramms

fun main() {
//var obj = Container<Int>()
//    obj.setValue(20)
//    println(obj.getValue())

//    var arrayInt = arrayListOf(1,2,3,4,5)
//    var arrayString = arrayListOf<String>("Sanj","Kumar")
//    printValues(arrayInt)
//    printValues(arrayString)

    var genericDemo = GenericDemo<Int>()
    genericDemo.showList(10)
    genericDemo.showList("10")
}




fun <T>printValues(list: List<T>){
    for (elements in list ){
        println(elements)
    }
}

class Container<T>{
    var data:T?=null

    fun setValue(data:T){
        this.data = data
    }
    fun getValue(): T? {
        return  data
    }
}

class GenericDemo<T2> {
    fun <T>showList(a:T){
        println(a)
    }
}