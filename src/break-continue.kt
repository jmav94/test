fun main() {
    /*for (i in 1..3)
    { println("\ni: $i ")
        for (j in 1..5)
        { if (j.equals(5)) break
            println("j: $j")
        }
    }*/

    /*for (i in 1..3)
    { println("\ni: $i ")
        for (j in 1..5)
        { if (j.equals(3)) continue
            println("j: $j")
        }
    }*/


    terminarTodoCiclo@for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue@terminarTodoCiclo
                println("k: $k")
            }
        }
    }



}