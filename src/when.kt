fun describe(obj: Any): String {
    return when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
}

fun main() {
    val numero = 20
    //when switch case
    when(numero){
        in 1..5 -> println("Sí está entre 1 y 5")
        in 1..3 -> println("Sí está entre 1 y 3")
        else -> println("No está en alguno de los anteriores")
    }


    println(describe(25))
}