fun sayHello(firstName: String, lastName: String?) { // By default parameter bersifat Val
    if (lastName == null) {
        println(firstName)
    } else {
        println("Hallo $firstName $lastName")
    }
}

fun sayKampus(kampus: String?, semester: Int) {
    if (kampus == null) {
        println(semester)
    } else {
        println("Dari Kampus $kampus, semester $semester")
    }
}

fun main() {
    sayHello("Rizky Faisal", "Rafi") // Kondisi Else
    sayHello("Verry", "Sulistyawan") // Kondisi Else
    sayHello("Joko", null) // Kondisi If

    sayKampus("Universitas Raharja", 5) // Kondisi Else
    sayKampus(null, 5) // Kondisi If

}

