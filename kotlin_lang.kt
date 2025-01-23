// Basic Kotlin program structure

// single expression function
fun sum(x: Int, y: Int) = x + y

// Main function - entry point of the program
fun main() {


    println(sum(1, 2))

    // Variables
    val immutableVariable = "This cannot be changed"    // Immutable (val)
    var mutableVariable = "This can be changed"         // Mutable (var)
    
    // Basic data types
    val number: Int = 42
    val decimal: Double = 3.14
    val text: String = "Hello, Kotlin!"
    val isTrue: Boolean = true
    
    // String templates
    println("Number is $number")
    
    // Control flow
    if (number > 0) {
        println("Number is positive")
    } else {
        println("Number is negative or zero")
    }
    
    // Loop examples
    for (i in 1..5) {
        println("Count: $i")
    }
    
    // While loop
    var counter = 0
    while (counter < 3) {
        println("While loop iteration: ${counter + 1}")
        counter++
    }
    
    // Function example
    fun greet(name: String): String {
        return "Hello, $name!"
    }
    
    // Call the function
    println(greet("Kotlin Developer"))
    
    // List example
    val fruits = listOf("Apple", "Banana", "Orange")
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    val customers = 10
    println("There are $customers customers")
    // There are 10 customers
    
    println("There are ${customers + 1} customers")
    // There are 11 customers
    
    // Read only list
	val readOnlyShapes = listOf("triangle", "square", "circle")
	println(readOnlyShapes)
	// [triangle, square, circle]

	// Mutable list with explicit type declaration
	val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("round")
    println(shapes)
	// [triangle, square, circle]
    
    val readOnlyShapesSet = setOf("triangle", "square")
    println(readOnlyShapreSet)
    
    val mutableShapesSet = mutableSetOf("triangle", "square")
    mutableShapesSet.add("round")
    println(mutableShapesSet)
    
    // Read-only map
	// val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
	// println(readOnlyJuiceMenu)
	// {apple=100, kiwi=190, orange=100}

	// Mutable map with explicit type declaration
	// val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
	// println(juiceMenu)
	// {apple=100, kiwi=190, orange=100}

	val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
	val juiceMenuLocked: Map<String, Int> = juiceMenu
    println("The value of apple juice is: ${juiceMenuLocked["apple"]}")
    
    println(juiceMenu.containsKey("kiwi"))
    println(juiceMenu.keys)
    println(juiceMenu.values)
    println("orange" in juiceMenu)
    println(200 in juiceMenu.values)

    // Condition

    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)
    // 1

    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2

    val obj = "Hello"

    // when statement no return 
    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")     
    }
    // Greeting

    // val obj = "Hello"    

    // when expression return value 
    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
    // Greeting

    // when without subject and check boolean expression 
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)

    // when with subject 
    val trafficAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction)  

    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    if (firstResult == secondResult)
        println("You win :)")
    else
        println("You lose :(")

    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )

    // Range

    // 1..4 = 1,2,3,4
    // 1..<4 = 1,2,3
    // 4 downTo 1 = 4,3,2,1
    // 1..5 step 2 = 1,3,5
    // 'a'..'d'= a,b,c,d
    // 'z' downTo 's' step 2 = 'z', 'x', 'v', 't'


    // Loop 

    // For loop 
    for (number in 1..5) { 
        // number is the iterator and 1..5 is the range
        print(number)
    }

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    // while loop
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    // do while loop 

    // var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)


    for (number in 1..100) {
        println(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> "$number"
            }
        )
    }

    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (w in words) {
        if (w.startsWith("l"))
            println(w)
    }
}


