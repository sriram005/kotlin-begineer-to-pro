/* ---------------- Day 30 - Generics in Kotlin --------------- */

/*

Generics in Kotlin:
    -> Generics allow you to define classes, interfaces, functions, and methods with placeholder types. 
    -> Generics in Kotlin are a powerful feature that allows you to write code that is flexible and reusable.
    -> You can see defferent Examples like: List<Int> , List<String> , etc., 
    -> The type specified inside the <> near the class is called Generics. 
    -> It is the type Parameter just like it in java.  
    -> List<String> says that the list can hold String values
*/

import kotlin.reflect.typeOf

class Generics<T>(
    val type : T //property of type T - type we specify in the reference
){
    fun printData(){
    
        println("type -> $type") //print the value of any type: Int, String, Float
    }
}

fun main(){
    val gen1 : Generics<Int> = Generics(10)
    val gen2 : Generics<Float> = Generics(10.23f)
    val gen3 : Generics<Double> = Generics(1025.458)
    val gen4 : Generics<String> = Generics("Sriram")

    gen1.printData()
    gen2.printData()
    gen3.printData()
    gen4.printData()
}

/*

Note:
    -> The above is the example of how List<T>, Set<T>, etc., can be used. 
    -> Generics are mostly used when the type of the data is to be mentioned.

*/