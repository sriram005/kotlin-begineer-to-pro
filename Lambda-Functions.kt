/* ---------------- Day 29 - Lambda Functions in Kotlin --------------- */

/*

Lambda Functions:
    -> A lambda function in Kotlin is an anonymous function that can be defined inline and passed as an argument to another function.
    -> Lambda functions are often used in Kotlin to simplify code and make it more concise.
    
    Syntax:
        { parameters -> Body of the lambda function }

        parameters - list of parameters that the lambda function takes.
        Body - the code that the lambda function executes.

    -> Lambda expressions provide a shorthand syntax to write functions. 

*/

fun main() {
    //Example1 
    val myLambdafun = {x : Int, y: Int -> x + y } // lambda function
    println("Sum using Lambda Function : ${myLambdafun(4,5)}") //calling the lambda function

    //Example2
    var list = (1..20).toList()
    list = list.remove{ it % 2 == 0 } //here an function definition is passed as an argument to an another function
    println("List after lambda function : $list")
}

fun List<Int>.remove(filter : (Int) -> (Boolean)) : List<Int>{ //this is an extension function with remove() take a lambda function as parameter 
    val list = mutableListOf<Int>()
    for(x in this){
        if(filter(x)) //the lambda function(filter) return true or false based on the function body defined in the main function
            list.add(x)
    }
    return list
}