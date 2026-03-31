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

    var pontuacaoTotal: Int = 0;

    // funcao que ativa habilidade e da pontos extras ao carro
    fun ativarHabilidade() {
        boost = 50
    }


    fun calcularDesempenho(): Int {
        val desempenhoNestaVolta = velocidade + aceleracao + piloto.habilidade + boost

        // somar ao total acumulado no carro
        pontuacaoTotal += desempenhoNestaVolta
        return desempenhoNestaVolta

        // Zera o Boost depois de usar
        boost = 0
    }


}