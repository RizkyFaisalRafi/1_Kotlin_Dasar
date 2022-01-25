fun satu(){
    // Error
    // contohHelloWorld()
}

fun dua(){
    // Error
    // contohHelloWorld()
}

fun main() {
    fun contohHelloWorld(){ // Function Scope ialah function yang bisa di akses dari function tertentu
        println("Hello World")
        satu() // Tidak Error karena scopenya diluar. tidak function di dalam function
        dua() // Tidak Error karena scopenya diluar. tidak function di dalam function
    }
}

