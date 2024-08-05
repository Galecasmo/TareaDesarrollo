import java.util.*

// Lista de decoraciones del acuario
val decorations = listOf("roca", "pagoda", "planta de plástico", "caimán", "maceta")

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Hola, ${args[0]}")
    } else {
        println("Hola, mundo!")
    }

    val esUnit = println("Esto es una expresión")
    println(esUnit)

    val temperatura = 10
    val esCaliente = if (temperatura > 50) true else false
    println(esCaliente)

    val mensaje = "La temperatura del agua es ${if (temperatura > 50) "demasiado caliente" else "aceptable"}."
    println(mensaje)

    alimentarLosPeces()

    nadar()
    nadar("lenta")
    nadar(velocidad = "como una tortuga")

    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")

    val filtroDeAgua: (Int) -> Int = { sucio -> sucio / 2 }
    println(filtroDeAgua(20))

    fun actualizarSucio(sucio: Int, operacion: (Int) -> Int): Int {
        return operacion(sucio)
    }

    val filtroDeAguaLambda: (Int) -> Int = { sucio -> sucio / 2 }
    println(actualizarSucio(30, filtroDeAguaLambda))

    fun aumentarSucio(inicio: Int) = inicio + 1
    println(actualizarSucio(15, ::aumentarSucio))

    var nivelDeSuciedad = 19
    nivelDeSuciedad = actualizarSucio(nivelDeSuciedad) { suciedad -> suciedad + 23 }
    println(nivelDeSuciedad)
}

fun alimentarLosPeces() {
    val dia = diaAleatorio()
    val comida = comidaParaPeces(dia)
    println("Hoy es $dia y los peces comen $comida")
    println("Cambiar agua: ${debeCambiarAgua(dia)}")
}

fun nadar(velocidad: String = "rápida") {
    println("nadando $velocidad")
}

fun debeCambiarAgua(dia: String, temperatura: Int = 22, sucia: Int = 20): Boolean {
    return when {
        esDemasiadoCaliente(temperatura) -> true
        estaSucia(sucia) -> true
        esDomingo(dia) -> true
        else -> false
    }
}

fun esDemasiadoCaliente(temperatura: Int) = temperatura > 30

fun estaSucia(sucia: Int) = sucia > 30

fun esDomingo(dia: String) = dia == "Domingo"

fun diaAleatorio(): String {
    val semana = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    return semana[Random().nextInt(semana.size)]
}

fun comidaParaPeces(dia: String): String {
    return when (dia) {
        "Lunes" -> "hojuelas"
        "Martes" -> "pellets"
        "Miércoles" -> "gusanos rojos"
        "Jueves" -> "gránulos"
        "Viernes" -> "mosquitos"
        "Sábado" -> "lechuga"
        "Domingo" -> "plancton"
        else -> "nada"
    }
}