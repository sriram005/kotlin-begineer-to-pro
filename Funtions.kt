/* ---------------- Day 14 - Functions --------------- */

/*

Functions in Kotlin:
    -> As you know, main() is function which is the starting point of the Kotlin Program
    -> Like main() funcion, you can create your own function with own functionalities

*/


/*

Syntax:
    fun function_name(params...) : return_type{
        function body
    }

*/

//start function to print start
fun start() {
    println("start")
}

//sum function to print the sum of two Integers
fun sum(a: Int, b: Int){
    println("Sum is : ${a+b}")
}

//multiply function to return the result of the multiplication
fun multiply(a: Int, b: Int) : Int {
    return a * b
}


fun main() {
    // Call a function start() which print start
    start() //function without return type and parameters

    //functions with parameters
    sum(5,5)

    //function with return type
    var multi : Int = multiply(5, 5)
    println("Multiplication is : ${multi}")

}