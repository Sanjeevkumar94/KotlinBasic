package com.example.kotlinbasic.kotlinprogramms

fun main() {

/*
    var male = Human("Sanj Kumar")
*/

/*
    var male = Human("Sanj",23)

    print(male.show())*/

}

/*
class Human{
    constructor(name:String){
        println("Constuctor called $name")
    }

}*/

/*
class Human {
    constructor(val name:String){  // var and val not allowed on secondary constructor
    }
}*/

/*
class Human(var userAge:Int) {
    var userName = ""
    constructor(name:String,age:Int):this(age){
        userName = name
    }

    fun show() = "$userAge $userName"
}*/


/*
class Human(var userName:String){
    constructor(fname:String){
    }
    //error:Conflicting overloads: public constructor Human(fname: String) defined in com.example.kotlinbasic.kotlinprogramms.Human, public constructor Human(userName: String) defined in com.example.kotlinbasic.kotlinprogramms.Human
}*/
