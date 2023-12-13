/* ---------------- Day 2 - Variables --------------- */

fun main() {
    // val --> defines read-only variables
    val PI = 3.147 // PI value cannot be changed later

    // var --> variables can be reassigned (Values can be changed even after initialization)
    var radius = 22  // Initially value of radius variable is set to 22

    // lets chane the value of radius variable
    radius = 26 // the value is changed to 26

    // lets calculate the area of the circle
    var area = PI * radius * radius

    // print it in the console
    println("Area of the circle : $area")
}