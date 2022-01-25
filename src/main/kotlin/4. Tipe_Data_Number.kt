fun main() {
    // Underscore in number
    var age : Byte = 3_0 // 8 Bits Min:-128 / Max:127
    var height : Int = 3_00 // 32 Bits Min:-2,147,483,648(-2^31) / max:2,147,483,647(2^31-1)
    var  distance : Short = 2_000 // 16 Bits min:-32768 / max:32767
    var balance : Long = 100_000_000L // 64 Bits min:-9,223,372,036,854,775,808(-2^63) / max:9,223,372,036,854,775,807(2^63-1)
    println("Underscore in number")
    println(height)

    // Floating Point
    var value : Float = 98.98F // 32 Bits
    var radius : Double = 2342342343.54535 // 64 Bits
    println("\nFloating Point")
    println(radius)

    // Literals
    var decimalLiteral : Int = 100 // format decimal
    var hexaDecimalLiteral : Int = 0xff // format hexaDecimal
    var binaryLiteral : Int = 0b0001 // format binary
    println("\nLiterals")
    println(decimalLiteral)
    println(hexaDecimalLiteral)
    println(binaryLiteral)

    // Conversion / Konversi yang tadinya Int ke Double atau apapun itu
    var number : Int = 100 // Nilai awal yang ingin dikonversi
    var byte : Byte = number.toByte() // Konversi int ke Byte
    var short : Short = number.toShort() // Konversi Int ke Short
    var int : Int = number.toInt() // Konversi Int ke Int
    var long : Long = number.toLong() // Konversi Int ke Long
    var float : Float = number.toFloat() // Konversi Int ke Float
    var double : Double = number.toDouble() // Konversi Int ke Double
    println("\nConversion")
    println(float)

}