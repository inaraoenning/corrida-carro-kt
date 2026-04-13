class Pista(
    val listaDeCarros: List<Carro>,
    val voltas: Int,
    val clima: String
) {
    // Inicia com uma lista vazia que será preenchida depois
    var posicoesLargada: List<Carro> = listOf()

    fun organizarLargada() {
        // Ordena os carros do maior desempenho para o menor
        posicoesLargada += listaDeCarros.shuffled()
    }

    fun mostrarPosicoesLargada() {
        println("\n--- 🚥 POSIÇÕES DE LARGADA 🚥 ---")
        // Percorrer simultaneamente valor e posicao 
        posicoesLargada.forEachIndexed { index, carro ->
            println("${index + 1}º Lugar: ${carro.piloto.nome} ")
        }
    }

    //Função que simula a corrida

    //Pontuação de desempenho = atributos do carro + as habilidades dos pilotos,
    // quem tiver a maior pontuação final ganha a corrida
    fun simularCorrida(meuCarro: Carro, oponentesLargada: List<Carro>) {


        // Simulação 3 voltas
        for (volta in 1..voltas) {
            println("""--- 🚩 $volta / $voltas 🚩 """)
            println("Deseja usar sua habilidade especial nessa volta? (S/N)")
            val usarHabilidade = readln().uppercase() == "S"

            if (usarHabilidade) {
                meuCarro.ativarHabilidade()
                println("🔥🔥🔥🔥 🚨 WOW! VOCÊ ativou o Nitro e ganhou + 50% de potencia")
            }

            for (oponente in oponentesLargada) {
                // Chance de 25% de usar o nitro
                val chance = (1..100).random()
                if (chance > 75) {
                    oponente.ativarHabilidade()
                    println("🔥🔥🔥🔥 🚨 WOW! ${oponente.piloto.nome} ativou o Nitro e ganhou + 50% de potencia")
                }
            }

            // Calcula desempenho de todos
            for (carro in listaDeCarros) {
                carro.calcularDesempenho()
            }

            // Mostra posições na volta
            val posicaoVolta = listaDeCarros.sortedByDescending { it.pontuacaoTotal }

            println("-- Posições da $volta Volta --")
            posicaoVolta.forEachIndexed { index, carro ->
                println("${index + 1}º Lugar: ${carro.piloto.nome} | ${carro.pontuacaoTotal}")
            }
        }
    }

    // Exibir placar final
    fun mostrarPlacar() {
        println("--- 🏁 PLACAR FINAL 🏁 ---")

        // Ordena pela pontuação TOTAL acumulada durante as voltas
        val posicoesFinais = listaDeCarros.sortedByDescending { it.pontuacaoTotal }

        posicoesFinais.forEachIndexed { index, carro ->
            println("${index + 1}º Lugar: ${carro.piloto.nome}  | ${carro.pontuacaoTotal} ")
        }
    }
}