// reference: https://kotlinlang.org/docs/idioms.html#check-the-presence-of-an-element-in-a-collection 

// data class provider getter/setter , copy(), toString(), hashCode() 

data class Customer(val name: String, email: String)

// default parameter
fun showUser(name: String = "Theik Chan", email: String = "example@gmail.com") { }

// filter list 
val fistCustomer = Customer("Theik Chan", "example@gmail.com")
val customers = listOf(firstCustomer)
val filteredCustomers = customers.filter { it.name.equals("Theik Chan")}

// check element exist and not exist in collection
if (firstCustomer in customers) { }
if (fistCustomer !in customers) { }

// string interpolation
println("Name: ${fistCustomer.name}")

// read standard input

// read string and return null if can't convert into integer e.g hello world
val wrongInt = readln().toIntOrNull()
println(wrongInt)

// read string and convert into integer
val correctInt = readln().toIntOrNull()
println(correctInt)

// instance check 
val x = Customer("name","email")

when(x) {
    is Customer -> println("x is customer type")
    else -> println("x is not customer type")
}

// read only list and map
val list = listOf("a","b","c")
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

// access map entry 
println(map["a"])
// update map value
map["a"] = 4

// traverse and retrieve map or list of pairs
for ( (key,value) in map) {
    println("$key -> $value")
}

// range 

for (i in 1...100) { } // closed-ended range: includes 100
for (i in 1..<100) { } // open-ended range: does not include 100
for (x in 2..10 step 2) { } // increase 2
for (x in 10 downTo 1) { } // decrease till 1
(1..10).forEach { }

// lazy property the value is compute only first access it 
val name: String by lazy { }

// entension function
fun String.spaceToCamelCase() { }

"Convert this to camelcase".spaceToCamelCase()

// singleton
object Resource {
    val name = "Theik Chan"
}

// inline value class for type-safe values
// if incorrect usage between EmployeeId and CustomerId then compilation error is triggered

@JvmInline 
value class EmployeeId(private val id: String)

@JvmInline
value class CustomerId(private val id: String)

// instantiate an abstract class 

abstract class EndPoint {
    abstract fun headers()
    abstract fun parameters()
}

fun main() {
    val apiEndPoint = object : EndPoint {
        override fun headers() {}

        override fun parameters() { }
    }

    apiEndPoint.headers()
    apiEndPoint.parameters()
}

// if not null shorthand

val files = File("Test").listFiles()
println(files?.size) // print size if files is not null 

// if not null else shorthand 

println(files?.size ?: "empty files")

val fileSize = files?.size ?: run {
    val size = getFileSize()
    size * 2
}
println(fileSize)

// execute statement if null 

val email = map["email"] ?: throw IllegalStateException("email is missing!)

// get first item or null 
val emails = listOf("a@gmail.com", "b@gmail.com", "c@gmail.com")
val firstEmail = emails.firstOrNull() ?: ""

// execute if not null

firstEmail?.let {

}

// map nullable value if not null

// default value is returned if the value or the transform result is null 
val updateEmail = emails?.let { transformValue(it)} ?: defaultValue 


// return on when statement

fun tranform(color: String) : Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalStateException("invalid color param vlaue")
    }
}


// try-catch expression

fun test() { 
    val result = try {
        count()
    } catch (error: ArthiemticException) {
        throw IllegalStateException(error)
    }

    print(result)
}

// if expression

val y = if (x == 1) {
    "one"
}else if (x == 2) {
    "two"
}else { "other" }

// builder style usage of method that return Unit 

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}


// single-expression functions

fun userName() = "name"

fun transformExpression(color: String): Int = when(color) {
    "Red" -> 1
    "Green" -> 2
    "Blue" -> 3
    else -> throw IllegalStateException("invalid color param value")
}

// call multiple methods of object instance using with 

class Turtle {
    fun penDown()
    fun penUp()
    fun turn(degree: Double)
    fun forward(pixels: Double)
}

val myTurtle = Turtle()

with(myTurtle) { // draw 100 pixel sqaure
    penDown()
    for (i in 1..4) {
        forward(100.0)
        turn(90.0)
    }
    penUp()    
}

// configure object peoperty with apply useful for property that aren't present in object constructor
class Rectangle {
    var length: Int 
    var breadth: Int 
    var color: Int 
}

val myRectangle = Rectangle().apply {
    length = 3
    breadth = 2
    color = OxFAFAFA
}


// Java 7's try-with-resources

val stream = Files.newInputStream(Paths.get("/path/to/file.txt"))
stream.buffered().reader().use { reader -> 
    println(reader.readText())
}

// generic function that require generic type information 

inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)

// swap 2 variables

var a = 1
var b = 2
a = b.also { b = a }


// mark incomplete code with TODO 

fun calculateTaxes(): BigDecimal = TODO("waiting for feedback from accounting")
