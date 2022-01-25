fun hello(name: String) :Unit{
    println("Assalamualaikum $name")
}
fun hello2(name2: String){
    println("Assalamualaikum $name2")
}
fun hello3(name3: String){
    if (name3 == null){
        println("Hello Broo!")
    }
    else {
        println("Hello $name3")
    }
}

fun main() {
    hello("Rizky Faisal Rafi")
    hello2("Hendrawan Wibowo Jatmiko")
    hello3("RIFARA")
}

