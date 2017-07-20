fun main(args:Array<String>){

    var arraylist= ArrayList<String>()
    // --> Le tableau n'est pas soumis à une taille fixe <--
    arraylist.add("Romain") // 0
    arraylist.add("Alberto") // 1
    arraylist.add("Waren") // 2
    arraylist.add("Thomas") // 3

    println(" Le premier coureur s'appelle " + arraylist.get(0)+ ".")
    // On associe à la case 0 un nouveau nom
    arraylist.set(0, "Romain Bardet")
    println("Les autre sont :")
    for(coureurs in arraylist){
        print(coureurs.split(" "))
    }

    // Recherche d'élément
    if(arraylist.contains("Alberto")){
        println("\nNom trouvé !")
    }else{
        println("\nNom introuvable.")
    }
}