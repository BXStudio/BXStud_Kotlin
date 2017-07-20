fun main(args:Array<String>){
    println("-*- Set1 -*-")
    var set = setOf("Romain","Warren","Thomas")
    // Set ne répète pas les nombres
    // set.add("Alberto") <- incorrect
    for(elem in set){
        print(elem.split(" "))
    }


    println("\n-*- Set2 -*-")
    var set2 = mutableSetOf(1,2,3,4,5,6,6)
    // On peut ajouter des éléments
    set2.add(7)
    for(elem in set2){
        println(elem)
    }
}