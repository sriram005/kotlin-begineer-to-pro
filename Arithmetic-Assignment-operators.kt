/* ---------------- Day 4 - Arithmetic and Assignment Operators --------------- */

/*

Operators in Kotlin:
  -> Arithmetic operator
  -> Assignment operator
  -> Comparison operator
  -> Logical operator

Arithmetic operators in Kotlin:
  - Arithmetic operators are used to do common mathematical operations.
  - Example : A + B
        A, B - Operand
        + - Operator

    Other Arithmetic operators are :
      -> + (Addition)
      -> - (Subtraction)
      -> * (Multiplication)
      -> / (Division)
      -> % (Modulus - give the remainder)
      -> ++ (Increment)
      -> -- (Decrement)


Assign operators in Kotlin:
  -Assignment operators are used to assign values to the variables
  -> Example : A = 10
        A - Variable
        10 - value

    Other Assignment operators are :
      -> = (Equal to)
      -> += (Addition Assignment)
      -> -= (Subtraction Assignment)
      -> *= (Multiplication Assignment)
      -> /= (Division Assignment)
      -> %= (Modulo Assignment)
      -> ^= (Bitwise XOR Assignment)

*/


// Program to Demonstrate Arithmetic operators and Assignment operators
fun main() {
    var x : Int = 10
    var y : Int = 20

    // Arithmetic operations
    println("Addition of $x + $y : ${x + y}")
    println("Subtraction of $x - $y : ${x - y}")
    println("Multiplication of $x * $y : ${x * y}")
    println("Division of $x / $y : ${x / y}")
    println("Modulo of $x % $y : ${x % y}")

    x++  //Increment operator increase the value by one
    println("Value of x after increment : $x")

    // Assignment operations
    var z : Int = x + y // x(10) is added with y(20)  and assigned to z(30)
    println("Value of z : $z")

    x += 30 // assign x with x + 30
    println("Value of x : $x") 
}