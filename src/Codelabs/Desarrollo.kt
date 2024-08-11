package Codelabs

fun main() {
    // Pairs y Triples
    val equipo = "red de pescar" to "atrapar peces"
    println("${equipo.first} usado para ${equipo.second}")

    val equipo2 = ("red de pescar" to "atrapar peces") to "equipo"
    println("${equipo2.first} es ${equipo2.second}")
    println("${equipo2.first.second}")

    val numeros = Triple(6, 9, 42)
    println(numeros.toString())
    println(numeros.toList())

    val (n1, n2, n3) = numeros
    println("$n1 $n2 $n3")

    // Listas y Hash Maps
    val listaNumeros = listOf(1, 5, 3, 4)
    println("Suma de la lista de números: ${listaNumeros.sum()}")

    val listaStrings = listOf("a", "bbb", "cc")
    println("Suma de la longitud de los strings: ${listaStrings.sumOf { it.length }}")

    for (s in listaStrings.listIterator()) {
        print("$s ")
    }
    println()

    val cures = hashMapOf("puntos blancos" to "Ich", "heridas rojas" to "enfermedad de hoyos")
    println(cures["puntos blancos"])
    println(cures.getOrElse("hinchazón") { "No tengo cura para esto" })

    val inventario = mutableMapOf("red de pescar" to 1)
    inventario["cepillo para tanque"] = 3
    println(inventario)
    inventario.remove("red de pescar")
    println(inventario)

    // Uso de funciones de extensión
    println("¿La planta tiene espacios?: ${"Texto de prueba".tieneEspacios()}")
    val planta = PlantaAcuatica("verde", 10)
    planta.extraer()
    println("¿La planta es roja?: ${planta.esRoja()}")
}
