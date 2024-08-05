fun main() {

    val numero1 = 5
    val numero2 = 3


    val suma = numero1 + numero2
    println("La suma de $numero1 y $numero2 es $suma")

    val resta = numero1 - numero2
    println("La resta de $numero1 y $numero2 es $resta")

    val multiplicacion = numero1 * numero2
    println("La multiplicación de $numero1 y $numero2 es $multiplicacion")

    val division = numero1 / numero2
    println("La división de $numero1 y $numero2 es $division")


    val decimal1 = 5.0
    val decimal2 = 2.5

    val sumaDecimal = decimal1 + decimal2
    println("La suma de $decimal1 y $decimal2 es $sumaDecimal")

    val restaDecimal = decimal1 - decimal2
    println("La resta de $decimal1 y $decimal2 es $restaDecimal")

    val multiplicacionDecimal = decimal1 * decimal2
    println("La multiplicación de $decimal1 y $decimal2 es $multiplicacionDecimal")

    val divisionDecimal = decimal1 / decimal2
    println("La división de $decimal1 y $decimal2 es $divisionDecimal")


    val resultadoMultiplicacion = numero1.times(4)
    println("El resultado de $numero1 times 4 es $resultadoMultiplicacion")

    val resultadoSuma = decimal1.plus(2.5)
    println("El resultado de $decimal1 plus 2.5 es $resultadoSuma")

    val resultadoDivision = decimal1.div(2)
    println("El resultado de $decimal1 div 2 es $resultadoDivision")


    val entero = 10
    val valorByte: Byte = entero.toByte()
    println("El valor byte es $valorByte")

    val valorDouble: Double = entero.toDouble()
    println("El valor double es $valorDouble")

    val valorString: String = entero.toString()
    println("El valor string es $valorString")


    val unMillon = 1_000_000
    val numeroSeguridadSocial = 999_99_9999L
    val bytesHexadecimales = 0xFF_EC_DE_5E
    val bytesBinarios = 0b11010010_01101001_10010100_10010010

    println("Un millón es $unMillon")
    println("Número de seguridad social es $numeroSeguridadSocial")
    println("Bytes hexadecimales es $bytesHexadecimales")
    println("Bytes binarios es $bytesBinarios")


    var variableMutable = 10
    println("Valor inicial de variableMutable: $variableMutable")
    variableMutable = 20
    println("Valor modificado de variableMutable: $variableMutable")

    val variableInmutable = 30
    println("Valor de variableInmutable: $variableInmutable")


    val numeroDePeces = 50
    val numeroDePlantas = 23

    println()
    if (numeroDePeces > numeroDePlantas) {
        println("¡Buena proporción!")
    } else {
        println("Proporción poco saludable")
    }

    val peces = 50
    if (peces in 1..100) {
        println(peces)
    }

    if (numeroDePeces == 0) {
        println("Tanque vacío")
    } else if (numeroDePeces < 40) {
        println("¡Hay peces!")
    } else {
        println("¡Eso es un montón de peces!")
    }

    when (numeroDePeces) {
        0 -> println("Tanque vacío")
        in 1..39 -> println("¡Hay peces!")
        else -> println("¡Eso es un montón de peces!")
    }

    println()

    var canicas: Int? = null


    val listaDeCanicas: List<Int?> = listOf(1, null, 3)



    var comidaPeces: Int? = 6

    comidaPeces = comidaPeces?.dec()
    println("Comida de peces (forma corta): $comidaPeces")


    comidaPeces = null
    comidaPeces = comidaPeces?.dec() ?: 0
    println("Comida de peces con valor predeterminado: $comidaPeces")


    val cadena: String? = "Hola Mundo"
    val longitud = cadena!!.length
    println("Longitud de la cadena: $longitud")

    println()



    val escuela = listOf("caballa", "trucha", "lenguado")
    println("Lista inmutable: $escuela")


    val miLista = mutableListOf("atún", "salmón", "tiburón")
    miLista.remove("tiburón")
    println("Lista mutable después de eliminar un elemento: $miLista")


    val escuelaArreglo = arrayOf("tiburón", "salmón", "pececillo")
    println("Arreglo de cadenas: ${java.util.Arrays.toString(escuelaArreglo)}")


    val mezcla = arrayOf("pez", 2)
    println("Arreglo con tipos mixtos: ${java.util.Arrays.toString(mezcla)}")


    val numeros = intArrayOf(1, 2, 3)
    println("Arreglo de enteros: ${java.util.Arrays.toString(numeros)}")


    val numeros2 = intArrayOf(4, 5, 6)
    val combinado = numeros2 + numeros
    println("Arreglo combinado: ${java.util.Arrays.toString(combinado)}")
    println("Elemento en la posición 5 del arreglo combinado: ${combinado[5]}")


    val oceanos = listOf("Atlántico", "Pacífico")
    val listaExtraña = listOf(numeros, oceanos, "salmón")
    println("Lista extraña: $listaExtraña")


    val arregloInicializado = Array(5) { it * 2 }
    println("Arreglo inicializado: ${java.util.Arrays.toString(arregloInicializado)}")




    val escuelaArreglo2 = arrayOf("tiburón", "salmón", "pececillo")
    for (elemento in escuelaArreglo2) {
        print("$elemento ")
    }
    println()


    for ((índice, elemento) in escuelaArreglo2.withIndex()) {
        println("Elemento en el índice $índice es $elemento")
    }


    for (i in 1..5) print(i)
    println()

    for (i in 5 downTo 1) print(i)
    println()

    for (i in 3..6 step 2) print(i)
    println()

    for (i in 'd'..'g') print(i)
    println()


    var burbujas = 0
    while (burbujas < 50) {
        burbujas++
    }
    println("$burbujas burbujas en el agua")


    do {
        burbujas--
    } while (burbujas > 50)
    println("$burbujas burbujas en el agua")


    repeat(2) {
        println("Un pez está nadando")
    }





}
