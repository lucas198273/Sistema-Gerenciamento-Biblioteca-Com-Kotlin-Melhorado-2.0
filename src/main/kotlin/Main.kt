import entidades.Autor
import entidades.Pessoa
import java.text.SimpleDateFormat

fun main(args: Array<String>) {

    val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")

    val autor : Pessoa = Autor("Niel Gaiman",23,simpleDateFormat.parse("15/05/2000"))

    println(autor)


}