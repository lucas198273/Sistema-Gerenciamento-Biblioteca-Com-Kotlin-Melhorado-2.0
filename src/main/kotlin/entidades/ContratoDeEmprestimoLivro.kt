package entidades

import java.util.Date



data class ContratoDeEmprestimoLivro (
    private val prazoMaximoDevolucao: Date,
    private val dataEntrega: Date,

){

    fun obterDataEntrega() : Date{
        return dataEntrega
    }
  fun obterPrazoMaximo(): Date{
      return this.prazoMaximoDevolucao
  }

}



