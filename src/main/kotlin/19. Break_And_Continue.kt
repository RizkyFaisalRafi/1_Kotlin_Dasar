fun main() {
    var i = 0

    while (true){
        println("HIMTIF")
        i++
        if (i > 10 -1){
            break
        }
    }

    for (i in 1..100){
        if (i % 2 == 0){
            continue
        }
        println(i)
    }
}