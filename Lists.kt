/* ---------------- Day 13 - Lists --------------- */

/*

Lists in Kotlin:
    -> List is similar to arrays in Kotlin where array is of fixed size and list is used when no of elements are not sure
    -> There are two different types of lists
        - Immutable List
        - Mutable List
    -> Immutable list is created using listOf() method
    -> Mutable list is created using mutableListOf() method
    -> Like array, list elements can also be accessed using index number which is also start at 0
    -> In list, the elements are added, removed and sorted using predefied methods.
*/

fun main() {
    // create two lists - an mutable and an immutable list
    var immutable = listOf(5,3,1,9,7,5) // Immutable list of different elements
    var mutable = mutableListOf(5,4,9,3,1) // Mutable list of different elements

    //size of the lists
    var size1 = immutable.size
    var size2 = mutable.size

    // check if lists are empty
    if(immutable.isEmpty())
        println("List1 is empty")
    if(mutable.isEmpty())
        println("List2 is empty")
    
    //Accessing all the elements
    for(x in immutable)
        println(x)
    
    //Adding elemet to the list only possible in mutable lists
    mutable.add(4)
    mutable[2] = 6 // also be modified using index value

    //Removing elemet from the mutable list
    mutable.remove(1)
    println(mutable)

    //Sort elements in the list
    mutable.sort()
    println(mutable)

    //Reverse the elemets of the list
    mutable.reverse()
    println(mutable)
}

/*

Note: 
    -> list can be directly printed using println as it return the list of elements
    -> List contains some more funtions to work with. To konw all about that visit - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/
    -> However these mentions functions are mostly enough to handle and work with lists in kotlin

*/