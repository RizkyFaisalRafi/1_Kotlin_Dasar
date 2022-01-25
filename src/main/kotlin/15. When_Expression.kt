fun main() {
    val finalExam = 'A'
    when (finalExam) {
        'A' -> {
            println("Amazing")
        }
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
    else -> println("Ups")
    }

    // When Expression Multiple Option
    /*
       Apabila pakai IF  =
       if(nilai == "A" || nilai == "B" || nilai == "C")
    * */
    val finalExam2 = 'A'
    when(finalExam2) {
        'A', 'B', 'C' -> println("Selamat Anda Lulus")
    else -> {
            println("Tidak Lulus")
        }
    }

    // When Expression In
    // Bisa Digunakan Exspresi In dan Tidak In
    // Datanya didalam Array
    val finalExam3 = 'A'
    val passValues = arrayOf('A', 'B', 'C')
    when (finalExam3) {
        in passValues -> println("Anda Lulus") // in artinya di
        !in passValues -> println("Try Again Tidak Lulus") // Tidak di
    }

    // When Expression Is = Mengecek apa tipe datanya
    val name = "Eko"
    when(name) {
        is String -> println("Name Is String")
        !is String -> println("Name Is Not String")
    }

    // When Tanpa Variable
    val nilaiUjian = 95
    when{ // Bisa langsung tanpa menyebutkan variablenya
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang Tahun Depan")
    }

}