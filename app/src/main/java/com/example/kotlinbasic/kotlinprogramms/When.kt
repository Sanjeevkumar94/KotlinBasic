package com.example.kotlinbasic.kotlinprogramms

fun main() {
    val animal = "Dog"
    /* when(animal){
         "Cat" -> print("Animal is Cat")
         "Dog" -> print("Animal is Dog")
         "Tiger" -> print("Animal is Tiger")
         else->  print("Animal Not Found")
     }
     output:Animal is dog*/

    ///when as experssion<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    /*val result =  when(animal){
         "Dog" -> "Animal is Dog"
         "Cat" -> "Animal is Cat"
         "Tiger" -> "Animal is Tiger"
         else-> "Animal Not Found"
     }
     print(result)
     output:Animal is Dog*/

    //When with Range<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

/*    val number = 61
    val result = when(number){
        in 1..9 -> "Child age"
        in 10..19->"Teen age"
        in 20..60-> "Young age"
        else ->"Near Death Age"
    }
    print(result)

    output:Near Death Age*/


    //Multiple branches of when
    //We can use multiple branches of condition separated with a comma. It is used, when we need to run a same logic for multiple choices<<<<<<<<<<<<<<<<<<<<<<<<

    val month = "April"
    val reult = when (month) {
        "Jan", "Feb", "March" -> "Winter season"
        "April", "May", "June", "July" -> "Rainy season"
        else -> "autumn season"

    }
    print(reult)
}