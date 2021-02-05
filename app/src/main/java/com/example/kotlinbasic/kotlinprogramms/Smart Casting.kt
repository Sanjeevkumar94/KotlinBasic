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

    /*val samrala:Ludhiana = Samrala()
    val mor:Ludhiana = Morinda()

//    val arrayCity = arrayOf(samrala,mor)
    val arrayCity = arrayOf(samrala,mor,Abc())
  *//*  // error Exception in thread "main" java.lang.ClassCastException: com.example.kotlinbasic.kotlinprogramms.Abc cannot be cast to com.example.kotlinbasic.kotlinprogramms.Morinda
    at com.example.kotlinbasic.kotlinprogramms.Smart_CastingKt.main(Smart Casting.kt:28)
    at com.example.kotlinbasic.kotlinprogramms.Smart_CastingKt.main(Smart Casting.kt)
*//*
    for(obj in arrayCity){
        when (obj) {
            is Samrala -> {
                println(obj.cityNameSam())
            }
            is Morinda -> {
                println((obj as Morinda).cityNameMor())
            }
            else -> {
                (obj as Abc).abcHello()
            }
        }
    }*/


   /* val arra = arrayOf(Chandigarh(),Jalandhar(),Amritsar())
    for (obj in arra){
        when(obj){
            is Chandigarh -> {
                obj.cityNameChandigar()
            }is Jalandhar -> {
                obj.cityNameJalandhar()
            }is Amritsar -> {
                obj.cityNameAmritsar()
            }
        }
    }*/
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


class Chandigarh {
    fun cityNameChandigar(){
        println("Chandigarh")
    }
}
class Jalandhar {
    fun cityNameJalandhar(){
        println("Jalandhar")
    }
}class Amritsar {
    fun cityNameAmritsar(){
        println("Amritsar")
    }
}


//Doc
/*
Type Checking –
In Kotlin, we can check the type of certain variable using the is operator at runtime.
It is a way of checking the type of a variable at runtime to separate the flow for different objects.

In Kotlin, smart type casting is one of the most interesting features available. We use is or !is operator to check the type of variable, and compiler automatically casts the variable to the target type like
Use of !is Operator
Similarly using !is operator we can check the variable.

Note: Smart cast don’t work when the compiler can’t guarantee that the variable cannot change between the check and the usage. Smart casts are applicable according to the following rules:

val local variables always works except for local delegated properties.
val properties works only if the property is private or internal or the check is performed in the same module where the property is declared. Smart casts aren’t applicable to open properties or properties that have custom getters.
var local variables works only if the variable is not modified between the check and the usage, is not captured in a lambda that modifies it, and is not a local delegated property.
var properties – never works because the variable can be modified at any time.*/
