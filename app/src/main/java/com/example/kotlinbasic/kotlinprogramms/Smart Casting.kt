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

//    val arrayCity = arrayOf(samrala,mor)
    val arrayCity = arrayOf(samrala,mor,Abc())
  /*  // error Exception in thread "main" java.lang.ClassCastException: com.example.kotlinbasic.kotlinprogramms.Abc cannot be cast to com.example.kotlinbasic.kotlinprogramms.Morinda
    at com.example.kotlinbasic.kotlinprogramms.Smart_CastingKt.main(Smart Casting.kt:28)
    at com.example.kotlinbasic.kotlinprogramms.Smart_CastingKt.main(Smart Casting.kt)
*/
    for(obj in arrayCity){
        if(obj is Samrala){
            println(obj.cityNameSam())
        } else if(obj is Morinda) {
            println((obj as Morinda).cityNameMor())
        } else{
            (obj as Abc).abcHello()
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

class Abc {

    fun abcHello(){
        println("ABC Hello")
    }
}