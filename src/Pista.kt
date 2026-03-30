class Pista(
    val listaDeCarros: List<Carro>,
    val voltas: Int,
    val clima: String
) {
    // Inicia com uma lista vazia que será preenchida depois
    var posicoes: List<Carro> = listOf()


    //Função que simula a corrida

    //Pontuação de desempenho = atributos do carro + as habilidades dos pilotos,
    // quem tiver a maior pontuação final ganha a corrida
    fun simularCorrida(){
        // Ordena os carros do maior desempenho para o menor
        posicoes = listaDeCarros.sortedByDescending { carro->
            carro.velocidade + carro.aceleracao + carro.piloto.habilidade + carro.boost
        }
    }

    // Exibir placar final
    fun mostrarPlacar(){
        println("--- 🏁 PLACAR FINAL 🏁 ---")
        // forEachIndexed passa por cada carro e nos da a posição (index) dele
        posicoes.forEachIndexed { index, carro ->
            val desempenho = carro.velocidade + carro.aceleracao + carro.piloto.habilidade
            println("${index + 1}º Lugar: ${carro.piloto.nome} (Carro com desempenho: $desempenho)")
        }
     }

}