infix fun String.to(type:String): String{
    if(type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}
// Sebenernya bisa "Rizky".to ("UP") tapi karena infix bisa seperti code dibawah
fun main() {
    val result : String = "Rizky Faisal Rafi" to "UP"
    val result2 : String = "Hendrawan Wibowo" to "LO"
    println(result)
    println(result2)

// bisa juga seperti ini 1000.downTo(1) (karena itu infix maka bisa disederhanakan seperti code dibawah)
    1000 downTo 1 // Sebenarnya juga Function Infix.
}





