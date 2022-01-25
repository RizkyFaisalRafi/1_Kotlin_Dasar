inline fun helloi2(firstName:() -> String,
                   noinline lastName:()-> String):String{ // No Inline
    return "Hallo ${firstName()} ${lastName()}"
}
fun main() {
    println(helloi2({"Rizky"}, {"Faisal"})) // No Inline di "Faisal"
    for(i in 0..100){
        println(helloi2({"Hendrawan"}, {"Wibowo"})) // First name menggunakan Inline
        // LastName menggunakan NoInline
    }
}