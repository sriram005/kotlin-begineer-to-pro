/* ---------------- Day 20 - Objects and Companion Objects in Kotlin --------------- */

/*

Objects in Kotlin:
    -> Object or Singleton object is a single instance for the class where the property is constant over any no of reference creation. 
    -> In simple terms, if a class contains a property which has a constant value then we can create an object for those types of properties. 
    -> The object file contains thoes properties which will be instantiated only once no matter how many times the reference is created for a class. 
    -> This helps in memory saving in a Large Program. 

Singleton objects in Kotlin:
    -> A companion object in Kotlin is a special object that is bound to (i.e. is a part of) a class definition.
    -> It is used to create a singleton, holding methods and properties that are similar to static members in other programming languages.
    ->  It is associated with the class it belongs to and allows access to its members without requiring an instance of the class.

*/


object SingletonObject { //we cannot create a reference for this object 
    val value : Int = 5 //to access the value property we just use SingletonObject.value(ObjectName.property)

    fun print() { //you can also include a function in a singleton object
        println("Hello World!")
    }
}

class SampleClass{
    // val value : Int = 5 - if we create a property like this, for n no of reference creation n no of value property is created eventhough the value 5 is constant over the end of the program. 
    fun PrintObject(){
        println("The value in Singleton Object : ${SingletonObject.value}")
    } 
}

class SampleClass2{
    companion object {
        fun print() {
            println("Hello World from companion object!")
        }
    }
}

fun main(){
    //Singleton Object
    val ref = SampleClass()
    ref.PrintObject()
    //call print() in Singleton Object
    SingletonObject.print()

    //Companion object
    SampleClass2.print() // it will call the print() method in SampleClass2

    /*
    This will not work
    val ref2 = SampleClass2()
    ref2.print() 
    */
}

/*

Note:
    -> Singleton Objects are not tied to the any class as it can be accessed directly with object file name.
    -> The companion object is often used when you want to have a global singleton instance associated with a class, defining common functionalities or properties that are related to that class itself rather than its instances.
    
    Key Differences b/w Singleton Object & Companion Object:    
        -> Singleton objects are standalone objects and not tied to any specific class, while Companion objects are tied to a specific class.
        -> Companion objects have access to the private members of the class they belong to, while Singleton objects cannot access private members of any class.
        -> Singleton objects are accessed directly by their name, while Companion objects are accessed through their containing class name.

*/