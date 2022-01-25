fun labelBreak(){
    // Label
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j > 5 ){
                break@loopI
            }
            println("$i X $j = ${i * j}")
        }
    }
}
fun labelContinue(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j > 5 ){
                continue@loopI
            }
            println("$i X $j = ${i * j}")
        }
    }
}
fun labelReturn(){
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)
    test("") test@
    {
        if (it == ""){
            return@test
        }else{
            println("Rizky")
        }
    }
}
// Saat membuat aplikasi jarang menggunakan label,
// karena semakin banyak label semakin susah programmer ngetrack loncatnya kemana ajah
fun main() {
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)
    test("Rafi") test@
    {
        if (it == ""){
            return@test
        }else{
            println("Rizky")
        }
    }
}