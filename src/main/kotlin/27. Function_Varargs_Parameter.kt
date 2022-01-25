// Menggunakan Array
fun hitungTotal(values: Array<Int>): Int{
    var Total = 0
    for (value in values){
        Total += value
    }
    return Total
}

// Menggunakan VarArgs
fun hitungTotal2(vararg values: Int): Int{
    var Total = 0
    for (value in values){
        Total += value
    }
    return Total
}

fun main() {
    println("Menggunakan Array")
    // Menggunakan Array
    val values = arrayOf(10,10,10,10)
    val result = hitungTotal(values)
    println(result)

    println("\nMenggunakan VarArgs")
    // Menggunakan VarArgs
//  val values2 = arrayOf(10,10,10,10) Tidak perlu lagi format array
    val result2 = hitungTotal2(10,10,10,10)
    println(result2)
}