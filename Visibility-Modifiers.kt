/* ---------------- Day 21 - Visibility Modifiers in Kotlin --------------- */

/*

Visibility Modifiers:
    -> Visibility Modifiers are used to restrict the accessibility of a component in a program. 
    -> Classes, objects, interfaces, constructors, and functions, as well as properties and their setters, can have visibility modifiers.
    -> There are four types of visibility modifiers :
            Public - The member is visible everywhere.
            Protected - The member is visible within the same class and its subclasses.
            Internal -  The member is visible within the same module.
            Private - The member is visible only within the same class.

*/

public class Visibility{ //this class is visible everywhere
    private val value : Int = 5 //the value cannot be accessed by reference or any other classes. 
    
    // The internal visibility modifier means that the member is visible within the same module. 
    // More specifically, a module is a set of Kotlin files compiled together, for example: An IntelliJ IDEA module.

    protected fun getValue(): Int { // this function to cannot be accessed by reference but can be inherited (the method used to share the common behaviour or properties of two or more classes)
        return value
    }

    fun getValue2() : Int {
        return getValue() //visible within the class and its sub classes 
    }
}

fun main() {
    val vis = Visibility()
    // println(vis.value) - throw an error since value is private 

    // println(vis.getValue()) - throw an error since getValue() is protected
    println(vis.getValue2()) //no error here
}

/*

Note :
    -> In Kotlin, an outer class does not see private members of its inner classes.
    -> By default if no visibility modifier is declared, it was public by default. 

*/