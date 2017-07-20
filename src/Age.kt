import java.util.*

fun main(args:Array<String>){

    println("Entrez l'année de naissance de la personne dont vous souhaitez connaitre l'age :" )
    var Naissance:Int= readLine()!!.toInt()

    var Année = Calendar.getInstance().get(Calendar.YEAR)
    var age= Année - Naissance

    println("Cette personne a $age ans.")
}