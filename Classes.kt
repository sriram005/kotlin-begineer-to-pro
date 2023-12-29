/* ---------------- Day 18 - Classes in Kotlin --------------- */

/*

Classes in Kotlin:
    -> Classes in Kotlin are used as the blueprint for creating Object. 
    -> It consists of attributes(properties) and methods(Behaviour) that are relevant to each other or focused on a similar thing or Object.
        Attributes - Also known as Fields or Properties, attributes are the variables defined inside the class
        Methods - These are the functions that are defined in the class
    -> Syntax for class declaration in Kotlin:

    class Class_Name{
        //class propeerties and methods
    } 

    -> The class properties are accessible using the object created for the class. 
    -> Let's see an example for a class 

*/

class Calculator {
    var x : Int = 30 //properties or fields or attributes -> variables in the class 
    var y : Int = 20 // these fields must be initialized

    fun Add(x : Int = 15, y : Int = 10) : Int{ //method or function in the class here default value is given the parameters. 
        return x + y //here the parameter values are returned 
        // to return the sum of fields(variable in the class) this keyword is used
    }

    fun Sub(x : Int = 20, y : Int = 30): Int {
        return this.x - this.y //here the field values are evaluated
    }

    fun Multiply(x : Int, y : Int) : Int {
        return x * y
    }
    
}

fun main() {
    val calc = Calculator() //Object Creation for the class Calculator

    println("The sum is : ${calc.Add()}") //however no arguments are passed the default value is evaluated 
    println("Subtraction : ${calc.Sub(5,6)}") //however no arguments are passed the values in the properties are evaluated
    println("Multiply : ${calc.Multiply(5, 7)}") //here the arguments are evaluated
}

/*

Note:
    -> The properties and methods are accessed only with the help of the Object. 
    -> We will see more about the Objects and its properties in future. 
    -> If you are familiar with Java, you may notice that there is no "new" keyword to create an Object instance. 
    -> In Kotlin, there is no "new" keyword. 

*/