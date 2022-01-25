// Lambda dijadikan sebagai parameter di sebuah function
fun hello(value: String, transform: (String)-> String): String{
    return "Hello ${transform(value)}"
}
fun hello2(value: String, transform: (String)-> String): String{
    val hasil = transform(value) // bisa juga val hasil = transform(value). Sama saja
    return "Hello $hasil"
}

fun main() {
    val upperTransform = { value: String -> value.toUpperCase() }
    val lowerTransform = { value: String -> value.toLowerCase() }
    println(hello("Rizky",upperTransform))
    println(hello("Rizky",lowerTransform))

    val upperTransform2 = { value: String -> value.toUpperCase() }
//  val lowerTransform2 = { value: String -> value.toLowerCase() }
    println(hello2("Faisal",upperTransform2)) // Akses bisa seperti ini
    println(hello2("Faisal") { value: String -> value.toLowerCase() }) // Akses bisa seperti ini
    println(hello2("Faisal", { value: String -> value.toLowerCase() })) // Akses bisa seperti ini
}

