package com.example.kotlinbasic.kotlinprogramms

fun main() {

    val circle = Circle()
    val player = Player()

    val array:Array<Draggable> = arrayOf(circle,player)
    for (obj in array){
        if(obj is Circle){
            obj.sayCircleName()
        } else {
            (obj as Player).sayPlayerName()
        }
    }
}

interface Draggable {
    fun drag()
}

class Circle():Draggable {
    override fun drag() {
        println("Circle drag")
    }
    fun sayCircleName() {
        println("Vishkrma chownk")
    }
}

class Player() : Draggable {
    override fun drag() {
        println("Player drag")
    }

    fun sayPlayerName() {
        println("Sanjeev Kumar")
    }

}