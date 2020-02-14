fun main() {
    var i = 1
    //while contadores

    while (i < 1 ){//false true
        println("mensaje: $i")
        i.inc()
    }

    i = 1
    do {
        println("mensaje dowhile: $i")
        i++
    }while (i < 1 )
}