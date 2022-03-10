fun main(args: Array<String>) {
    var result1:Int = 10/3
    println(result1)

    //Beware of data type

    //It runs with scientific operations
    var result2:Int = 10 + 10 / 3
    println(result2)

    //Operations
    //Addition
    var addition:Int = 10 + 10
    println(addition)

    //Subtraction
    var subtraction:Int = 10 - 5
    println(subtraction)

    //Multiply
    var multiply:Int = 10 * 5
    println(multiply)

    //Division
    var division:Int = 10/2
    println(division)

    //Modulo
    var modulo:Int = 10%3
    println(modulo)


    //Augmented Assignments
    var price1:Int = 100_000
    price1 += 100_000
    println(price1)
    //Other operations are: -=, *=, /=, %=


    //Unary Operations
    var price2:Int = 10
    price2++
    println(price2)
    //Other operations are: --
    // - is for negative number, + for positive, ! for NOT in boolean
    var healthy = true
    println(!healthy)
}