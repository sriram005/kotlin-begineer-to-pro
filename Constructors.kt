/* ---------------- Day 19 - Constructors in Kotlin --------------- */

/*

Constructors in Kotlin:
    -> Costructors are the special functions called automatically when the object for the class is created. 
    -> These Constructors are primarly used to initialize the variables or properties of the class. 
    -> There are two types of constructors:
        - Primary constructor
        - Secondary constructor
    -> The class must consists of atleast one constructor which you may declare it or not the compiler will automatically add it. 

*/

class Shape(
    var x : Int, // this is the primary constructor
    var y : Int  // the parameter to the constructor are considered as the properties of the class
){
    //you cannot do any operation in default constructor. Only Initialization can be done
    //the x and y properties can be used anywhere in the class

    //To do operation in constructor you can use the constructor(){} block or init{} block
    init{
        println("Init block") //the init{} block executes before the constructor
    }

    //Secondary constructor
    var z : Int = 0 
    constructor(x : Int, y : Int, z : Int) : this(x,y){ //here we use three sides in which two sides are already in default constructor
        this.z = z // the default constructor is called from constructor() with this() anf the third parameter is used to initialize the z propertie 
    }

    fun perimeter(): Int {
        return x + y + z // if default constructor is called only x and y are added and z has no effect as its default value is 0 but it may changes based on the operation done. 
    }

}

fun main(){
    // var shape = Shape() - error since the default constructor has two arguments 
    
    //call default constructor
    var shape1 = Shape(5 , 12) //x = 5, y = 12
    println("Default constructor Perimeter: ${shape1.perimeter()}")

    //secondary constructor
    var shape2 = Shape(5,6,7) //x = 5, y =6, z = 7
    println("Secondary constructor Perimeter: ${shape2.perimeter()}")
}

/*

Note:
    -> for both the object creation init{} block is called and the "init block" statement is printed
    -> The init{} block cannot act as the constructor with no parameters. 
    -> If you override the constructor i.e, modify the empty constructor with properties you cannot create a object with no properties or parameters
    -> However, you can create a empty constructor with no parameters which will work fine but you have to call the default constructor using this() with default values for the properties. 

*/