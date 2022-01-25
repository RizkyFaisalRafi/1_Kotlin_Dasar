fun main() {
    // Menggunakan factorial Looping
    fun factorialLoop(value: Int): Int{
        var result = 1
        for(i in value downTo 1){
            result *= i
        }
        return result
    }

    // Menggunakan factorial Recursive Function
    fun factorialRecursive(value: Int): Int{
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1) // memanggil dirinya sendiri
        }
    }
    println(factorialLoop(10))
    println(factorialRecursive(10))
}

