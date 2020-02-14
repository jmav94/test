fun esMayor(dato :Int){
    if (dato > 0 ){
        println("$dato")
        "true"
    }else{
        println("$dato")
        "false"
    }
}

fun defineTipo(obj: Any){
    if (obj is String){
        println(obj.length)
    }else if(obj is Int){
        println(obj * 3)
    }
}



fun main (){
    esMayor(5)
    defineTipo("Soy un String")
    defineTipo(5)


    var j = "10"
    var a = 4
    j = if (a > 9) {
        j = "1"
        "0"
    } else {
        j = "4"
        "3"
    }
    println("$j hola este es el valor de j")


    //if operadores lógicos booleano true o false
    val numero = 20
    if (numero.equals(5)){//true
        println("Sí son iguales")
    }else{
        println("No, no son iguales")
    }

}