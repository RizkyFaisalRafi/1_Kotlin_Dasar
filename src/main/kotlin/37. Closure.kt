fun main() {
    var counter: Int = 0 // variabel biasa
    val lambdaIncrement: () -> Unit = { // Lambda
        println("Increment")
        counter++ // Bisa mengakses data diluar si lambda'nya
    }

    val anonymousIncrement = fun(){ // Anonymous Function
        println("Anonymous Function Increment")
        counter++
    }

    fun functionBiasa(){ // function Biasa
        println("Function Increment")
        counter++
    }
    lambdaIncrement()
    anonymousIncrement()
    functionBiasa()

    lambdaIncrement()
    anonymousIncrement()
    functionBiasa()

    println(counter) // counter hasilnya menjadi 6
}

