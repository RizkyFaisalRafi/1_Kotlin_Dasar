// function Trailing Lambda hanya bisa di parameter lambda dipaling akhir
fun helloo(value: String, transform: (String)-> String): String{
    return "Hello ${transform(value)}"
}
// Akses function Trailing Lambda agar lebih enak bacanya dari sebelumnya, Optional
fun main() {
    val result1 = helloo("Rizky") { value: String ->
        value.toUpperCase()
    }
    val result2 = helloo("Faisal") { value: String ->
        value.toLowerCase()
    }
    println(result1)
    println(hello { "Faisallll" })
}

