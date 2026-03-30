fun main() {

    // todo menu corrida
    // todo iniciar corrida
    // todo escolher carro (ver lista de carros e digitar o nome do carro escolhido)
    // todo sair

    // todo Placar

    // Instância dos 10 carros e pilotos
    val piloto1 = Piloto("Ayrton", 43, 10)
    val piloto2 = Piloto("Relampago Marquinhos", 10, 10)
    val piloto3 = Piloto("Max Verstappen", 26, 98)
    val piloto4 = Piloto("Lewis Hamilton", 39, 97)
    val piloto5 = Piloto("Charles Leclerc", 26, 95)
    val piloto6 = Piloto("Lando Norris", 24, 92)
    val piloto7 = Piloto("Fernando Alonso", 42, 96)
    val piloto8 = Piloto("Oscar Piastri", 22, 90)
    val piloto9 = Piloto("George Russell", 26, 91)
    val piloto10 = Piloto("Sergio Perez", 34, 88)

    val carro1 = Carro(200, 15, 10, 50, 5, 100, piloto1)
    val carro2 = Carro(300, 25, 10, 40, 8, 40, piloto2)
    val carro3 = Carro(320, 95, 90, 100, 8, 85, piloto3)
    val carro4 = Carro(318, 93, 92, 100, 7, 88, piloto4)
    val carro5 = Carro(322, 96, 88, 100, 9, 82, piloto5)
    val carro6 = Carro(315, 90, 89, 100, 7, 85, piloto6)
    val carro7 = Carro(312, 88, 94, 100, 6, 92, piloto7)
    val carro8 = Carro(310, 91, 87, 100, 8, 84, piloto8)
    val carro9 = Carro(316, 92, 91, 100, 8, 87, piloto9)
    val carro10 = Carro(308, 85, 86, 100, 7, 90, piloto10)

    // Função listOf para Agrupar elementos (Lista de carros)
    val listaDeLargada = listOf(carro1, carro2, carro3, carro4, carro5, carro6, carro7, carro8, carro9, carro10)

    // Criando a pista
    val monaco = Pista(listaDeLargada, 50, "Ensolarado")

    // Simulando a corrida e mostrando o resultado
    println("A corrida de ${monaco.voltas} voltar começou! Clima: ${monaco.clima}")
    monaco.simularCorrida()
    monaco.mostrarPlacar()

}
