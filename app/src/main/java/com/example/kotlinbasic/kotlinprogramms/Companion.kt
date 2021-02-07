package com.example.kotlinbasic.kotlinprogramms

fun main() {
MyClass.show()
MyClass.show()
MyClass.show()

}


class MyClass{
    companion object MyObject {
        var a = 0
        fun show(){
            println(++a)
        }
    }
}