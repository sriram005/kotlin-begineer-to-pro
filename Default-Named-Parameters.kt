/* ---------------- Day 15 - Parameters - Default and Named --------------- */


/*

Parameters in Kotlin functions:
    -> We know that the function in kotlin have parameters to be passed to do operations. 
    -> These parameters have different names based on the behaviour. 
    -> The types of parameters are
        - Default Parameters
        - Named Parameters
        - Vararg Parameters

    Default Parameters:
        -> If there is no argument in the function but a definition contains a parameter the compiler will throw an error
        -> To avoid this there is a concept called default parameters which assign a default value to the parameter
        -> In this method we will assign a default value to the parameter of the function where in the absence of the argument the the default value is assigned.

    Named Parameters:
        -> Assume a case where the order of passing the arguments is confusing. 
        -> For this kotlin has a method called Named Parameters where you can pass the argument with its name in function definition. 
        -> It is not necessary to pass the argument in an order. We can just pass it with the help of its name so it assign that same value. 

*/

fun Add(a : Int = 5, b : Int = 5) {
    println("Sum is ${a+b}")
}

fun main() {
    //Default Parameters
    Add() // you can note that the add() function has no arguments however it print an sum as 10 as a and b is assigned with 5 as its default parameter value

    //Named Parameters
    Add(b = 20 , a = 50) // note that the add() function has a parameter a folled by b however b is assiggned with 20 and a is assigned with 5. 

}