package example.myapp

fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamaño()

    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamaño()

    val acuario3 = Acuario(altura = 35, largo = 110)
    acuario3.imprimirTamaño()

    val acuario4 = Acuario(ancho = 25, altura = 35, largo = 110)
    acuario4.imprimirTamaño()

    val acuario6 = Acuario(largo = 25, ancho = 25, altura = 40)
    acuario6.imprimirTamaño()

    acuario6.volumen = 70
    acuario6.imprimirTamaño()

    val miTorre = TorreAcuario(diámetro = 25, altura = 40)
    miTorre.imprimirTamaño()
}

fun hacerPeces() {
    val tiburón = Tiburón()
    val pleco = Plecostomus()

    println("Tiburón: ${tiburón.color}")
    tiburón.comer()
    println("Plecostomus: ${pleco.color}")
    pleco.comer()
}

fun main() {
    construirAcuario()
    hacerPeces()
}
