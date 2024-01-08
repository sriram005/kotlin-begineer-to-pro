/* ---------------- Day 28 - Exception in Kotlin --------------- */

/*

Exception in Kotlin:
    -> An exception is an unwanted or unexpected event that occurs during the execution of a program.
    -> It distrubs the normal flow of the program. 
    -> If exceptions are not handled, then the program will throw an exception and stop executing.
    -> Handling the exception helps in contineous flow of execution of the program even in the case of unwanted distrubances. 
    -> Example of Exception:
        - Accessing the array element beyond the array size will throw an "ArrayIndexOutOfBoundsException" 
    -> There are two types of Exception:
        - Checked exceptions 
        - Unchecked exceptions
    -> Checked exceptions are checked at compile time, while unchecked exceptions are not.
    -> Exceptions can be handled by using try-catch block or by using throws keyword  

*/

fun main() {
    //we know thar a number cannot be divide by zero
    val res : Int = 5 / 0 //complier will not show any error message since there is no mistake in the code(syntax)

    println(res) //will not work due to runtime errors and the program terminates

    //to handle this we use try-catch block
    val res2 : Int
    try{
         res2 = 5 / 0
         println(res2) //if it was not divided by zero res2 will print the actual result of res2 variable
    }
    catch(e : Exception){
        //you can do anythin you want if the exception is throwed
        //here i print you cannot divide a number by zero
        println("You cannot divide a number by zero")
    }

    println("End of the Program") //it will work even there is an exception because we have handled it.
    
    // throw keyword 
    val name : String? = null //here name is set to null
    
    val personname = name ?: CallException("Name Required") //if name is null Illegal Argument Exception is throwed with the message "Name Required"
    println(personname) //if name is null program will terminate

    //you can create user defined exceptions
    val age : Int = 16
    if(age < 18)
        throw VoterException("Age must be greater than 18 to vote") 
}

fun CallException(message: String?) : Nothing {
    throw IllegalArgumentException(message)
}

fun Divide(a : Int, b : Int) : Int {
    return a /b
}

class VoterException(message : String) : Exception(message) 