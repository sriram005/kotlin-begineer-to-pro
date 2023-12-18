/* ---------------- Day 6 - Comparision and Logical Operators --------------- */

/*

Operators in Kotlin:
  -> Arithmetic operator
  -> Assignment operator
  -> Comparison operator
  -> Logical operator

Comparison operators in Kotlin:
  - Comparison operators are used to do Compare two values and return a boolean value (true or false)
  - Example : 10 > 5
        return true

    Other Comparison operators are :
      -> == (Equal to)
      -> != (Not Equal to)
      -> > (Greate than)
      -> < (Less than)
      -> >= (Greater than or equal to)
      -> <= (Less than or equal to)


Logical operators in Kotlin:
  -Logical operators are used to determine the logic between variables or values
  -> Example : A && B -> where A and B are Boolean values
        -> return true if both A and B are true

    Other Logical operators are :
      -> && (Logical AND - Returns true if both statements are true) 
      -> || (Logical OR - Returns true if one of the statements is true)
      -> ! (Logical NOT - Reverse the result, returns false if the result is true)

*/


// Program to Demonstrate Comparison operators and Logical operators
fun main() {
    var x : Int = 10
    var y : Int = 20

    // Comparision operations
    println("Is x equal to y : ${x==y}") //false
    println("Is x not equal to y : ${x!=y}") //true
    println("Is x greater than y : ${x>y}") //false
    println("Is x Less than y : ${x<y}") //true
    println("Is x greater than or equal to y : ${x>=y}") //false
    println("Is x Less than or equal to y : ${x<=y}") //true

    // Logical operations
    println(x < y && y == 20) // true [Note : both the conditions x<y and y==20 are true]
    println(x < y || y == 10) // true [Note : any of the conditions x<y or y==20 must be true]
    println(!false) // true [! operator reverse the value]
}