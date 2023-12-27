/* ---------------- Day 16 - Vararg Parameters --------------- */

/*

Vararg Parameters:
    -> Consider if you want to do some opertaions on group of elements. 
    -> We actually pass those elements to the function using a list or an array. 
    -> But using a vararg as an parameter type you can directly pass those elements to the function without the help of an list. 

*/


fun main(){
    var max : Int = getMax(1,2,5,4,8,6,3,2,11,45,52,87,48,95,62,12,35,22,65) //note that we are sending multiple arguments
    println("The maximum is : $max")
}

fun getMax(vararg numbers : Int) : Int { //Since there are multiple arguments we cannot create those parameters here. So we go for vararg parameters and the type of the parameters in metioned as Int 
    var max = numbers[0]
    for(number in numbers) {
        if(number > max)
            max = number
    }
    return max
}

/*

Note : The vararg parameter accept any type of data(float, double, string, etc) and only thoes are to passed as an argument fron the main() function

*/