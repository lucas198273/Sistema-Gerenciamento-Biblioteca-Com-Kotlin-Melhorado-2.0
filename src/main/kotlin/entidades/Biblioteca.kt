package entidades

import java.text.SimpleDateFormat
import java.util.*

class Biblioteca {

    var simpleDateFormat : SimpleDateFormat = SimpleDateFormat("(dd/MM/yyyy)")
    var estoqueLivro: MutableMap<String,Livro> = mutableMapOf<String,Livro>()
    var  listaDeContratos : MutableMap<Cliente,ContratoDeEmprestimoLivro> = mutableMapOf<Cliente,ContratoDeEmprestimoLivro>()

    fun estipularPrazosDoContrato():ContratoDeEmprestimoLivro{
        val scanner = Scanner(System.`in`)
        var contratoDeEmprestimoLivro : ContratoDeEmprestimoLivro
        println("Agora Vamos estipular os Prazos do contrato! ")
        println("Padrao das Datas '(dd/MM/yyyy)' ")
        println("ENTRE COM A DATA DE ENTREGA : \n =>")
        var dataEntrega  = scanner.next()
        println("ENTRE COM A DATA MAXIMA DE DEVOLUÇÃO: \n =>")
        val prazoMaximo= scanner.next()
        val entrega = simpleDateFormat.parse(dataEntrega)
        var prazo = simpleDateFormat.parse(prazoMaximo)
        return  ContratoDeEmprestimoLivro(prazo,entrega)
    }
    fun calcularAtrasoDevolucao(dataDevolucao :Date,contratoDeEmprestimoLivro: ContratoDeEmprestimoLivro): Long {
        // Verificar se a data de devolução é após o prazo máximo
        val prazoMaximoDevolucao = contratoDeEmprestimoLivro.obterPrazoMaximo()

        if (dataDevolucao!!.after(prazoMaximoDevolucao)) {
            val diferenca = dataDevolucao.time - prazoMaximoDevolucao.time
            val diasDeAtraso = diferenca / (24 * 60 * 60 * 1000) // Converter milissegundos em dias
            return diasDeAtraso
        } else {
            return 0
        }
    }
    fun processarFatura(diasAtraso: Int): Int{
        val precoPorDia = 15
        // Calcular o valor da fatura com base nos dias de atraso e no preço por dia
        val valorFatura = diasAtraso * precoPorDia
        return valorFatura
    }

    fun obterListaContratos(): MutableMap<Cliente,ContratoDeEmprestimoLivro>{
        return  listaDeContratos

    }

 /*   prazoMaximoDevolucao: Date,
    private val dataEntrega: Date,
    private val dataDevolucao: Date?
            */

   /* fun contratoDeEmprestimoLivro.registrarContrato(){

        listaDeContratos.put(cliente,livro)

    }*/

    fun adicionarAoEstoque(livro:Livro ){

        if(estoqueLivro.containsValue(livro)){
            if(livro.statusLivro== StatusLivro.EMPRESTADO){

            }
        }
    }

    fun buscarLivroEmLista(livro: Livro?): Livro?{
        return if (estoqueLivro.containsValue(livro)){
            livro
        }
        else{
            return null
        }
    }
    fun receberLivro(livro : Livro){

        if(estoqueLivro.containsValue(livro)&& livro.statusLivro == StatusLivro.EMPRESTADO){

        }

    }


}