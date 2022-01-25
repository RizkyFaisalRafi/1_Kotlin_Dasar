// Lambda tidak cocok dengan yang kompleks seperti if,else if, when, dan sebagainya
// Kata kunci return tidak disupport oleh lambda.
// Solusinya gunakan Anonymous Function
fun main() {
    fun hello(value: String, transform: (String)-> String): String{ // Higher Order Function
        return "HI ${transform(value)}"
    }

    val anonymousUpper = fun (value: String): String{ // Anonymous Function menggunakan kata kunci fun
        if(value.isBlank()){
            return "Rizky"
        }else{
            return value.toUpperCase()
        }
    }
    val result = hello("Faisal", anonymousUpper)
    println(result)

    // Bisa seperti ini Anonymous Function sebagai paramater
    val result1 = hello("Rizky", fun(value1: String): String{
        if (value1.isBlank()){
            return "Hendrawan"
        }else{
            return value1.toUpperCase()
        }
    })
    println(result1) // Cetak Anonymous Function sebagai paramater
    println(hello("Rafi", fun (value: String): String{ //Anonymous Function sebagai paramater
        return value.toLowerCase()
    }))
}

