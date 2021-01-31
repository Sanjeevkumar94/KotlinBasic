package com.example.kotlinbasic.kotlinprogramms

fun main() {
    var bus:Bus = AcBus()
    println(bus.busType())    // late binding kyunki bus variable ka type ni dekha jaa raha yeh dikha jaa rr hai ki bus variable ke andhar kosi class ka object ha. bus type ka varivale ACBus ke unhi method ko call kr sakta hai jo override hai jo ACBus ke khud ke method haiunko call ni kr sakta .
//    bus.seats() // error because yaha Early Binding hai
    println(bus.gear("Ordinary")) // yeh overloading isne parent ke hi gear ko call kiya kyunki yaha early binding ho ri hai yaha compile time pr hi dekha gaya ki reference variable konse type ka hai .
}

open class Bus {
   open fun busType() = "Ordinary Bus"
    fun gear(s:String) = s
}

class AcBus:Bus(){
 override fun busType() = "AC Bus"
    fun seats () = "70"
    fun gear(s:Int) = s

}