package entidades

class Cliente(val nome:String , val email : String ) {

    var livrosEmprestados: MutableList<Livro> = mutableListOf()

    fun pegarLivroemprestar(livro : Livro){
        livrosEmprestados.add(livro)
    }
    fun devolverLivro(livro: Livro){
        livrosEmprestados.remove(livro)
    }

    fun exibirLivrosEmprestados():List<Livro>{
        return livrosEmprestados
    }

    fun buscarLivroEmLista(livro: Livro?): Livro?{
       return if (livrosEmprestados.contains(livro)){
           livro
       }
        else{
            return null
        }
    }
}