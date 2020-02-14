import java.lang.Integer.parseInt

object Marcas{
    val honda = "Honda"
    val chevrolet = "Chevrolet"
    val bmw = "BMW"
    val nissan = "Nissan"
    val audi = "Audi"
    val gmc = "GMC"
    val ford = "Ford"
    val kia = "Kia"
}
object features{
    val ac = "Aire Acondicionado"
    val transmisionA = "Transmision Automatica"
    val abs = "Frenos ABS"
    val bolsas = "Bolsas de Aire Frontales"
    val ctrlElec = "Controles Electricos"
    val ctrlBlue = "Controles de audio y Bluetooth al volante"
    val cam = "Cámara de reversa"
    val pantalla = "Pantalla"
}
object specialFeatures {
    val faros = "Faros Led"
    val piel = "Asientos de Piel"
    val rines = "Rines de 17 Pulgadas"
}

fun leerRespuesta(): Int {
    return try {
        parseInt(readLine())
    } catch (e: Exception) {
        0
    }
}

fun main() {
    val autos: ArrayList<ArrayList<String>> = arrayListOf()

    println("Bienvenido")

    do {
        println(
            """
Selecciona la opción deseada
    1. Ensamblar un Auto
    2. Ver mis Autos
    3. Salir
    """.trimMargin()
        )

        var respuesta = true
        val response = leerRespuesta()
        when (response) {
            1 -> {
                println("Captura el nombre del Auto")
                val name = readLine() ?: "Auto Sin nombre"
                println("\tAgregar una Caracteristica")
                var agregar = true
                val auto: ArrayList<String> = arrayListOf()
                auto.add(name)
                do {
                    println("\tSelecciona una caracteristica")

                    println("\t\t1. Aire Acondicionado")
                    println("\t\t2. Transmision Automatica")
                    println("\t\t3. Frenos ABS")
                    println("\t\t4. Bolsas de aire frontales ")
                    println("\t\t5. Vidrios, espejos y seguros eléctricos ")
                    println("\t\t6. Controles de audio y Bluetooth al volante")
                    println("\t\t7. Cámara de reversa\n")
                    println("\t\t0. Salir")

                    val respuesta: Int = leerRespuesta()
                    when (respuesta) {
                        1 -> {
                            auto.add(features.ac)
                            println("\tAgregado: Aire Acondicionado")
                        }
                        2 -> {
                            auto.add(features.transmisionA)
                            println("\tAgregado: Transmision Automatica")
                        }
                        3 -> {
                            auto.add(features.abs)
                            println("\tAgregado: Frenos ABS")
                        }
                        4 -> {
                            auto.add(features.bolsas)
                            println("\tAgregado: ${features.bolsas}")
                        }
                        5 -> {
                            auto.add(features.ctrlElec)
                            println("\tAgregado: ${features.ctrlElec}")
                        }
                        6 -> {
                            auto.add(features.ctrlBlue)
                            println("\tAgregado: ${features.ctrlBlue}")
                        }
                        7 -> {
                            auto.add(features.cam)
                            println("\tAgregado: ${features.cam}")
                        }
                        else -> agregar = false
                    }
                } while (agregar)

                println("Agregar Caracterisitas especiales")
                var agregar2 = true
                do{
                    println("\tSelecciona una caracteristica Especial")

                    println("\t\t1. Faros Led")
                    println("\t\t2. Asientos de Piel")
                    println("\t\t3. Rines de 17 Pulgadas")
                    println("\t\t0. Salir")

                    val respuesta2: Int = leerRespuesta()

                    when(respuesta2){
                        1 -> {
                            auto.add(specialFeatures.faros)
                            println("\tAgregado: Faros Led")
                        }
                        2 -> {
                            auto.add(specialFeatures.piel)
                            println("\tAgregado:  Asientos de Piel")
                        }
                        3 -> {
                            auto.add(specialFeatures.rines)
                            println("\tAgregado: Rines de 17 Pulgadas")
                        }
                        else -> agregar2 = false
                    }
                }while (agregar2)
                autos.add(auto)
            }
            2 -> {

                for(item in autos){
                    print(" ${item.first()}: $item")
                }

//                autos.forEachIndexed { index, item ->
//                    println("Auto ${index + 1}: $item")
//                }
            }
            else -> respuesta = false
        }

    } while (respuesta)
}