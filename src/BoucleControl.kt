fun main(args:Array<String>){

    for (compteur in 1..8){

        for(compteur2 in 1..4){
            println("Compteur : $compteur2")
            if(compteur2==2)
                break
        }
    }
}