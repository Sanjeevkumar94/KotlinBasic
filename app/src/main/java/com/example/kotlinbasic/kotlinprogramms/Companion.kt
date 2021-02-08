package com.example.kotlinbasic.kotlinprogramms

fun main() {
MyClass.show()
MyClass.show()
MyClass.show()

}


class MyClass{

    companion object  {
        var a = 0
        fun show(){
            println(++a)
        }
    }
}
