import org.w3c.dom.ranges.Range

fun main() {
    // Tipe Data Range
    /*
    * Kadang kita ingin membuat array yang berisi data yang angka berurutan
    * Membuat array dengan jumlah data sedikit mungkin mudah, tapi bagaimana jika data angka yang berurutannya sangat banyak, misal dari 1 sampai 1000
    * Kotlin mendukung tipe data range, yang digunakan untuk kebutuhan seperti ini
    * Cara membuat range di Kotlin sangat mudah cukup menggunakan tanda .. (titik dua kali) :
    * 0..10     : Range dari 0 sampai 10
    * 0..100    : Range dari 0 sampai 100
    * Range tidak seperti array dimana dia tidak bisa mengakses :
    * range.get = Tidak Ada di Range
    * range[0] = Tidak Ada di Range
    */
    val range = 1..100
    println(range)

    /*
    * Operasi Range
    * count() = Mendapatkan total data di range
    * contains(value) = Mengecek apakah terdapat value tersebut
    * first = Mendapatkan nilai pertama
    * last = Mendapatkan nilai terakhir
    * step = Mendapatkan nilai tiap kenaikan
    */
    println(range.count())
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

    // Range Terbalik
    println("\nRange Terbalik")
    val range2 = 100 downTo 1
    println(range2.count())
    println(range2.contains(50))
    println(range2.contains(200))
    println(range2.first)
    println(range2.last)
    println(range2.step)

    // Range Terbalik Step 2 atau berapapun
    println("\nRange Terbalik Step 2 atau berapapun")
    val range3 = 100 downTo 1 step 2
    println(range3.count())
    println(range3.contains(50))
    println(range3.contains(200))
    println(range3.first)
    println(range3.last)
    println(range3.step)



}