/* ---------------- Day 9 - Jump Statements --------------- */

/*

Jump Statements in Kotlin:
    -> break
    -> continue
    -> return

*/

/*

break - it is used to break the loop i.e, it terminates the loop before if it reaches the termination condition
continue - it skips an particular iteration of the loop whenever necessary based on the condition
return - it is used to immediately terminate the execution of a function and return a value, if the function has a return type.

*/

fun main(){
    //break statement
    for(i in 1..10){
        println(i)
        if(i == 5)
            break   // it gets executed when i = 5. Eventhough termination of loop is at 10 it explicitly terminates the loop at i = 5 
    }

    //continue statement
    for(i in 2..10 step 2){
        if(i == 4)
            continue  // continue statement skips the print statement when i = 4 hence the even numbers from 2 to 10 gets printed except 4
        println(i)
    }
} 


/*

NOTE:
    -> return statement is used with functions in kotlin. We will discuss it in detail later
    -> These jump statements can also be used with while and do - While loops

*/