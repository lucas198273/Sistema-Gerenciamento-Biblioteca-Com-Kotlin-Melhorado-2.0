package entidades

import java.util.Date


data class Livro(
    val titulo :String,
    val autor : Autor,
    val anoPublicacao: Date,
    var statusLivro: StatusLivro
) {

    fun obterStatusLivro():StatusLivro{
        return  statusLivro
    }
    fun obterTitulo():String{
        return titulo
    }
    fun obterAnoPublicacao():Date{
     return anoPublicacao
    }





}