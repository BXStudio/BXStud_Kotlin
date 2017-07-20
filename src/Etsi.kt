fun main(args:Array<String>){

    println("**** Aide au choix de difficulté ****")
    print("Entre ton niveau : ")
    var niveau= readLine()!!.toInt()

    if (niveau<=20){
        println("Vous êtes débutant.")
    }

    if(niveau>=50){
        println("Vous avez un niveau intermédiaire.")
    }

    if(niveau>=90){
        println("Vous avez un très haut niveau !!")
    }

}