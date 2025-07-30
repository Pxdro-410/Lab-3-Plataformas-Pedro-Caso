abstract class Food(val name: String, val price: Double) {
    abstract fun cook(): String
    }

fun Food.discountedPrice(porcentaje: Double): Double {
    require(porcentaje >= 0 && porcentaje <= 100)
    val precioFinal = price * (1 - porcentaje/100)
    return precioFinal
}