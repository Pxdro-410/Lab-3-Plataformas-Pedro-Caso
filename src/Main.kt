// ----------------------------------------------------------------------------------------------------------
// Pedro Caso
// 241286
// lab 3
// Programacion de plataformas moviles
// ----------------------------------------------------------------------------------------------------------

fun main() {
// ----------------------------------------------------------------------------------------------------------
    // tarea 8:
    // Instancia de las clases para la comida
    val hamburguesa1 = Burguer("Big Mac", 35.00)
    val hamburguesa2 = Burguer("Triple Bacon", 49.99)
    val pizza1 = Pizza("Pizza 4 carnes", 60.00)
    val pizza2 = Pizza("Pizza Super Peperonni", 70.00)
    val helado1 = IceCream("helado de chocolate", 8.00)
    val helado2 = IceCream("helado de vainilla con fresas", 10.50)
    val bebida1 = Juice("limonada", 15.00)
    val bebida2 = Juice("Jugo de naranja", 12.00)

    // impresion de la receta de cada uno
    println("\nRESTAURANTE PC")
    println("Esta es la receta para preparar los alimentos: ")
    println("\nHamburgesas:")
    println("para la ${hamburguesa1.name} se debe seguir estos pasos: ${hamburguesa1.cook()}")
    println("para la ${hamburguesa2.name} se debe seguir estos pasos: ${hamburguesa2.cook()}")
    println("\nPizzas:")
    println("para la ${pizza1.name} se debe seguir estos pasos: ${pizza1.cook()}")
    println("para la ${pizza2.name} se debe seguir estos pasos: ${pizza2.cook()}")
    println("\nHelados:")
    println("para el ${helado1.name} se debe seguir estos pasos: ${helado1.cook()}")
    println("para el ${helado2.name} se debe seguir estos pasos: ${helado2.cook()}")
    println("\nBebidas:")
    println("para la ${bebida1.name} se debe seguir estos pasos: ${bebida1.cook()}")
    println("para la ${bebida2.name} se debe seguir estos pasos: ${bebida2.cook()}")

// ----------------------------------------------------------------------------------------------------------
    // tarea 9
    println("\nAsi puedes disfrutar de tu helado como postre: ")
    println("para el ${helado1.name}, puedes seguir esta instruccion: ${helado1.eat()}")
    println("para el ${helado2.name}, puedes seguir esta instruccion: ${helado2.eat()}")

// ----------------------------------------------------------------------------------------------------------
    // tarea 10
    val descuento = 10.00
    val precioFinal = hamburguesa1.discountedPrice(descuento)

    println("\nLos productos con descuento son:")
    println("1. ${hamburguesa1.name} con descuento de $descuento%")
    println("precio original: Q${hamburguesa1.price}")
    println("precio con descuento: Q${(precioFinal)}")
}
