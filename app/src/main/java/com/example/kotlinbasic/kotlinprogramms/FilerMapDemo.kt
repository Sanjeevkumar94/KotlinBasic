package com.example.kotlinbasic.kotlinprogramms

fun main() {
    val nums = listOf<Int>(1, 2, 3, 4, 5)
    /* println(isOdd(3))
     println(isOdd(2))*/

    /* val list = nums.filter(::isOdd)
     println(list)       //[1, 3, 5]

     val list2 = nums.filter({a:Int->a%2!=0})
     val list3 = nums.filter {a:Int->a%2!=0}
     val list4 = nums.filter {a:Int->a%2!=0}
     val list5 = nums.filter{it%2!=0}
     println(list2)       //[1, 3, 5]
     println(list3)       //[1, 3, 5]
     println(list4)       //[1, 3, 5]
     println(list5)       //[1, 3, 5]*/


    val userList = listOf<User>(
            User(1, "Sanj"),
            User(1, "Lucky"),
            User(3, "Mohan")
    )

    /*   val userList2 = userList.filter { it.id ==1 }
       println(userList2)
   */

    val paidUser = userList.map {
        PaidUser(it.id, it.name, "Admin")
        PaidUser(it.id, it.name, "Normal User")
    }

    /* println(paidUser)
     paidUser.forEach{
         println(it.name)
     }
 */


    val names = mutableListOf<String>()
   val returnNames =  paidUser.mapTo(names) {
        it.name
    }

    println(returnNames)
    println(names)

}

fun isOdd(a: Int) = a % 2 != 0
data class User(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)