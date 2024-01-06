/* ---------------- Day 26 - Interface in Kotlin --------------- */

/*

Interface:
    -> In Kotlin, an interface is a blueprint of a class, defining a set of methods and properties that a class must implement. 
    -> Interfaces provide a way to enforce a contract between the interface and the class implementing it. 
    -> Any class that implements the interface must provide a concrete implementation of the method.
    -> Interfaces are a powerful way to define contracts between classes. 
    -> They allow you to write code that is more flexible and reusable.
    -> interface is declared using the "interface" keyword. 
*/

interface example {
    fun printSomething()
}

class Sampleclass : example { //the class implements the example interface
    override fun printSomething() { //the printSomething method must be implemented else it will throw an error
        println("Example of using Interface")
    }
}

fun main() {
    val ref = Sampleclass()
    ref.printSomething()
}

/*

Note:
    -> The class can implement multiple interfaces sepreting them by using comma (,). 
    -> Interfaces in Kotlin can also contain default implementations for methods. 
    -> When compared to abstract class, the interface cannot store the state (i.e, properties with initial value) but the abstract class can. 
    -> Choosing between interfaces and abstract classes depends on the design and requirements of the program. 

*/