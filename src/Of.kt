fun main(args:Array<String>){
    var map= hashMapOf(1 to "Romain", 2 to "Thomas", 3 to "Warren")
    map.put(4, "Alberto") //Ajout d'un autre élément
    // Affichage du résultat
    println(map.get(1))
    println(map[1])

    var array = arrayOf(2,4,6,8)
    println(array[1])

    var list = listOf(3,5,7,9)
    println("Affichage d'une valeur" + list[3]+ ".")

    println("-*- Affichage de toutes les valeurs -*-")
    var compt= -1
    for(elem in list){
        compt++
        println("list[$compt]=" + elem)
    }
    // Il n'est pas possible de mettre à jour une listOf: list[0]=1 <- incorrect
    // Pour cela, il est possible de le faire avec une mutableListOf
    var list2 = mutableListOf(4,5,6,7)
    list2[0]=1
    println("list2[0]= " + list2[0])
}