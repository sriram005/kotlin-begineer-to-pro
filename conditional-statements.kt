/* ---------------- Day 7 - Conditional Statements --------------- */

/*

Conditional Statements in Kotlin are :
  -> if
  -> if-else
  -> if-else-if ladder
  -> when statement

*/
fun main() {
    var x : Int = 5

    // if statement
    if(x == 5){
        println("The Value of x is : $x") // this get printed only if the value of x is 5
    }

    //if-else statement
    if(x > 10){
        println("The value of x is greater than 10") // if x is greater than 10 it gets printed
    }
    else{
        println("The value of x is less than 10") // if x is less than 10
    }

    // if-else-if ladder 
    // Multiple else if statements can be used to check multiple conditions sequentially after an initial if statement
    if(x > 5){
        println("The value of x is greater than 5") // if x is greater than 5
    }
    else if(x < 5){
        println("The value of x is less than 5") // if x is less than 5
    }
    else{
        println("The value of x is equal to 5") // if x is equal to 5
    }

    // when statement
    // The when statement is similar to a switch statement in other languages 
    // It allows you to check multiple conditions in a concise manner
    when(x){
        1 -> println("The value is 1")
        2 -> println("The value is 2")
        3 -> println("The value is 3")
        4 -> println("The value is 4")
        5 -> println("The value is 5")
        else -> {
            println("Some other number") // {} are used for multi-line statements
        }
    }
}