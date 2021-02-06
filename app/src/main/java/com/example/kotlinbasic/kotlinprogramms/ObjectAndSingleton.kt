package com.example.kotlinbasic.kotlinprogramms


fun main() {
    /*println(ObjectDemo.cityName)
    println(ObjectDemo2.cityName())*/

    SharingWidget.likesTwitter()
    SharingWidget.likesTwitter()
    SharingWidget.fbLikes()

    println(SharingWidget.displayTotalLikes())

}


object ObjectDemo {
    var cityName = "Patiala"
}

object ObjectDemo2 {
    fun cityName() = "Sirhind"
}

object SharingWidget {
    private var twitteLikes =0
    private var fbLikes =0

    fun likesTwitter() = twitteLikes++
    fun fbLikes() = fbLikes++

    fun displayTotalLikes() = "Twitter Likes -- $twitteLikes  Fb Likes -- $fbLikes"

}