import java.lang.NullPointerException

fun main() {
    var variable: Int?
    variable = null
    println(variable)
    //variable.metodo() // O de esta manera

    //fun metodo(): Int?{
    //    return null!!
    //}

    //var filePath = arguments?.getString(ARGUMENTS_PATH) // Podemos usar Double Bang !!
    /*var msg: String?
    msg = null
    println(msg!!.length)*/

   try {
       var compute: String
       compute = readLine()!!
       var longitud: Int = compute.length
   }catch (e: NullPointerException){
       println("Ingresa un valor, no aceptamos nulos")
   }

    //Llamada Segura
    var compute: String? = null
    var longitud:  Int?= compute?.length ?: 0 //null
    println("Longitud: $longitud")

    //Operador Elvis
    var teclado: String? = null
    val longitudTeclado: Int = teclado?.length ?: 5
    println("Longitud Teclado: $longitudTeclado")

    val listWithNulls: List<Int?> = listOf(7,null,null,4)
    println("Lista con Null: ${listWithNulls}")

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithoutNulls)
}