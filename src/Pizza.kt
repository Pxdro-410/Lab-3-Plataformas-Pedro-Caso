class Pizza(name: String, price: Double): Food(name, price) {
    override fun cook(): String {
        val recetaPizza = "Se debe agregar queso, salsa y acompañamiento al gusto a la masa" +
                "ya aplanada, despues se mete en el horno durante 10 minutos a fuego alto para que se pueda" +
                "hornear de manera uniforme."
        return recetaPizza
    }
}