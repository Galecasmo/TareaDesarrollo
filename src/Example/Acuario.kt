package example.myapp

import java.lang.Math.PI

// Paso 1: Hacer la clase Acuario abierta
open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var altura: Int = 40
) {
    open var volumen: Int
        get() = ancho * altura * largo / 1000
        set(valor) {
            altura = (valor * 1000) / (ancho * largo)
        }

    open val forma = "rectángulo"

    open var agua: Double = 0.0
        get() = volumen * 0.9

    fun imprimirTamaño() {
        println(forma)
        println("Ancho: $ancho cm Largo: $largo cm Altura: $altura cm")
        // 1 l = 1000 cm^3
        println("Volumen: $volumen l Agua: $agua l (${agua / volumen * 100.0}% lleno)")
    }
}

// Paso 2: Crear una subclase
class TorreAcuario(override var altura: Int, var diámetro: Int) : Acuario(
    largo = diámetro, ancho = diámetro, altura = altura
) {
    override var volumen: Int
        get() = (diámetro / 2 * diámetro / 2 * altura / 1000 * PI).toInt()
        set(valor) {
            altura = ((valor * 1000 / PI) / (diámetro / 2 * diámetro / 2)).toInt()
        }

    override var agua = volumen * 0.8
    override val forma = "cilindro"
}

// Paso 3: Interfaces y delegación
interface AcciónPeces {
    fun comer()
}

interface ColorPeces {
    val color: String
}

class AccionPecesImpresión(val comida: String) : AcciónPeces {
    override fun comer() {
        println(comida)
    }
}

object ColorOro : ColorPeces {
    override val color = "oro"
}

class Plecostomus(fondoPeces: ColorPeces = ColorOro) :
    AcciónPeces by AccionPecesImpresión("comer algas"),
    ColorPeces by fondoPeces

class Tiburón : AcciónPeces, ColorPeces {
    override val color = "gris"
    override fun comer() {
        println("cazar y comer peces")
    }
}

class PecesColor(color: String) : ColorPeces {
    override val color = color
}

// Clase sellada
sealed class Foca
class LeónMarino : Foca()
class Morsa : Foca()

fun hacerCoincidenciaFoca(foca: Foca): String {
    return when (foca) {
        is Morsa -> "morsa"
        is LeónMarino -> "león marino"
    }
}
