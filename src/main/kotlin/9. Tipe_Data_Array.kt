fun main() {
    // Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
    // Tipe data array di kotlin di representasikan dengan kata kunci Array<Tipe Data>=arrayOf
    /*
    * Operasi Array
    * size              : Untuk mendapatkan panjang Array
    * get(index)        : Mendapat data di posisi index
    * [index]           : Mendapat data di posisi index
    * set(index, value) : Mengubah data di posisi index
    * [index] = value   : Mengubah data di posisi index
    */
    // val itu mengubah si variabelnya bukan ngubah isi datanya / si arraynya gamasalah
    // jadi kita tidak bisa mengubah si variabelnya tetapi data dalamnya bisa diubah
    val names : Array<String> = arrayOf("Rizky", "Faisal", "Rafi")
    val rizky : String = names[0] // Untuk mengakses datanya
    val faisal : String = names.get(1) // Untuk mengakses datanya
    val rafi : String = names[2] // Untuk mengakses datanya
    println(names[0]) // Sebelum merubah indexs 0
    names.set(0,"IKI") // Untuk mengubah datanya menjadi IKI

    val values : Array<Byte> = arrayOf(100,90,80)
    val balances : Array<Int> = arrayOf(100,200,300)

    println("$rizky $faisal $rafi")
    println(names[0]) // Setelah merubah indexs 0

    names[0] = "Budi" // Untuk mengubah data menjadi Budi
    println(names[0])

    val nilai : Array<Int> = arrayOf(100,90,80)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    // Array Nullable
    // Secara standard data di Array di kotlin tidak boleh null
    // Jika kita butuh membuat Array yang datanya boleh null
    // Kita bisa menggunakan ? (tanda tanya)
    println("\nArray Nullable")
    val members : Array<String?> = arrayOfNulls(3)
    members[1] = "Faisal" // Mengisi data Faisal
    println(members[0]) // Hasilnya Null
    println(members[1]) // Hasilnya Faisal karena indexs 1 diisi datanya
    println(members.size) // menampilkan panjang datanya
}