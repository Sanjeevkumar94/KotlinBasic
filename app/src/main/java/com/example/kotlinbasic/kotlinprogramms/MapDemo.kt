package com.example.kotlinbasic.kotlinprogramms

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    var studentNames = mapOf<Int,String>(1 to "Sanj",2 to "Mohan",2 to "Ram")
 /*   println(studentNames.get(3))   // null
    println(studentNames.get(2))   // Mohan

    for (obj in studentNames){
        println("${obj.key} ${obj.value}" )
    }*/
/*
    studentNames.forEach { t, u ->
        println("$t is $u")

    }*/



    var mutableName = mutableMapOf<Int,String>()
    mutableName[89] = "Sanj"
    mutableName[0] = "Mohan"
    mutableName[0] = "Sham"
    mutableName.forEach { t, u ->
        println("$t is $u")
    }
}



/*
doc

Kotlin Map Interface
Kotlin Map is an interface and generic collection of elements. Map interface holds data in the form of key and value pair. Map key are unique and holds only one value for each key. The key and value may be of different pairs such as <Int, Int>,<Int, String>, <Char, String>etc. This interface is immutable, fixed size and its methods support read only access.
To use the Map interface we need to use its function called mapOf() or mapOf<k,v>().*/
