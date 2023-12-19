/* ---------------- Day 8 - Looping Statements --------------- */

/*

Looping Statements in Kotlin
    -> for loop
    -> while loop
    -> do-while loop

*/
fun main() {
    //for loop
    for(x in 2..10) // here 2..10 indicate range of numbers from 2 to 10
        println(x)
    for(i in 10 downTo 1) // downTo is used to iterate from 10 to 1
        println(i)
    for(i in 1..10 step 2) // step is an increment expression where i increases by x (where x is an integer) here x = 2 (ex: 1, 3, 5,...)
        println(i);
    for(i in 10 downTo 1 step 2) // 10 to 1 decrement by 2
        println(i)
    // We can also interate through alphabets
    for(i in 'a'..'z')
        println(i)

    //While Loop
    var i : Int = 1
    while(i <= 10){ // i <= 10 is the condition. The loop executed until the codition became false.
        println(i)
        i++; // i is the iteration variable. It must be incremented or decremented based on the condition to terminate the loop
    }

    // do-While loop
    i = 1
    do{
        println(i)
        i--;
    }while(i > 10) // here the condition is false however i gets println at least once and it is the key defference between do-while and while loop

}

/*

NOTE:
  -> Looping statements are mostly used with Array and lists
  -> They are used to iterate through the elemets to do operations on them
  
*/