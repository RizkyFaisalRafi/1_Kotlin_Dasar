fun Tambah(nilai1: Int, nilai2: Int): Int { // : Int adalah Tipe Data Kembalian
    val hitung = nilai1 + nilai2
    return hitung
}

fun Kurang(nilai1: Int, nilai2: Int): Int { // : Int adalah Tipe Data Kembalian
    val hitung = nilai1 - nilai2
    return hitung
}

fun Bagi(nilai1: Int, nilai2: Int): Int { // : Int adalah Tipe Data Kembalian
    val hitung = nilai1 / nilai2
    return hitung
}

fun main() {
    val result = Tambah(10,20)
    println(result)
    println(Kurang(100,200))

    // Di aritmatika pembagian tidak bisa dibagi 0
    println(Bagi(100,0))
}

