fun main(args:Array<String>){

    var arraylist= ArrayList<String>()
    // --> Le tableau n'est pas soumis à une taille fixe <--
    arraylist.add("Romain") // 0
    arraylist.add("Alberto") // 1
    arraylist.add("Warren") // 2
    arraylist.add("Thomas") // 3
    print("Souhaitez vous rentrer un nom ? (OUI / NON) : ")
    var UWTA:String = readLine()!!
    var case = 3
    while(UWTA == "OUI"){
        ++case
        print("arrayStr[$case]= ")
        arraylist.add(readLine()!!)
        print("Souhaitez vous continuer ? (OUI / NON) : ")
        UWTA = readLine()!!
    }

    println("Le premier coureur s'appelle " + arraylist.get(0)+ ".")
    // On associe à la case 0 un nouveau nom
    arraylist.set(0, "Romain Bardet")
    println("Les autres sont :")
    for(coureurs in arraylist) {
       if (coureurs == arraylist[case]) { // ou if(coureurs == "readLine()!!"
            println(coureurs.split("  "))
        } else {
            print(coureurs.split("  "))
        }
     //if(coureurs== arraylist[3]) println(coureurs.split("  ")) else print(coureurs.split("  "))
    }

    // -*- Recherche d'élément -*-
    if(arraylist.contains("Alberto")){
        println("Nom trouvé !")
    }else{
        println("Nom introuvable.")
    }
}