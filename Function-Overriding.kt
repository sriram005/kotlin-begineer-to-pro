/* ---------------- Day 23 - Function Overriding in Kotlin --------------- */

/*

Function Overriding:
    -> Function Overriding is one of the features of Object Oriented Programming that allows sub class to provide its own properties for the existing properties in the super class. 
    -> In other words, providing new properties(functionality) for an method in sub class which is already defined in super class is called function overriding. 
    -> The Super class function must be marked open to do function overriding. 
    -> The function in the sub class must be marked override to make the function override the properties of existing function.    
*/

open class Animal {
    constructor() {
        println("Animal Class")
    }
    open fun Sound(){
        println("sound varies with different animal species") //we gone a override Sound() function where all animal make sound but it varies based on the animal species it was. 
    }
}

class Dog : Animal(){
    init{
        println("Dog Class")
    }

    override fun Sound(){ //override keyword is used to override the Sound() function from the Animal class
        println("Dog sounds : bow bow")
    }
}

fun main() {
    val animal = Animal()
    val dog = Dog()

    animal.Sound() //prints Animal class Sound() method
    dog.Sound() //prints Dog class Sound() method
}

/*

Note:
    -> If you remove the override keyword it will throw an error since Animal is a super class and it has its own Sound() method.  

*/