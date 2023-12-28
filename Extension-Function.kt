/* ---------------- Day 17 - Extension Function --------------- */

/*

Extension function in Kotlin:
    -> Extension function is a special type of function in kotlin that allows you to add new functionality to existing classes without directly modifying their code. 
    -> It enables you to extend a class with new functions without having to inherit from it.
    -> There are many pre-defined extension functions:
        -> Int Class Extension Functions
            -> add() //Perform bitwise ADD operation
            -> or() //Perform bitwise OR operation
            -> plus() //add two integers
            -> minus() //subtract two integers
            -> div() //divide two integers
            -> mod() //reminder when two integers are divided
    -> Like the above all classes has its own Extension functions
    -> We can also create our own extension function 

    The Syntax for it is as follows:

    fun ClassName.function_name(params) : return_type {
        function definition
    }

*/

/* In this program we will create an extension function to check if an number is prime or not */

fun main() {
    var x : Int = 7
    var y : Int = 8

    if(x.isPrime()) // return true if the number is prime
        println("$x is a prime number")
    else
        println("$x is a not a prime number")
    
    if(y.isPrime())
        println("$y is a prime number")
    else
        println("$y is a not a prime number")

    //we can also pass an argument to extension functions
    var mark1 : Int = 78 
    var mark2 : Int = 61 //let add two marks and return the total marks obtained
    var total : Int = mark1.addMark(mark2) //we can also use add() instead of defining our own function
    println("The total marks obtained is : $total")
}

//Extension function to check prime numbers
fun Int.isPrime() : Boolean{
    for(i in 2..this/2){ //this keyword is used to indicate the Integer value i.e) the value stored in x or y in the main()
        if(this%i==0)
            return false
    }
    return true
}

//Extension function to check mark 
fun Int.addMark(mark : Int) : Int{
    return this + mark // add mark1 with mark2 and return the result 
}


/*

Note:
    -> Here we have mentioned that we use class Name in Extension functions. 
    -> If you are familiar with java, you may know about classes. 
    -> Classes are more imporatant aspects of Programming when it is Object Oriented Language. 
    -> Kotlin is an Object Oriented Programming Language and we will see it in detail further.  

*/