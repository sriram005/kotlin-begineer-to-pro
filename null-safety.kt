/* ---------------- Day 10 - Null Safety --------------- */


/*

    -> Null Safety is one of the important topic in kotlin which handls null values in the program.
    -> In java, if you try to do any operations on null values, you will get an exception which can be eliminated by kotlin
    -> It is widely used in application development where the NPE exception is thrown often.
    
    The Null Safety is achieved with the following opertators:
        -> Safe Call Operator (?.)
        -> Not-Null assertion operator (!!)
        -> Elvis Operator (?:)

    Safe Call Operator:
        - It allows you to access a field or call a method on a nullable variable.
    
    Not-Null assertion operator:
        - It throws a Kotlin NullPointerException if the variable to which it is applied is null
        - It convert any value to a non-null type and ensure that it is not null by throwing an exception otherwise

    Elvis Operator:
        - It allows you to return a default value when the original nullable variable is null.

*/

fun main(){
    var x : Int = 10 // normal variable in which the null safety cannot be applied 
    var y : Int? = 20 // Initally y = 20. However if it became null it can be handled by using any of the above operator.

    // Safe Call Operator
    var name : String? = "sriram" // nullable String - meaning that the null can be used
    println(name) // name can be printed here

    name = null
    println(name) // Since it is a nullable String - null is printed as output

    // let's print length of the string
    println(name.length) // It will throw an error since name is a nullable string

    //to handle the null, safe call operator is used
    println(name?.length) // It will println length of the string if it is not null otherwise null is printed as output

    //Not Null assertion Operator
    // If you want to throw an exception when null value is obtained this operator is used
    val len = name!.length // since name is null it will throw an Null PointerException (NPE) 

    //Elvis Operator
    // It will assign a default value if null value is obtained
    
    var z : Int? = null
    println(z) // by default it will print null
    println(z ?: "z is null") // since z is null it will println "z is null"
    z = 10
    println(z ?: "z is null") // It will print 10 since z is assigned with 10
}

/*

    Note : Nul Safety has more applications then above mentioned which will be discussed whenever the topics are live 

    To run the above program comment the line no. 39 and line no. 46 since they will throw an exception

*/