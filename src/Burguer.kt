class Burguer(name: String, price: Double): Food(name, price) {
    override fun cook(): String {
        val recetaHamburgeusa = "Se debe asar la carne de hamburguesa de lado y " +
                "lado por 3 minutos a fuego intenso para conseguir el punto exacto, despues se " +
                "une con los demas ingredientes a gusto del cliente"
        return recetaHamburgeusa
    }
}