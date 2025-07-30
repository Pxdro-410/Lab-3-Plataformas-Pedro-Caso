class IceCream(name: String, price: Double): Food(name, price), Dessert {
    override fun cook(): String {
        val recetaHelado = "Se debe realizar una mezcla entre la leche y alguna fruta para conseguir" +
                " el sabor del helado, despues se coloca en un molde y se pone a enfriar durante " +
                "2 horas aproximadamente."

        return recetaHelado
    }
    override fun eat(): String {
            val comerHelado = "El helado se debe comer lo mas rapido posible, al ser tan frio se derrite " +
                    "en cuestion de minutos, por lo tanto, se debe lamer uniformemente y constantemente " +
                    "para evitar que se derrita."

        return comerHelado
    }
}