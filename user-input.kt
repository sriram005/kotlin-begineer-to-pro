/* ---------------- Day 4 - User Input --------------- */

/*

There are two ways to read input from user
    --> readLine() function
    --> Scanner Object (you may familiar with this in Java)

Using of these methods are as follows:

*/

// Scanner class must be imported to use Scanner object to get input
import java.util.Scanner

fun main() {
    // readLine() function

    print("Enter your name : ")
    val name = readLine() // return string given by user or null (null safety concept - will discuss later in this series)
    println("Your name is : ${name}")

    // to read numbers(integers or decimal values) generally we typecast it
    print("Enter your age : ")
    var age : Int? = readLine()?.toInt() // ? - safe call operator
    println("Your age : ${age}")
    
    // Likely other conversions can also be made
    print("Enter your CGPA : ")
    var cgpa : Float? = readLine()?.toFloat()
    println("Your CGPA is : ${cgpa}")

    //Scanner Object

    val scanner = Scanner(System.`in`) // here scanner is the Object or Reference to the Scanner class
    print("Enter any number : ")
    var num : Int = scanner.nextInt() // nextInt() is to read Integer from user
    println("You have Entered : ${num}") 
}

/*

NOTE :-
  -> in System.`in` - backticks(`) are used to treat the in` keyword as an identifier since "in" is used as keyword in multiple cases in kotlin.
  -> scanner class many methods or functions to read different types of data
  -> While using Scanner Object Type casting is not necessary
  -> Some of the methods are
      -> next() - read a string (terminates when space encounterd)
      -> next()[0] - read a single character
      -> nextLine() - read a sequence of String until newline(enter) is encountered
      -> nextInt() - read a integer value
      -> nextLong() - read a long value
      -> nextFloat() - read a float value
      -> nextDouble() - read a double value

*/