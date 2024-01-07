/* ---------------- Day 27 - Annonymous Class in Kotlin --------------- */

/*

Annonymous Class:
    -> In Kotlin, anonymous classes are created using object expressions.
    -> An object expression creates an object of an anonymous class.
    -> Anonymous classes are useful for one-time use.
    -> Instances of anonymous classes are also called anonymous objects because they are defined by an expression, not a name.
    -> Anonymous classes can be used in any situation where you would use a regular class.

*/

fun main() {
    // Create an anonymous object and assign it to the variable 'ref'
    val ref = object { 

        // Define a function 'printName' that takes a String argument 'name' and prints it
        fun printName(name: String){
            println("Your name is ${name}")
        }

        // Define a function 'printAge' that takes an Int argument 'age' and prints it
        fun printAge(age: Int){
            println("Your age is ${age}")
        }
    }

    // Call the 'printName' function of the anonymous object 'ref' and pass "Sriram" as the argument
    ref.printName("Sriram")

    // Call the 'printAge' function of the anonymous object 'ref' and pass 20 as the argument
    ref.printAge(20)
}


/*

Note:
    -> You can define a Annonymous Class from scratch, inherit from existing classes, or implement interfaces.
    -> They are especially useful when you need to create a class for a one-time use or when you need to create a class that is specific to a particular situation.

*/