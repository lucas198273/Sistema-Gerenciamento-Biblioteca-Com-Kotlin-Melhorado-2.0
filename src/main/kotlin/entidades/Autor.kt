package entidades

import java.util.Date

class Autor: Pessoa {

    val obrasPublicadas : MutableList<Livro> = mutableListOf()
    val dataNascimento : Date

    /*Construtor Secundario*/

    constructor(nome: String, Idade:Int,dataNascimento:Date):super(nome,Idade){
        this.dataNascimento = dataNascimento
    }

    override fun toString(): String {
        return "Autor: ${nome}, ${idade}, ${dataNascimento}"

    }


}