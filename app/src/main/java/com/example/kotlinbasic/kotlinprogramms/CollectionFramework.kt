package com.example.kotlinbasic.kotlinprogramms

fun main() {
 /*   var num:List<Any> = listOf<Any>(1,2,3,"Hi")                 // immutable list
    println(num.indexOf(3))    //2        //Returns the index of first occurrence of specified element in the list, or -1 if specified element is not present in list.
    println(num.contains(4))   // false
    println(num.get(0))        // 1
    println(num.isEmpty())     //false
    println(num.isNotEmpty())     //true
    println(num.isNullOrEmpty())     //false
    println(num.lastIndex)*/


   /* var num:MutableList<Any> = mutableListOf(1,2,3)             //Mutable List
    num.add("Hello")
    println(num.get(0))             //1
    println(num.remove(1))   // true
    println(num.get(0))             // 2
    println(num.remove(1))   // false
    println(num.removeAt(0))   //2      * @return the element that has been removed.
//    println(num.removeAt(9))   //2     Exception in thread "main" java.lang.IndexOutOfBoundsException
    println(num)*/

    var list1 = mutableListOf<Any>(1,2,3,4,5)
    var list2 = mutableListOf<Any>(6,7,8,9,2)
    list1.addAll(1,list2)
//    println(list1)       // [1, 6, 7, 8, 9, 2, 3, 4, 5]

/*    var  list3 = list1.listIterator()      // It returns a list iterator over the elements in proper sequence in current list.
    for (obj in list3)
        print(obj)           //167892345*/

/*    var list4 = list1.listIterator(5)   //It returns a list iterator over the elements in proper sequence in current list, starting at specified index.
    for (obj in list4)
        print(obj)           //2345*/

    /*var list5 = list1.iterator()     // It returns an iterator over the elements of this list.
    for (obj in list5)
        print(obj)           //167892345*/


/*    var lastIndex = list1.lastIndexOf(2) //
    It returns the index of last occurrence of specified element in the list, or return -1 if specified element is not present in list.
    for (obj in list1)
        print(obj)    // 1678922345
        println(lastIndex)   // 6*/


var subList = list1.subList(2,6)
    for (obj in subList)
        print(subList)

    /*   var lis3:MutableList<Any>;
       lis3 = mutableListOf()
       lis3.add(1)
       println(lis3)        // [1]*/

}



/*
// doc

Types of Kotlin Collections
Kotlin collections are broadly categories into two different forms. These are:
Immutable Collection (or Collection)
Mutable Collection

Immutable Collection:
Immutable collection also called Collection supports read only functionalities. Methods of immutable collection that supports read functionalities are:

Collection Types            Methods of Immutable Collection
List                        listOf(), listOf<T>()
Map                         mapOf()
Set                         setOf()

Mutable Collection:
Mutable collections supports both read and write functionalities. Methods of mutable collections that supports read and write functionalities are:
Collection Types                     Methods of Mutable Collection
List                                  ArrayList<T>(),arrayListOf(),mutableListOf()
Map                                   HashMap ,hashMapOf() ,mutableMapOf()
Set                                  hashSetOf(),mutableSetOf()
*/
