fun main() {
    fun sayHello(name: String = ""): String{
        when(name){
            "" -> return "Hello Bro"
            else -> return "Hello $name"
        }
    }

    fun sayHello2(name: String = ""): String{
        return when(name){
            "" -> "Hello Bro"
            else -> "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello2("Faisal"))
}

