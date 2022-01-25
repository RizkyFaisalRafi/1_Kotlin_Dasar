fun main() {
    // For Array
    println("Contoh 1")
    var total1 = 0
    var names = arrayOf("Rizky", "Faisal", "Rafi")
    // name variabel baru untuk menampung data tiap perulangannya
    for(name in names){ // Diulang sebanyak jumlah datanya
        println(name)
        total1++
    }
    println("Total Perulangan = $total1")

    println("\nContoh 2")
    var array = arrayOf("Rizky", "Faisal","Gans", "Binggo" )
    var total2 = 0
    for(name2 in array) {
        println(name2)
        total2++ // ditambah terus sebanyak total perulangannya
    }
    println("Total Perulangan = $total2")

    // For Range
    println("\nFor Range 1")
    for(value in 0..100){ // Naik 1
        println(value)
    }

    println("\nFor Range 2")
    for (i in 0..100 step 2){ // Naik 2
        println(i)
    }

    println("\nFor Range 3")
    for (i in 100 downTo 0 step 2){ // turun 2
        println(i)
    }

    println("\nFor Range 4") // Kombinasi dari Range dan juga Array
    val ukuranArray = array.size -1
    for (i in 0..ukuranArray){
        println("Index $i = ${array.get(i)}")
    }

    println("\nFor Range 5") // Kombinasi dari Range dan juga Array
    val ukuranArray2 = array.size -1
    for (i in 0..ukuranArray2){
        println(array.get(i))
    }
}

