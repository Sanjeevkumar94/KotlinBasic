package com.example.kotlinbasic.kotlinprogramms

fun main() {
/*
val ram = Person("Ram Singh")
val lakhan = Person2("Lakhan Singh")
   print(lakhan.show())
*/

//    print(ram.show())

    var person3 = Person3("Sanj",29)
    print(person3.voteOrNot)

}


class Person(val name:String){
    //primary constructor .
    // if we use var or val then it become member variable of Class.
    // if we don't use then it become only parameters variables. for become a class member variable we need to use it on init  block
fun show() = name
}


/*
class Person2(name:String){
    fun show() = name     //giving error because it is only parameter not a class member
}*/
/*class Person2(name:String){     // for use name varaible we need to assign in username
    var userName = name
    fun show() = userName
}*/

class Person3(name:String,age:Int){         // init block use name variable means class parameter
    var userName:String?=null
    var userAge :Int?=null
    init {
        userName = name
        userAge = age
    }
var voteOrNot:Boolean = userAge!!>18       // variable as experssion
}
