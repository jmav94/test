//const tiempo de compilación
const val N = "NAME" // constantes de ambito global
var n = "n" //mala practica de programación... son variables globales mutables
val n2 = "n" //variables globales y se asigna en tiempo de ejecución

fun main(args: Array<String>) {
    println("Hola Mundo")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    val name = "Juan"   //tiempo de ejecución
    println(name)
    println(N)


}






