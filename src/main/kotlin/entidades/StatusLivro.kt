// Corrigindo a extensão de função para inverter o status

package entidades

enum class StatusLivro {
    EMPRESTADO,
    EMESTOQUE
}

fun StatusLivro.inverteStatus(): StatusLivro {
    return if (this == StatusLivro.EMPRESTADO) {
        StatusLivro.EMESTOQUE
    } else {
        StatusLivro.EMPRESTADO
    }
}
