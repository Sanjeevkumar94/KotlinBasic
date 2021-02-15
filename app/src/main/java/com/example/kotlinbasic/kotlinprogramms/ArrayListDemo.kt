package com.example.kotlinbasic.kotlinprogramms

fun main() {

    var cityNames = ArrayList<Any>()
    cityNames.add("Ludhiana")
    cityNames.add("Ferozpur")
    cityNames.add("Sri Ganganagar")
    cityNames.forEach { print(it) }

    var stateNames = arrayListOf<Any>()
    stateNames.add("Punjab")
    stateNames.add("J&K")
    stateNames.add("Bihar")

    stateNames.forEach { println(it) }



}









/*

doc

Kotlin ArrayList class
Kotlin ArrayList class is used to create a dynamic array. Which means the size of ArrayList class can be increased or decreased according to requirement. ArrayList class provides both read and write functionalities.
Kotlin ArrayList class follows the sequence of insertion order. ArrayList class is non synchronized and it may contains duplicate elements. The elements of ArrayList class are accessed randomly as it works on index basis.*/

/*
Kotlin ArrayList: arrayListOf()
An arrayListOf() is a function of ArrayList class. ArrayList is mutable which means it provides both read am write functionalities. The arrayListOf() function returns an ArrayList type.*/
