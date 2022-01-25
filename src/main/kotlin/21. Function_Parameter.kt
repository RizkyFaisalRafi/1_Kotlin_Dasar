fun sayHello(firstName: String, lastName: String?){ // By default parameter bersifat Val
    if(lastName == null){
        println(firstName)
    }
    else {
        println("Hallo $firstName $lastName")
    }
}

fun main() {
    sayHello("Rizky Faisal", "Rafi")
    sayHello("Verry", "Sulistyawan")
    sayHello("Joko", null)
}

