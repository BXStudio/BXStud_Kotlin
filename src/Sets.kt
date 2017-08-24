fun main(args:Array<String>){
    println("-*- Set1 -*-")
    var set1 = setOf("Romain","Warren","Thomas")
    // Set ne répète pas la même valeur
    // set.add("Alberto") // <- incorrect
    for(elem in set1){
        print(elem.split(" "))
    }

    println("\n-*- Set2 -*-")
    var set2 = mutableSetOf(1,2,3,4,5,6,6)
    // On peut ajouter des éléments
    set2.remove(4)
    // Et même en ajouter !
    set2.add(48)
    for(elem in set2){
        println(elem)
    }
}