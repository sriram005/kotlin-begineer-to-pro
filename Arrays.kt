/* ---------------- Day 11 - Arrays --------------- */

/*

Arrays in Kotlin:
    -> In kotlin arrays are initialized using arrayOf() method.
    -> Like other languages array values can be accessed using index and the index is 0 based.  

*/

fun main() {
    var array = arrayOf("Hello","guys,","myself","sriram") // Initialization of array with strings

    for(x in array){ // Iterate over the array
        print("$x ") // print the elements
    }

    // To understand the 0-based index look at the example below
    for(i in 0..array.size-1) // here array.size return the size as 4 since there are 4 elements but index start from 0 and end at 3
        print("${array[i]} ") // using 4 at array[4] throw ArrayIndexOutOfBoundsException so array.size is subtracted by 1


    // array can also be initalized with integer values
    var array2 = arrayOf(1,2,3,4,5)
    for (x in array2) 
        println(x)

    // you can also use IntArrayOf to initialize an Integer array
    var array3 = intArrayOf(1,2,3,4,5)

    // To decalare an array Array(size) is used
    var array4 = Array(5) {0} // it will define an array of size 5 with 0 as default value

    var array5 = arrayOf(1,"hi",3.4,"hello",null) //since no specific type is provided you can initialize with any type of value including null

    for (x in array5)   
        print("$x ") // null is also be printed here

    // Declaring 2D array
    var array6 = Array(5) {Array(2) {1}} // it is equal to array[5][2] array of 5 rows and 2 columns
    println(array6[0].joinToString()) // prints the first row elements which are of size 2 i.e, column of size 2 with 1 as default value 

    println(array6.contentDeepToString()) // prints the entire 2D array or multi-dimensional array
}

/*

Note:
  -> array initialized using arrayOf() is immutable i.e, it cannot be modified
  -> array initialized using Array() is mutable i.e, it cannot be modified. Ex : array4[0] = 5 (check the array4 in the code)
  -> joinToString() is prints the values of the array in the specific row
  -> contentDeepToString() prints the entire array in which each row will be enclosed in [] and seperated by ,(comma)
  -> some other functions like 
        - sum() can only be used with arrays of numeric data types, such as Int.  
        - shuffle() shuffle the elements in the array

  -> Initially the array are of Object type. To convert it into a specific primitive type of value generics will be used which will be discused later. 
  

*/