fun main(args:Array<String>){

    print("Entrez un nombre entier :")
    var x= readLine()!!.toInt()
    when (x){
        10,20,30,40,50-> {
            println("x vaut 10, 20, 30, 40 ou 50.")
        }
        in 51..99 -> {
            println("x est compris entre 51 et 99.")
        }
        !in 51..99 ->{
            println("x n'est pas compris entre 51 et 99")
        } else -> {
            println("x ne vaut ni 10 ni 20.")
        }
    }
}