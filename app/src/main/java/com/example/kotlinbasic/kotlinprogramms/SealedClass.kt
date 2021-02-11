package com.example.kotlinbasic.kotlinprogramms


fun main() {

/*    var tile = Red("Mushroom",25)
    var tile2 = Red("Fire",30)
    println("${tile.points} is ${tile.type}")*/

    val tile1:Tile = Red("Red Ball",20)
    val tile2:Tile = Blue("Blue Ball",20)

      println(when(tile2) {
        is Red ->  tile2.points +10
        is Blue ->  tile2.points+20
    })

}


sealed class Tile     // it is abstract class you can not create object
class Red(val type:String,val points:Int) :Tile()
class Blue(val type:String,val points:Int):Tile()






// doc

/*
Kotlin provides an important new type of class which is not present in Java. These are known as sealed classes. As the word sealed suggests, sealed classes conform to restricted or bounded class hierarchies. A sealed class defines a set of subclasses within it. It is used when it is known in advance that a type will conform to one of the subclass types. Sealed classes ensure type-safety by restricting the types to be matched at compile-time rather than at runtime.

To define a sealed class, just precede the class modifier with the sealed keyword. The sealed classes also have one another distinct feature, their constructors are private by default.

A sealed class is implicitly abstract and hence it cannot be instantiated.

Note: All the subclasses of the sealed class must be defined within the same Kotlin file. However, it not necessary to define them within the sealed class, they can be defined in any scope where the sealed class is visible.
*/




