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

    // collections
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    when {
        "orange" in fruits -> println("juicy")
        "apple" in fruits -> println("apple is fine too")
    }

    fruits
    .filter { it.startsWith("a")}
    .sortedBy { it }
    .map { it.uppercase() }
    .forEach { println(it)}


    // type check and automatic casts 

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length 
        }

        return null 
    }


    // lists, sets, queues and deques operations

    fruits
    .add("apple")

    fruits += "apple" // plus assign

    val bottles = listOf("glass")

    fruits.addAll(bottles)
    fruits += bottls // plus assign

    if (fruits.contains("apple")) {}

    if ("apple" in fruits) { }

    if (fruits.isEmpty()) {}

    fruits.removeIf( it.equals("apple"))

    // fruits.retainAll()

    fruits.clear()

    fruits.stream()
    fruits.iterator()

    // map operations 

    var devices = mutableMapOf("laptop" to "apple")

    devices.put("mobile" to "iphone")
    devices["speaker"] = "beats"

    devices += Pair("glass", "angis")

    // devices.replace()
    // devices.replaceAll()

    println(devices.get(1))
    println(devices[1])

    if(devices.containsKey("latop")) {}
    if(devices.containsValue("apple")) {}

    if(devices.isEmpty())

    // remove element by key 
    devices.remove("laptop")
    devices -= "speaker"

    devices.clear()

    // operations that exist only for lists 
    // indexOf get index of element
    // lastIndexOf get index of last element
    // subList get sublist
    // get get an element by index
    // set set an element by index

    // operations on any collection type 
    // size() get size of collection
    // flatMap, flatten() - get flat access to nested collection elements 
    // map
    // reduce apply provided operation to collection elements sequentially and return the accumulated result 
    // eachCount count elements that match predicate
    // filter filter by condition 
    // none, any, all
    // sorted - sort elements 
    // take(2), limit - take the first n elements 
    // takeWhile - take elements while condition is true 
    // skip(1) - skip the first n elements 
    // dropWhile() - skip elements while condition is true 
    // associated - build map from collection elements and certain values associated with them 

    // operation on lists
    // sort - sort a list into natural order 
    // sortDescending
    // removeAt(1), remove(element) - remove element by index or element 
    // fill() - fill all elements of list with certain value 
    // distinct - unique lements from list 

    // zip, unzip 
    // aggregate - group by condition 
    // takelast, takelastwhile, droplast, droplastwhile - take or drop elements by predicate
    // slice, chunked , windowed - get sublist of elements 
    // +, - add or remove elements 


    val names = listOf("John", "Jane", "Jack")

    names.any { it.startsWith("J") }
    names.only { it.startsWith("J") }
    names.none { it.startsWith("J") }
    names.count { it.startsWith("J") }
    names.first { it.startsWith("J") }
    names.last { it.startsWith("J") }
    names.find { it.startsWith("J") }
    names.findLast { it.startsWith("J") }
    names.firstOrNull { it.startsWith("J") }
    names.lastOrNull { it.startsWith("J") }
    names.indexOf("Jane")
    names.indexOfLast { it.startsWith("J") }
    names.indexOfFirst { it.startsWith("J") }
    names.drop(1)
    names.dropLast(1)
    names.dropWhile { it.startsWith("J") }
    names.dropLastWhile { it.startsWith("J") }

    names.chunked(2)
    names.chunked(2) { it.reversed() }
    
    names.windowed(2)
    names.windowed(2, step = 2)
    names.windowed(2, step = 2, partialWindows = true).flatten()

    names.zip(listOf("John", "Jane", "Jack"))
    names.unzip()

    names.associate { it to it.length }


    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.sum()
    numbers.average()
    numbers.max()
    numbers.min() 

    numbers.reduce { acc, i -> acc + i } // 15
}


