/* ---------------- Day 22 - Inheritance in Kotlin --------------- */

/*

Inheritance in Kotlin:
    -> Inheritance is one of the concepts of Object Oriented Programming. 
    -> Inheritance allows you to reuse the code by referencing the behavior and data of an object. 
    -> It enables one to define a class in terms of another class incrementally. 
    -> It allows you to Create classes that are built upon existing classes. 
    -> It Specifies a new implementation while maintaining the same behaviors.
    -> The class whose behavior and properties are inherited are called "Super class/Parent class"
    -> The class that inherited from the base class/parent class is called "Derived class/Child class" 

Note:
    -> By default, all the classes are declared final so they cannot be inherited
    -> We need to declare it open so the inheritance can be done. 
*/

open class Employee( //open the class for inheritance
    var eId : Int, 
    var name : String
) { //consider Employee class as base class
    //All the employess has employee Id and name so that are the properties here for the base class
    init {
        println("This is an Employee")
    }
}

class Programmer(
    var Id : Int,
    var ename : String
) : Employee(eId = Id, name = ename) {
    //even though Programmer is an employee, he has some other behaviour that can be defined here
    //let the programmer salary be 50000
    init {
        println("Designation : Programmer")
    }
    fun getSalary() : Int = 50000 //this return 50000 to the programmer salary
}


fun main() {
    val employee = Programmer(101, "Sriram") //crete reference for the programmer class and the Employee class
    println("Employee Id : ${employee.eId}") //access the Employee class properties
    println("Employee Name : ${employee.name}")
    println("Programmer Salary : ${employee.getSalary()}") //access the Salary of the Programmer which is not a specific method of an Employee Class
}