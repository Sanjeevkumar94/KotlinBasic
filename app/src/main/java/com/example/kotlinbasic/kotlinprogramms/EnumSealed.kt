package com.example.kotlinbasic.kotlinprogramms

fun main() {

    var day = Day.SATURDAY
    println(Day.FRIDAY)
    println(day.number)
    println(day.printDay())
    println(Day.MONDAY.printDay())

    for(i in Day.values()){
        println(i)
        println(i.number)
    }
}


enum class Day(var number:Int){
    MONDAY(1),            //monday,tuesday all are objects.
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun printDay(){
        println("Day is $this")
    }
}