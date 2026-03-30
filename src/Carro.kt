class Carro(
    val velocidade: Int,
    val aceleracao: Int,
    val freio: Int,
    val tanque: Int,
    val consumo: Int,
    val resistencia: Int,
    val piloto: Piloto,

    ) {

    // variável para guardar o bônus da habilidade
    var boost: Int = 0

    // funcao que ativa habilidade e da pontos extras ao carro
    fun ativarHabilidade() {
        println("🔥🔥🔥🔥 🚨 WOW! ${piloto.nome} ativou o Nitro e ganhou + 100% de potencia")
        boost = 100
    }
}