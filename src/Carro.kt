class Carro(
    val velocidade: Int,
    val aceleracao: Int,
    val freio: Int,
    val resistencia: Int,
    val tanque: Int,
    val consumo: Int,

    // Comportamnetos para o carr
) {

    // Tipar função
    fun calcularConsumo(): Int {
        return (aceleracao * (consumo * velocidade));
    }
}