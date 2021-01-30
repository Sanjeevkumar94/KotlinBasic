package com.example.kotlinbasic.kotlinprogramms

fun main() {

    var simplePhn = Mobile()
    simplePhn.callingDisplay()
    println(simplePhn.name)

    var smartMobile = Samsung()
    smartMobile.callingDisplay()
    println(smartMobile.name)
    println(smartMobile.toString())

}


open class Mobile() {
   open var name:String ="Mobile"
   open fun callingDisplay() = println("Simple Display")
    fun sim2GType() =println("2 G Sim")

}

class Samsung:Mobile() {
     override var name:String = "Samsung Mobile"
    override fun callingDisplay() {
        super.callingDisplay()
        println("Samsung Display")
        super.sim2GType()
        this.sim4GType()
    }
    fun sim4GType() = println("4 G Sim")

    override fun toString(): String {
        return "Sanjeev kumar"
    }


}

/*

documentation

Kotlin Inheritance
Inheritance is an important feature of object oriented programming language. Inheritance allows to inherit the feature of existing class (or base or parent class) to new class (or derived class or child class).

The main class is called super class (or parent class) and the class which inherits the superclass is called subclass (or child class). The subclass contains features of superclass as well as its own.

The concept of inheritance is allowed when two or more classes have same properties. It allows code reusability. A derived class has only one base class but may have multiple interfaces whereas a base class may have one or more derived classes.
All Kotlin classes have a common superclass "Any". It is a default superclass for a class with no supertypes explicitly specified.
Kotlin open keyword
As Kotlin classes are final by default, they cannot be inherited simply. We use the open keyword before the class to inherit a class and make it to non-final,

Kotlin Inheritance and primary constructor
If the base and derived class both having primary constructor in that case the parameters are initialized in the primary constructor of base class. In above example of inheritance, all classes contain three parameters "name", "age" and "salary" and all these parameters are initialized in primary constructor of base class.

When a base and derived class both contains different numbers of parameters in their primary constructor then base class parameters are initialized form derived class object.

For example:

open class Employee(name: String,salary: Float) {
    init {
        println("Name is $name.")
        println("Salary is $salary")
    }
}
class Programmer(name: String, dept: String, salary: Float):Employee(name,salary){
    init {
        println("Name $name of department $dept with salary $salary.")
    }
    fun doProgram() {
        println("Programming is my passion.")

    }
}
class Salesman(name: String, dept: String, salary: Float):Employee(name,salary){
    init {
        println("Name $name of department $dept with salary $salary.")
    }
    fun fieldWork() {
        println("Travelling is my hobby.")

    }
}
fun main(args: Array<String>){
    val obj1 = Programmer("Ashu", "Development", 40000f)
    obj1.doProgram()
    println()
    val obj2 = Salesman("Ajay", "Marketing", 30000f)
    obj2.fieldWork()
}
Output:

Name is Ashu.
Salary is 40000.0
Name Ashu of department Development with salary 40000.0.
Programming is my passion.

Name is Ajay.
Salary is 30000.0
Name Ajay of department Marketing with salary 30000.0.
Travelling is my hobby.
When an object of derived class is created, it calls its superclass first and executes init block of base class followed by its own.

Kotlin Inheritance and secondary constructor
If derived class does not contain any primary constructor then it is required to call the base class secondary constructor from derived class using super keyword.

For example,

open class Patent {

    constructor(name: String, id: Int) {
        println("execute super constructor $name: $id")
    }
}

class Child: Patent {

    constructor(name: String, id: Int, dept: String): super(name, id) {
        print("execute child class constructor with property $name, $id, $dept")
    }
}
fun main(args: Array<String>) {
    val child = Child("Ashu",101, "Developer")
}
Output:

execute super constructor Ashu: 101
execute child class constructor with property Ashu, 101, Developer
In above example, when object of Child class is created, it calls its constructor and initializes its parameters with values "Ashu", "101" and "Developer". At the same time Child class constructor calling its supper class constructor using super keyword with values of name and id. Due to the presence of super keyword thebody of superclass constructor executes first and returns to Child class constructor.

Kotlin Method Overriding
Method overriding means providing the specific implementation of method of super (parent) class into its subclass (child) class.

In other words, when subclass redefines or modifies the method of its superclass into subclass, it is known as method overriding. Method overriding is only possible in inheritance.

KotlinRules of method overriding

Parent class and its method or property which is to be overridden must be open (non-final).
Method name of base class and derived class must have same.
Method must have same parameter as in base class.
Example of inheritance without overriding
open class Bird {
    open fun fly() {
        println("Bird is flying...")
    }
}
class Parrot: Bird() {

}
class Duck: Bird() {

}
fun main(args: Array<String>) {
    val p = Parrot()
    p.fly()
    val d = Duck()
    d.fly()
}
Output:

Bird is flying...
Bird is flying...
In above example, a program without overriding the method of base class we found that both derived classes Parrot and Duck perform the same common operation. To overcome with this problem we use the concept of method overriding.
Example of Kotlin property overriding
Property of superclass can also be overridden in its subclass as similar to method. A color property of Bird class is overridden in its subclass Parrot and Duck and modified.

open class Bird {
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
}
class Parrot: Bird() {
    override var color = "Green"
    override fun fly() {
        println("Parrot is flying...")
    }
}
class Duck: Bird() {
    override var color = "White"
    override fun fly() {
        println("Duck is flying...")
    }
}
fun main(args: Array<String>) {
    val p = Parrot()
    p.fly()
    println(p.color)
    val d = Duck()
    d.fly()
    println(d.color)
}
Output:

Parrot is flying...
Green
Duck is flying...
White
We can override the val property with var property in inheritance but vice-versa is not true.

Kotlin superclass implementation
Derived class can also call its superclass methods and property using super keyword.

For example:

open class Bird {
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
}
class Parrot: Bird() {
    override var color = "Green"
    override fun fly() {
        super.fly()
        println("Parrot is flying...")

    }
}

fun main(args: Array<String>) {
    val p = Parrot()
    p.fly()
    println(p.color)

}
Output:

Bird is flying...
Parrot is flying...
Green
*/
