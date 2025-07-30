class Juice(name: String, price: Double): Drink(name, price) {
    override fun pour(): String {
        val verterJugo = "Una vez con la jarra de jugo o bien la botella, se procede a " +
                "agarrar un vaso, de tamaño a gusto, para servir la cantidad deseada de jugo."

        return verterJugo
    }

    override fun cook(): String {
        val exprimirJugo = "Primero se consigue la fruta, despues se parte en pedazos si se desea " +
                "para poder exprimirla con mas facilidad, despues se verte el jugo en una jarra " +
                "con un poco de azucar y se mezcla con una cuchara y conseguir el resultado final"

        return exprimirJugo
    }
}