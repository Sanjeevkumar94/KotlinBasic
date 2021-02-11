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













