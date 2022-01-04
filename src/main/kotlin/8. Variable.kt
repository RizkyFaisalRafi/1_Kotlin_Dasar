// Variable Constant
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    /*
    * Variable adalah tempat untuk menyimpan data
    * Kotlin mendukung 2 jenis variable; Mutable(bisa diubah) dan Immutable(tidak bisa diubah)
    * Untuk membuat variable Mutable, di kotlin bisa gunakan kata kunci var
    * Untuk membuat variable Immutable, di kotlin bisa gunakan kata kunci val
    * Deklarasi Variable
    * val/var  namaVariable  :  TipeData  = data
    * Direkomendasikan menggunakan Immutables dibandingkan Mutable Data karena datanya tidak berubah ubah
    * */

    // Mutable (Bisa Diubah)
    var firstName : String = "Rizky"
    var lastName : String = "Rafi"
    // Mengubah Variable
    lastName = "Rizky Rafi"
    println(lastName)

    // Immutable (Tidak Bisa Diubah)
    val firstName2 : String = "Rizky"
    val lastName2 : String = "Rafi"
    // Akan Error jika mengubah variable karena menggunakan Immutable
    //    lastName2 = "Rizky Rafi"
    //    println(lastName2)

    /*
    * Nullable
    * Secara standard, variable di kotlin harus dideklarasikan / diinisialisasikan nilainya
    * Jika saat membuat variable, tidak diberi nilai, maka akan error
    * Kotlin mendukung variable yang boleh null (tidak memiliki data)
    * Ini dikarenakan kotlin bisa mengakses java, dan kebanyakan dijava, semua variable bisa null
    * Untuk membuat variable bisa bernilai null, di kotlin bisa menggunakan ? (tanda tanya) setelah tipe datanya
    * Penggunaan fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode java
    * */
    var firstName3 : String? = "Rizky"
    firstName3 = null

    // Error karena firstName3 bisa null
    // println(firstName3.length)
    // Cara mengakses yang benar dengan nullable
    println(firstName3?.length)
    println(firstName3)

    /*
    * Variable Constant
    * Constant adalah Immutable data yang biasanya diakses untuk keperluan global
    * Global artinya bisa di akses dimanapun
    * Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable constantnya
    */
    println("Welcome to $APPLICATION, Version $VERSION")

}