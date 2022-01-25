tailrec fun display(value: Int){
    println("Recursive $value")
    if(value > 0){
        display(value -1)
    }
}

// Tail Recursive Factorial Function
tailrec fun factorialTail(value: Int, total: Int): Int{
    return when (value){
        1 -> total
        else -> factorialTail(value -1, total * value)
    }
}

fun main() {
    display(10)
    val hasil = factorialTail(10,10)
    println(hasil)
}