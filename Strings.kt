/* ---------------- Day 12 - Strings --------------- */

/*
 
 Strings in Kotlin:
    -> Strings are a group or sequence of Charaters enclosed in "". 
    -> Like Java, String is Class rather than a Primitive data type. 
    -> Example:
        String str = "Hello World"
    -> Any charater can be enclosed within a double quotes to form a string.
    -> Since string is a Class, it consistes of many predefined functions to do operations on string data.

*/

fun main() {
    var str : String = "Hello World"

    //Iterate over the characters with an loop
    for (x in str)
        println(x)

    println(str.length) // returns the length or size of the string
    
    //String can also be accessed as an array of characters
    for(i in 0..str.length-1)
        print(str[i])

    println(str.uppercase()) // convert the string in str to Uppercase

    println(str.lowercase()) // convert the string in str to lowercase

    println(str.capitalize()) // It capitalize the first character in the string
    
    var str2 = "Hello " + "sriram" // + operator concate two strings
    println(str2)

    if(str.equals(str2)) // equals() check if two two string are same
        println("Two Strings are equal")
    else
        println("Two Strings are not equal")


    println(str.get(0)) // get the character at index 0

    println(str.plus(str2)) // plus() method concate str with str2 and retur the string of concated value

    var multiLineString : String = """
        This is multi line string
        multiple lines of strings
        can be initalized within
        triple quotes """

    println(multiLineString)
}