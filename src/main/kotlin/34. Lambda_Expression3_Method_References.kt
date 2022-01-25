// Method References yaitu membuat lambda expression tapi dari referensi function yang sudah ada
// bisa disebut Function References / Method References.
fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    // Membuat Lambda
    val lambdaName: (String) -> String = ::toUpper // ::toUpper dari Method References

    // Mengeksekusi lambda
    val name = lambdaName("Faisal")
    println(name)
}

