package com.example.kotlinbasic.kotlinprogramms

/*Kotlin Set Interface
Kotlin Set interface is a generic unordered collection of elements. Set interface does not support duplicate elements. This interface is immutable in nature its methods supports read-only functionality of the set.
Set interface uses setOf() function to create the list of object of set interface which contains list of elements.*/

/*Kotlin MutableSet Interface
Kotlin MutableSet interface is a generic unordered collection of elements. MutableSet interface does not support duplicate elements. This interface is mutable so its methods support read-write functionality supports adding and removing elements.
Set interface uses mutableSetOf() function to create the list of object of set interface which contains list of elements.*/
fun main() {

    var names = setOf<String>("Sanj","Lucky","Sanj")
   /* names.forEach {
        println(it)         // Sanj,Lucky
    }
*/
//    println(names.get(0))   // there is no get function in set


    var cityNames = mutableSetOf<Any>()
   /* cityNames.add("Chd")
    cityNames.add("Chd")
    cityNames.add("Kharar")
    cityNames.add("Morinda")*/

    cityNames.addAll(names)

    for(obj in cityNames){
        println(obj)
    }

    println(cityNames)            //[Chd, Kharar, Morinda]


}