package com.example.kotlinbasic.kotlinprogramms

fun main() {

    var countryNames = CountryNames("Austraila",1)
    println("before $countryNames")


    //***********************************************************************
/*
// apply has this keyword inside block.it return update object.
  var newCounterName =   countryNames.apply {
        this.id = 2
        name = "India"
    }
    println("After $countryNames")
    println("After $newCounterName")*/

    /*  var x = countryNames.apply {
           println(name)
           print(id)
       }
       println(x)*/

//********************************************************************************
    // let has it keyword inside block. it return last value of line.

    /*  countryNames.let {
          it.name = "India"
          it.id = 100
      }
      println(countryNames)
      */
    /*  var id =  countryNames.let {
           it.name = "India"
           it.id = 100
          it.id
       }
       println(id)           //100*/

/*    val stateNames:CountryNames? = null
    stateNames?.let {
        it.id =1
        it.name = "Punjab"
    }
stateNames?.let { println("${it.name} is ${it.id}") }   */

   /* val stateNames: CountryNames? = CountryNames("", 0)
    stateNames?.let {
        it.id = 1
        it.name = "Punjab"
    }
    stateNames?.let { println("${it.name} is ${it.id}") }*/

    //***********************************************************************************

    // with has this keword and it return last value of line.

   /* val stateNames:CountryNames? = null
    with(stateNames){
        this?.name = "India"
        this?.id = 100
    }*/

    //*******************************************************************

//    run has this keyword and it return last value of line.

  /*  countryNames.run {
        name = "UK"
        id = 100
    }
    */


}


data class CountryNames(var name: String, var id: Int)



//doc


/*Kotlin scope function

        Function      Context Object        Return value
        let            it                    last line
        run            this,nothing write    last line
        with           this,nothing write    last line
        apply          this,nothing write    object
        also           it                    object*/

