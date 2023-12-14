/* ---------------- Day 3 - Data Types --------------- */

/*

In Kotlin Data Types are of two types:
    --> Primitive Data types
    --> Reference Data types

Primitive Data types :
    --> Byte  - 8-bit signed integer (-128 to 127)
    --> Short - 16-bit signed integer (-32,768 to 32767) 
    --> Int - 32-bit signed integer (-2^31 to 2^31 - 1)
    --> Long - 64-bit signed integer (-2^63 to 2^63 - 1)
    --> Float - 32-bit floating-point number
    --> Double - 64-bit floating-point number
    --> Char - Represents a single 16-bit Unicode character
    --> Boolean -  Represents true or false values

Reference Data types :
    --> String - group of characters
    --> Array - Represents an array of elements
    --> Collections (List, Set, Mao) - Represents various collection structures for storing multiple elements

*/

/*

Syntax to use Data Types witrh Variables :

    val/var Variable_Name : DataType = Value

*/

fun main(){
    // variables of primitive types
    val number : Int = 57
    val decimal : Double = 19.5 
    val character : Char = 'S'
    val isTrue : Boolean = true

    // variables of Reference types
    val text : String = "Hello world!"
    val numArray : Array<Int> = arrayOf(1,2,3,4,5) // arrayof() is used to declare array of elements
    // Int inside <> denotes that the elements are of type Integer
    val nameList : List<String> = listOf("Sriram", "Krishnan", "SRK")

    println(number)
    println(decimal)
    println(character)
    println(isTrue)
    println(text)
    println(numArray.joinToString()) // printing numArray return only the memory address of that array so the joinToString() is used
    println(nameList)
}