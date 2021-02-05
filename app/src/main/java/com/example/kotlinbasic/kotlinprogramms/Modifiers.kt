package com.example.kotlinbasic.kotlinprogramms

  open class Banga {   // bydefault class is public it will be accessed from everywhere.
    internal var  a:Int = 1
     protected var c:Int = 3
    fun add () = c+10
    protected open var d = 5
}

class Banga2 {
    private var b:Int =2
}

class Banga3:Banga(){
    fun showValue() = c
    override var d: Int = 9   // it is also protected

}








/*
//doc
public modifier
A public modifier is accessible from everywhere in the project. It is a default modifier in Kotlin. If any class, interface etc. are not specified with any access modifier then that class, interface etc. are used in public scope.

protected modifier
A protected modifier with class or interface allows visibility to its class or subclass only. A protected declaration (when overridden) in its subclass is also protected modifier unless it is explicitly changed.

private modifier
A private modifier allows the declaration to be accessible only within the block in which properties, fields, etc. are declare. The private modifier declaration does not allow to access the outside the scope. A private package can be accessible within that specific file.

internal modifier
The internal modifiers are newly added in Kotlin, it is not available in Java. Declaring anything makes that field marked as internal field. The internal modifier makes the field visible only inside the module in which it is implemented.*/
