package com.example.kotlinbasic.kotlinprogramms

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class StudentHeavy {
    init {
        println("Student Heavy Initialized")
    }

    fun show(){
        println("Hiiiiiiiiiiiiii")
    }
}


class Students{
    val lazyStudent by lazy { StudentHeavy() }
    fun hi(){
        lazyStudent.show()
    }


    var marks:Int by Delegates.observable(5){ property: KProperty<*>, oldValue: Int, newValue: Int ->
        println("Old Value $oldValue")
        println("New Value $newValue")
    }

    var age:Int by Delegates.vetoable(0){ property: KProperty<*>, oldValue: Int, newValue: Int ->
        newValue>=14
    }
}

fun main() {
    val student = Students()
    student.hi()
/*    student.marks = 50
    student.marks = 80*/

    student.age = 10
    println(student.age)

    student.age = 89
    println(student.age)


}