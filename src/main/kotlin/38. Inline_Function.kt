// Higher Order Function yaitu Lambda dijadikan sebagai parameter di sebuah function
 inline fun hello(name:() -> String):String{ // Higher Order Function
    return "Hallo ${name()}"
}

fun main() {
    println(hello { "Faisal" }) // bisa memanggil mengunakan Trailing Lambda
    println(hello { "Hendra" }) // bisa memanggil mengunakan Trailing Lambda

    println(hello2({"Rizky"}, {"Faisal"})) // No Inline di "Faisal"
}

// kapan kita butuh menggunakan Inline :
// Kalau bisa sih saat butuh ajah, kalau semua dijadikan inline nantinya source code byte codenya
// akan terlalu besar karena codenya semuanya di duplicate
// Jadi sekiranya oh ini bakal menggunakan looping berapa artus kali maka bisa gunakan inline
// ============================================================================================

// no inline
// apabila kita gamau membuat 1 / 2 parameter menjadi inline/ tetep menjadi object, maka
// bisa gunakan kata kunci Noinline

inline fun hello2(firstName:() -> String,
                  noinline lastName:()-> String):String{ // No Inline
    return "Hallo ${firstName()} ${lastName()}"
}
