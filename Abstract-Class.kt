/* ---------------- Day 25 - Abstract Class in Kotlin --------------- */

/*

Abstract class:
    -> Abstract class is a class that cannot be instantiated directly. 
    -> It serves as the blue print for the the classes those are inherited from it. 
    -> It provide common behavior and characteristics for the inherited classes. 
    -> Abstract class is created using "abstract" keyword. 
    
    Key points - Abstract class:
        -> It cannot be instantiated. 
        -> It may or may not contain non-abstract members. i.e, mambers can also be non-abstract

    To understand the the use of abstract class see the example below. 

*/

abstract class ShapeClass{
    // abstract members must be declared with abstract keywords
    abstract var name : String // no need for the initialization of the abstract member

    abstract fun getArea() : Float // no definition to be given
}

class Square(name : String,var side : Float) : ShapeClass() {
    
    //to inherit abstract class you must implement the abstract members of the abstract class
    override var name : String = name

    fun ShapeName(){
        println("Shape - $name")
    }
    //the abstract class members are defined here 
    override fun getArea() : Float {
        return side * side    
    }
}

fun main() {
    val square = Square("Square", 5f) //creating reference for the square class 
    square.ShapeName()
    println("Area of the square: ${square.getArea()}") //print the area of the square
}

/*

Note:
    -> Creating a reference for the ShapeClass will throw an error. 
    -> As the abstract class act as a blue print for the inheriting class, those classes which inherit it must define all the abstract members of the class. 
    -> This is the key feature or usage of the abstract class. 

*/

