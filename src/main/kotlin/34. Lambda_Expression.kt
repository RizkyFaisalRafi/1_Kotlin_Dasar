// Function Biasa
fun name2(firstName: String): String{
    val hasil : String = "Nama Aku $firstName"
    return hasil
}
fun main() {
    // Membuat Lambda Expression disimpan di variable
    // tidak perlu lagi gunakan kata kunci return untuk mengembalikan data karena default sudah return
    // 1 Parameter
    val lambdaName: (String) -> String = { value: String ->
        value.toUpperCase()
    }
    // 2 parameter
    val lambdaName2: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    // Mengeksekusi Lambda Expression sama seperti function return biasa
    val name = lambdaName("Faisal")
    println(name)
    val result = lambdaName2("Hendrawan", "Wibowo")
    println(result)

    // Function Biasa
    name2("Rizky Faisal Rafi")
    println(name2("Rizky Faisal Rafi"))
    val a = name2("Hendrawan")
    println(a)
}
