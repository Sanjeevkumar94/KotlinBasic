package com.example.kotlinbasic.kotlinprogramms

fun main() {

   /* val circle = Circle()
    val player = Player()

    val array:Array<Draggable> = arrayOf(circle,player)
    for (obj in array){
        if(obj is Circle){
            obj.sayCircleName()
        } else {
            (obj as Player).sayPlayerName()
        }
    }

    */

    val samrala:Ludhiana = Samrala()
    val mor:Ludhiana = Morinda()

    val arrayCity:Array<Ludhiana> = arrayOf(samrala,mor)

    for(obj in arrayCity){
        if(obj is Samrala){
            println(obj.cityNameSam())
        } else {
            println((obj as Morinda).cityNameMor())
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


open class Ludhiana {
    fun cityNameLdh() = "Ludhiana"
}

class Samrala :Ludhiana(){
    fun cityNameSam() = "Samrala"

}
class Morinda :Ludhiana(){
    fun cityNameMor() = "Morinda"
}