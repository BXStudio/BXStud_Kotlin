fun main(args:Array<String>){

    println("**** Aide au choix de difficulté ****")
    print("Entre ton niveau : ")
    var niveau= readLine()!!.toInt()

    if (niveau<=20){
        if(niveau<=10){
            println("Lancez le didactitiel !")
        } else {
            println("Vous avez un niveau débutant.")
        }

    }else if(niveau>=50 && niveau<90){
        println("Vous avez un niveau intermédiaire.")

    }else if(niveau>=90 && niveau<=100){
        println("Vous avez un très haut niveau !!")
    } else {
        println("Votre niveau ne correspond à aucune difficulté existante.")
    }

}