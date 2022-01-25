    // Bisa menyebutkan Function parameternya / Function Named Argument
fun fullName(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName(firstName = "Rizky", middleName = "Faisal", lastName = "Rafi")

    // Tidak Pakai Function Named Argument
    fullName("Rizky", "Faisal", "Rafi")

    // Pakai Function Named Argument
    fullName(firstName = "Rizky", lastName = "Rafi",  middleName = "Faisal")
}


