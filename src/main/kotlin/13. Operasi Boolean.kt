fun main() {
    val finalExam = 80
    val attendant = 75
    val PassFinalExam = finalExam > 75
    val PassAttendant = attendant > 80

    val pass1 = PassFinalExam && PassAttendant // And
    val pass2 = PassFinalExam || PassAttendant // Or
    println(pass1)
    println(pass2)

    val nilai1 = false
    val nilai2 = true
    val hasil = nilai1 && nilai2
    println(hasil)
    println(!nilai1) // Not / Negasi

}