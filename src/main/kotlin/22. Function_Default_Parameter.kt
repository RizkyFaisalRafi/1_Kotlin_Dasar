// Function parameter ke 2 tidk wajib diisi lagi karena masuk function default parameter
fun hello(firstName: String, lastName: String = ""){ // = "" adalah default argument parameter
        println("Hello $firstName $lastName")
 }
fun hello2(gans: String, kecs: String? = null){ // null adalah default argument parameter
    println("$gans  $kecs")
}

 fun main() {
     hello("Hendrawan", "Wibowo" ) // parameter ke-2 diisi
     hello("Rizky Faisal") // parameter ke-2 kosong
     hello2("Saya", "Ganteng") // parameter ke-2 diisi
     hello2("Saya") // parameter ke-2 kosong
 }

/*
* Beda dengan sebelumnya apabila tidak pakai function default argument parameter
* maka jika parameter ke-2 tidak diisi maka akan error karena wajib memasukannya.
* Apabila menggunakan function default argument parameter maka tidak wajib memasukannya karena null
*/
