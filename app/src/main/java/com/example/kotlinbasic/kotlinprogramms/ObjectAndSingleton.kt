package com.example.kotlinbasic.kotlinprogramms


fun main() {
    println(ObjectDemo.cityName)
    println(ObjectDemo2.cityName())
}


object ObjectDemo {
    var cityName = "Patiala"
}

object ObjectDemo2 {
    fun cityName() = "Sirhind"
}