class Piloto(
    val nome: String,
    val idade: Int,
    val habilidade: Habilidade) {

    fun usarHabilidade() {
        println("Habilidade ${habilidade.poder} foi usada")
    }
}
