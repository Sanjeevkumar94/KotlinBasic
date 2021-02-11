package com.example.kotlinbasic.kotlinprogramms

fun main() {

    var day = Day.SATURDAY
    var mDay = Day.MONDAY
/*    println(Day.FRIDAY)
    println(day.number)
    println(day.printDay())
    println(Day.MONDAY.printDay())

    for(i in Day.values()){
        println(i)
        println(i.number)
    }*/

    /*println(day.name)
    println(day.ordinal)*/
/*    println(day.printDay())
    println(Day.getAlldays())*/
    println(day.printlParticularName(day))
    println(mDay.printlParticularName(day))
   /* for (obj in Day.values()){
        println("${obj.name} is weekend ${obj.isWeekend}")
    }*/
}


enum class Day(var number:Int,var isWeekend:Boolean=false){
    MONDAY(1),            //monday,tuesday all are objects.
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6,true),
    SUNDAY(7,true);

    fun printDay(){
        println("Day is ${this.isWeekend}")
        for (obj in Day.values()) {
            println("${obj} is weekend ${obj.isWeekend}")
        }
    }

    fun printlParticularName(obj:Day){
        println(obj.name)
        println(obj.ordinal)
        println(obj.isWeekend)

        println(this.name)
        println(this.ordinal)
        println(this.isWeekend)


    }

    companion object {
        fun getAlldays() {
            for (obj in Day.values()) {
                println("${obj.name} is weekend ${obj.isWeekend}")
            }
        }
    }
}





//doc
/*
In programming, sometimes there arises a need for a type to have only certain values. To accomplish this, the concept of enumeration was introduced. Enumeration is a named list of constants.
In Kotlin, like many other programming languages, an enum has its own specialized type, indicating that something has a number of possible values. Unlike Java enums, Kotlin enums are classes.

Some important points about enum classes in kotlin –

Enum constants aren’t just mere collections of constants- these have properties, methods etc
Each of the enum constants acts as separate instances of the class and separated by commas.
Enums increases readability of your code by assigning pre-defined names to constants.
An instance of enum class cannot be created using constructors.*/

/*

enum vs Sealed
        enum mein ek value ek instaite hota hai jo ek baar ban gaya vo ban gaya
*/
