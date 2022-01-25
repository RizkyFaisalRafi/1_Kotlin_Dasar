fun main() {
    // Tanpa Return If menggunakan manual setiap if else if harus pakai return
    // bayangkan apabila percabangannya banyak maka setiap if else if harus menggunakan return untuk mengembalikan nilai
    // ada caranya hanya pakai 1 return tetapi kebawah bawahnya udah otomatis ke return
    // Dengan cara seperti di function sayHello2
    fun sayHello(name: String = "") : String{
        if (name == ""){
            return "Hello Bro"
        }else{
            return "Bro $name"
        }
    }
    fun sayHello2(name2: String = ""): String{
        return if (name2 == ""){
            "Hello Bro"
        }else{
            "Hello $name2"
        }
    }
    println("Manual")
    println(sayHello())
    println(sayHello("Faisal"))

    println("\nOtomatis menggunakan return")
    println(sayHello2())
    println(sayHello2("Faisal"))
}

