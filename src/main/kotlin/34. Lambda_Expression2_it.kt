fun main() {
    // Membuat Lambda kata kunci it
    // Pada saat bikin lambda dan hanya 1 parameter, kita bisa tidak mendeklarasikan variable di lambda
    // Secara default apabila tidak mendeklarasikan parameternya, kita bisa mengakses ke dalam body lambda
    // menggunakan it. it hanya bisa jalan jika parameternya hanya 1.
    val lambdaName: (String) -> String = {
        it.toUpperCase()
        "Hello $it"
    }

    // Mengeksekusi Lambda Expression
    val name = lambdaName("Rizky")
    println(name)

}

