fun kali(nilai1: Int, nilai2: Int): Int{ // Function Biasa
    val hitung = nilai1 * nilai2
    return hitung
}
// Single Expression Function tidak perlu lagi menggunakan kata kunci return
// Karena sudah otomatis return
fun kali2(nilai1: Int): Int = nilai1 * 2 // Single Expression Function
fun Hi(name: String): Unit = println("Hi $name") // Single Expression Function

fun main() {
    println(kali(10,2))
    Hi("Rizky Faisal Rafi")
    println(kali2(10))
}
