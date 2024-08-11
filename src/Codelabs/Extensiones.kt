package Codelabs

fun String.tieneEspacios() = find { it == ' ' } != null

fun PlantaAcuatica?.extraer() {
    this?.apply {
        println("eliminando $this")
    }
}
