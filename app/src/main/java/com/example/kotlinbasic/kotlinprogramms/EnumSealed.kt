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
/*    println(day.printlParticularName(day))
    println(mDay.printlParticularName(day))*/
   /* for (obj in Day.values()){
        println("${obj.name} is weekend ${obj.isWeekend}")
    }*/

/*
    Seasons.Winter.foo()
*/



  println(WhenEx.SelectDay(WhenEx.MONDAY))
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

/*Enums as Anonymous Classes –
Enum constants also behaves as anonymous classes by implementing their own functions along with overriding the abstract functions of the class. The most important thing is that each enum constant must be override.*/

enum class Seasons(var weather:String){

    Summer("hot") {
        override fun foo() {
            println("Hot days of a year")
        }
    },
    Winter("cold") {
        override fun foo() {
            println("Cold days of a year")
        }
    },
    Rainy("moderate") {
        override fun foo() {
            println("Rainy days of a year")
        }
    };

    abstract fun foo()
}

/*
Usage of when expression with enum class –
A great advantage of enum classes in Kotlin comes into play when they are combined with the when expression. The advantage is since enum classes restrict the value a type can take, so when used with the when expression and the definition for all the constants are provided, then the need of the else clause is completely eliminated. In fact, doing so will generate a warning from the compiler.*/



enum class WhenEx{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    companion object {
        fun SelectDay(obj: WhenEx): String {
            return (when (obj) {
                SUNDAY -> "Roday is Sunday"
                MONDAY -> {"Roday is MONDAY"
                            "Today is Monday" }
                TUESDAY -> "Roday is TUESDAY"
                WEDNESDAY -> "Roday is WEDNESDAY"
                THURSDAY -> "Roday is THURSDAY"
                FRIDAY -> "Roday is FRIDAY"
                SATURDAY -> "Roday is SATURDAY"

            })
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
