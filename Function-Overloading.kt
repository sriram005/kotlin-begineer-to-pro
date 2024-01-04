/* ---------------- Day 24 - Function Overloading in Kotlin --------------- */

/*

Function Overloading:
    -> Function overloading in Kotlin is a feature that allows you to define multiple functions with the same name within a class or an object, but with different parameter lists.
    -> For Example: if you want to return sum but it may be 2 numbers or 3 numbers, in this case you can keep the same function for both however the no of parameters or the type must be varies. 
    -> This can be useful for providing different implementations of a function for different data types, or for providing different levels of functionality.
    -> To overload a function, you simply define multiple functions with the same name, but with different parameter lists. 
    -> The compiler will chose which function to execute based on the arguments passed to the function. 

*/

//add() with two parameters
fun add(a : Int, b : Int) : Int{
    return a + b;
}

//add() with three parameters
fun add(a : Int, b : Int, c : Int) : Int{
    return a + b + c;
}

//add() to add two floating integers
fun add(a : Float, b : Float) : Float {
    return a + b;
}

fun main() {
    var sum1 : Int = add(3,4) //call the add() with two parameters
    var sum2 : Int = add(10,3,4) // call the add() with three parameters
    var sum3 : Float = add(5.0f,17.0f) // call the add() with floating point integers

    //printing the sum
    println("Sum1 : $sum1")
    println("Sum2 : $sum2")
    println("Sum3 : $sum3")
}

// NOTE: you can create any no of functions with no two function having same no parameters of same type and same return type