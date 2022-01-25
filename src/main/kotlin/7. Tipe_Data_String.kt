fun main() {
    val firstName : String = "Rizky"
    val lastName : String = "Rafi"
    val fullName : String = "Rizky Faisal Rafi"
    println(fullName)
    // Gunakan """ untuk String lebih dari 1 Baris
    val address : String = """
        Street Not Yet Done,
        Province Subang,
        Country Indonesia
    """
    println(address)

    // String Trim Margin / menggabungkan dari beberapa line menjadi 1 line
    var address1 : String = """
        Street Not Yet Done,
        Province Subang,
        Country Indonesia        
    """.trimIndent()

    var address2 : String = """
        |Street Not Yet Done,
        |Province Subang,
        |Country Indonesia        
    """.trimMargin()

    var address3 : String = """
        >Street Not Yet Done,
        >Province Subang,
        >Country Indonesia        
    """.trimMargin(">")

    println("\nTrim Margin address1")
    println(address1)
    println("\nTrim Margin address2")
    println(address2)
    println("\nTrim Margin address3")
    println(address3)

    // Menggabungkan Line dengan operator +
    var fullname : String = firstName + " " + lastName
    println("\nMenggabungkan Line dengan operator +")
    println(fullname)

    // String Template dengan menggunakan $
    var fullNameTemplate : String = "$firstName $lastName"
    var desc : String = "Total $fullName, panjang char = ${fullName.length}"
    println("\nString Template")
    println(fullNameTemplate)
    println(desc)
}