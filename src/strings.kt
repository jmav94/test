fun main() {
    // Strings
    val nombre  = "Pedro"
    val apellido: String = "Perez"
    val edad = 20

    println("Su nombre es :" + nombre)
    // String Template
    println("Su nombre es $nombre $apellido")
    println("Su nombre es $nombre $apellido y tiene ${edad+1}")



    // Raw Strings
    val parrafo = """Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
    // tempor incididunt ut labore et dolore magna aliqua.
    // Ut enim ad minim veniam,
    ** quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo

    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
    proident, sunt in culpa qui officia deserunt mollit anim id est laborum.""".trimIndent()

    println(parrafo)

    val parrafoA = """Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
// tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
// quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo

// consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
// cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
// proident, sunt in culpa qui officia deserunt mollit anim id est laborum.""".trimIndent()

    println(parrafoA.trimMargin("// "))

    // Secuencias de Escape

    val nombreCompleto = "Pedro \nPerez"
    println("tu nombre es: $nombreCompleto")
}