fun String.hello(): String = "Hello $this"
fun String.printhello(): Unit = println("Assalamualaikum $this")

fun main() {
    val name = "Rizky"
    println(name.hello())
    name.printhello()

    "Faisal".printhello() // String bisa jadi function
    println("Rafi".hello()) // String bisa jadi function
}

